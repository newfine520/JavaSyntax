package com.demo.thread;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureTest {
    public static final ExecutorService service = Executors.newCachedThreadPool();
    public static void main(String[] args) throws ExecutionException, InterruptedException  {
        //1
        //FutureTest.GetThreeNums();
        //2
        System.out.println(new FutureTest().TestMyNode().val+" "+new FutureTest().TestMyNode().next.val+" "+new FutureTest().TestMyNode().next.next.val+" "+new FutureTest().TestMyNode().next.next.next.val+" "+new FutureTest().TestMyNode().next.next.next.next.val);
        //3
        List<StudentScore> studentScores=new ArrayList<>();
        List<FilterScore> filterScores=new ArrayList<>();
        FutureTest.GetStudentName(studentScores,filterScores);
    }
        public static Integer GetThreeNums() throws ExecutionException, InterruptedException
        {
            long start =System.currentTimeMillis();
            Integer firstResult=0;
            Integer secondResult=0;
            Integer thirdResult=0;

            //任务1
            Future<Integer> firstTask = service.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return new AService().get();
                }
            });

            //任务2
            Future<Integer> sencondTask = service.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return new BService().get();
                }
            });

            //任务3
            Future<Integer> thirdTask = service.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return new CService().get();
                }
            });

            if (firstTask.isDone() && !firstTask.isCancelled()) {
                firstResult = firstTask.get();
            }


            if (sencondTask.isDone() && !sencondTask.isCancelled()) {
                secondResult = sencondTask.get();
            }

            if (thirdTask.isDone() && !thirdTask.isCancelled()) {
                thirdResult = thirdTask.get();
            }

            Integer result=firstResult+secondResult+thirdResult;
            //执行时间
            System.err.println("time:" + (System.currentTimeMillis() - start));
            return result;
        }
        public static List<String> GetStudentName(List<StudentScore> studentScores,List<FilterScore> filterScores)
        {
            List<String> names=new ArrayList<>();
            for(StudentScore studentScore:studentScores)
            {
                Boolean flag=true;
                for(FilterScore filterScore:filterScores) {
                    if(studentScore.getCourse().equals(filterScore.getCourse())&&studentScore.getScore()>=filterScore.getScore())
                    {
                        flag=true;
                    }
                    else
                    {
                        flag=false;
                    }
                }
                if(flag)
                {
                    names.add(studentScore.getName());
                }
            }
         return names;
        }
        public MyListNode getMyNode(MyListNode l1,MyListNode l2,MyListNode l3)
        {

            if(l1!=null&&l1.next!=null)
            {
                l3.next=new MyListNode();
                l3.next.val=l1.next.val-l2.next.val;
                 getMyNode(l1.next,l2.next,l3.next);
            }
            return l3;
        }
        public ListNode TestMyNode()
        {
            ListNode l1=new ListNode(9);
            l1.next=new ListNode(8);
            l1.next.next=new ListNode(7);
            l1.next.next.next=new ListNode(9);
            l1.next.next.next.next=new ListNode(6);

            ListNode l2=new ListNode(5);
            l2.next=new ListNode(1);
            l2.next.next=new ListNode(2);
            l2.next.next.next=new ListNode(8);
            l2.next.next.next.next=new ListNode(2);

            return new FutureTest().subtract(l1,l2);
        }
    public ListNode subtract(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int borrow = 0;

        while (l1 != null && l2 != null) {
            int diff = l1.val - l2.val - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            curr.next = new ListNode(diff);
            curr = curr.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int diff = l1.val - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            curr.next = new ListNode(diff);
            curr = curr.next;

            l1 = l1.next;
        }

        return dummy.next;
    }

    static class AService {
        public Integer get() {
            Random random = new Random();
            return random.nextInt(100);
        }
    }

   static   class BService {
        public Integer get() {
            Random random = new Random();
            return random.nextInt(100);
        }
    }

   static   class CService {
        public  Integer get() {
            Random random = new Random();
            return random.nextInt(100);
        }
    }
    public class StudentScore
    {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        private String name;
        private String course;
        private Integer score;
    }
    public class FilterScore
    {
        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        private String course;

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        private Integer score;
    }
    public static class MyListNode
    {
        int val;
        MyListNode next;

//        public ListNode(int x)
//        {
//            val=x;
//        }
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
