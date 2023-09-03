package com.demo.collection;

import java.util.List;

public  interface ValueLoader<T>
{
    List<T> load(long offset, int limit);
}
