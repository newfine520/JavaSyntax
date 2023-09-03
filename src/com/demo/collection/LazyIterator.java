package com.demo.collection;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class LazyIterator<T> implements Iterable<T> {

    private final ValueLoader<T> valueLoader;
    private final int batchSize;
    private long offset = 0L;
    private List<T> currentBatch = null;

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    public LazyIterator(ValueLoader<T> valueLoader, int batchSize) {
        this.valueLoader = valueLoader;
        this.batchSize = batchSize;
    }

    private class Itr implements Iterator<T> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if (currentBatch == null || index >= currentBatch.size()) {
                currentBatch = valueLoader.load(offset, batchSize);
                if (currentBatch == null) {
                    return false;
                }
                offset += currentBatch.size();
                index = 0;
            }
            return true;
        }


        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return currentBatch.get(index++);
        }
    }
}

