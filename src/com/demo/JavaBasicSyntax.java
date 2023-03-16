package com.demo;

import jdk.nashorn.internal.parser.JSONParser;

import java.io.InputStream;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static sun.misc.Version.print;

public class JavaBasicSyntax {

    private static  int x=0,a=0;
    private static  int y=0,b=0;
    static String s;
    public static void main(String[] args) throws InterruptedException {

        //System.out.println("hello world!");
        //region出租
        /*
        远景佳苑单间短期出租4个月，2000元/月（水电煤公摊，网费35元/月）。空调、卫生间、厨房齐全，
        屋内均是IT行业人士，喜欢安静。所以要求来组着最好是同行或者刚毕业的年轻人，爱干净、安静。
        有意者电联。
        联系人：杨先生
        联系方式：请阅读代码
        */
//        int[] arr=new int[]{8,2,1,0,3};
//        int[] index=new int[]{2,0,3,2,4,0,1,3,2,3,3};
//        String tel="";
//        for(int i:index)
//        {
//            tel+=arr[i];
//        }
//        System.out.println("联系方式："+tel);
        //endregion

        //region StringBuffer和String内存使用和运行效率
//          String a="";
//          StringBuffer sb=new StringBuffer();
//          for(int i=0;i<=1000000;i++)
//          {
//              sb.append("hello");
//          }
//          a=sb.toString();
//          System.out.println(a.substring(0,6));
        //endregion

//        try
//        {
//            throw new Exception("抛出异常");
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            System.out.println("捕获异常");
//        }

        //Integer[] a=new Integer[5]{1,3,5,7,9};
//         ArrayList arrayList=new ArrayList();
//         arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(5);
//        arrayList.add(6);
//        arrayList.add(7);
//        arrayList.add(8);
//        arrayList.add(9);
//        arrayList.add(10);
//        arrayList.add(11);
//        System.out.println(arrayList.get(10));
//         arrayList.add(3);
//         arrayList.add(5);
//         arrayList.add(7);
//         arrayList.add(9);
//         System.out.println(arrayList.size());
//         //arrayList.remove(1);
//         System.out.println(arrayList.size());
//        for(int i=0;i<arrayList.size();i++)
//        {
//           System.out.println(arrayList.get(i));
//        }

//        LinkedList linkedList=new LinkedList();
//        linkedList.add(1);
//        linkedList.add(3);
//        linkedList.push(5);
//        linkedList.push(7);
//        linkedList.push(9);
        //linkedList.set(3,10);

//        for(int i=0;i<linkedList.size();i++)
//        {
//           System.out.println(linkedList.get(i));
//        }
        //System.out.println(linkedList.get(0));
//List<UserDO> strList=new ArrayList<UserDO>();
//UserDO userDo=new UserDO();
//userDo.setId(1);
//userDo.setName("张三");
//        strList.add(userDo);
//        UserDO userDo1=new UserDO();
//        userDo.setId(2);
//        userDo.setName("李四");
//        strList.add(userDo1);
//        System.out.println(userDo.toString());
//
//        strList.size();
//        ArrayList arr=new ArrayList();
//
//        Collections.sort(strList);


        //UserDO[] userDOArr=new UserDO[]{userDo1,userDo};
//        HashSet hashSet=new HashSet();
//        hashSet.add("MySql");
//        hashSet.add("SqlServer");
//        hashSet.add("Oracle");
//
//        for(Object str:hashSet)
//        {
//            System.out.println(str);
//        }

        //TreeSet treeSet=new TreeSet();
//        treeSet.add("MySql");
//        treeSet.add("SqlServer");
//        treeSet.add("Oracle");
//        for(Object str:treeSet)
//        {
//            System.out.println(str);
//        }

      /*  Hashtable hashTable=new Hashtable();
        hashTable.put("MySql","MySqlClient");
        hashTable.put("SqlServer","SqlServerClient");
        hashTable.put("Oracle","OracleClient");*/

        //System.out.println(hashTable.get("MySql"));

//        ArrayList arr=new ArrayList();
//        List list= Collections.synchronizedList(arr);

//        TreeMap treeMap=new TreeMap();
//        treeMap.put("key","888");

        //System.out.println(treeMap.get("key"));

//           HashMap hashmap=new HashMap();
//           hashmap.put("GUPAO","666");
//           System.out.println("GUPAO".hashCode());

//        System.out.println(hashmap.get("GUPAO"));


//        System.out.println(0+(0>>1));
//        //Object[] obj=Arrays.copyOf();
//
//        new ListDemo().ListTest();
//
//        Class<UserDO> userDOClass=UserDO.class;

//        UserDO userDo=new UserDO();
//        Class<?> clazz=userDo.getClass();
//        String name=clazz.getName();
//        System.out.println(name);

//          Class<?> clazz=Person.class;
//          System.out.println(clazz.getName());
//          System.out.println(clazz.getPackage());
        //System.out.println(calculateNum(105));
        //int[] arr={6,12,33,87,90,97,108,561};
        //System.out.println(getIndex(arr,97));

        //new JavaBasicSyntax().TestCompare();


//new JavaBasicSyntax().NoRepeatList();

//new ExceptionDemo().ExceptionTest();


        //new Thread(()->{System.out.println("线程");}).start();

        //new JavaBasicSyntax().getHashMapInfo();

        //new ThreadDemo1().ThreadSynchronizedTest();

        //new ThreadDemo().ThreadInterruptTest();

        // new ThreadDemo2().ThreadDemo2Test1();

        //new ListToString().ListToStringTest();

        //new ClassTest().Test();

        //equals和==
//        boolean flag="abc".equals("abc");//true
//        boolean result="abc"=="abc";//true
//        boolean strFlag=new String("abc")==new String("abc");//false
//          boolean intFlag=new Integer(1)==new Integer(1);//false

        //try catch
//       try
//        {
//           File file=new File("F.txt");
//           PrintWriter printWriter=new PrintWriter("/User/F.txt");
//       }
//
//       catch (FileNotFoundException  e)
//        {
//            System.out.println("文件不存在！");
//       }
//       catch (IOException e)
//       {
//           System.out.println("IO异常！");
//       }
//       catch (Exception e)
//       {
//           System.out.println("有异常！");
//       }
//

//       People person=new People();
//     if(null==person)
//     {
//         System.out.println("person为null");
//         return;
//     }
//     System.out.println("person不为null");


        //202208160949 start
//        String str="0,1,2,3,4,5";
//        String[] arr=str.split(",");
//        System.out.println(Arrays.toString(arr));
        //202208160949 end


        //202208160950 start
//        /**
//         * Optional判null
//         */
//        Optional<Object> o1=Optional.ofNullable(null);
//        o1.ifPresent(s->System.out.println(s));
//
//        Optional<Object> o2=Optional.ofNullable(null);
//        if(o2.isPresent())
//        {
//            System.out.println("1111");
//        }
        //202208160950 end

        //202208151707 start
//        /**
//         * 线程中断
//         */
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.prinln("启动一个线程！");
//            }
//        });
//        thread.start();
//        thread.interrupt();
//        if(thread.isInterrupted())
//        {
//          System.out.println("线程中断！");
//        }
        //202208151707 end


        //202208151731 start
//        int i=10;
//        i=i++;
//        System.out.println(i);
        //202208151731 end


//202208161049 start
//        String threadName = Thread.currentThread().getName();
//        System.out.println(threadName + " start.");
//        ThreadJoinExampleTwo bt = new ThreadJoinExampleTwo();
//        ThreadJoinExampleOne at = new ThreadJoinExampleOne(bt);
//        try {
//            bt.start();
//            Thread.sleep(2000);
//            at.start();
//            at.join();
//        } catch (Exception e) {
//            System.out.println("Exception from main");
//        }
//        System.out.println(threadName + " end!");
//202208161049 end


        //202208161050 start
        /**
         * join的使用：保证线程按顺序执行
         */
//        String threadName = Thread.currentThread().getName();
//        System.out.println(threadName + " start.");
//        ThreadJoinExampleTwo bt = new ThreadJoinExampleTwo();
//        ThreadJoinExampleOne at = new ThreadJoinExampleOne(bt);
//        try {
//            bt.start();
//            Thread.sleep(2000);
//            at.start();
//            //at.join();
//        } catch (Exception e) {
//            System.out.println("Exception from main");
//        }
//        System.out.println(threadName + " end!");
        //202208161050 end

        //202208241753 thread通讯 start
//        Res res=new Res();
//        res.setFlag(false);
//        ThreadWaitNotifyExampleOne threadWaitNotifyExampleOne=new ThreadWaitNotifyExampleOne(res);
//        ThreadWaitNotifyExampleTwo threadWaitNotifyExampleTwo=new ThreadWaitNotifyExampleTwo(res);
//        threadWaitNotifyExampleOne.start();
//        threadWaitNotifyExampleTwo.start();
        //202208241753 end

        //202210161330 转义字符\u0061、\141 start
        //String str = "\u0061\u0022\u002b\u0028\u006e\u0065\u0077\u0020\u006a\u0061\u0076\u0061\u002e\u0075\u0074\u0069\u006c\u002e\u0063\u006f\u006e\u0063\u0075\u0072\u0072\u0065\u006e\u0074\u002e\u0043\u0061\u006c\u006c\u0061\u0062\u006c\u0065<\u0056\u006f\u0069\u0064>\u0028\u0029\u007b\u0070\u0075\u0062\u006c\u0069\u0063\u0020\u0056\u006f\u0069\u0064\u0020\u0063\u0061\u006c\u006c\u0028\u0029\u007b\u0074\u0068\u0072\u006f\u0077\u0020\u006e\u0065\u0077\u0020\u0052\u0075\u006e\u0074\u0069\u006d\u0065\u0045\u0078\u0063\u0065\u0070\u0074\u0069\u006f\u006e\u0028\u0022\u0073\u0075\u0070\u0072\u0069\u0073\u0065\u0020\u006d\u006f\u0074\u0068\u0065\u0072\u0020\u0066\u0075\u0063\u006b\u0065\u0072\u0021\u0022\u0029\u003b\u007d\u007d\u0029\u002e\u0063\u0061\u006c\u006c\u0028\u0029\u002b\u0022";
//        String str="\141";
//        System.out.println(str);
//          String str1="\u0061";
//          System.out.println(str1);
        //202210161330 end

        //202210161552 =与--执行顺序 start
//        int i=6;
//        int j;
//        j=i--;
//        System.out.println(i);//5
//        System.out.println(j);//6
        //202210161552 end

        //202210171046 start
//        char[] charArray=new char[5];
//        for(int i=0;i<charArray.length;i++)
//        {
//            System.out.println(charArray[i]);
//        }
        //202210171046 end


        //202210191022 Scanner输入输出 start
//        String message;
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter a line of text:");
//        message=scan.nextLine();
//        System.out.println("You entered:\'"+message+"\'");
        //202210191022 Scanner输入输出 end


        //202210211816 i++ start
//         int intArray[]={2,4,6,8};
//         int result=1,i=1;
//         while (i<3) result=result*intArray[i++];
//         System.out.println(result);//24
        //202210211816 end

       //202210251446 start
//       System.out.println("Java"==(new String("Java")));
//       System.out.println("Java".equals(new String("Java")));
       //202210251446 end

        //20221130 start

        //20221130 end

        //20221219 String初始值（Java类变量有默认值，可以不初始化；但成员变量必须初始化） start
        //String s;
        //System.out.println("s="+s);//由于s没有初始化，所以编译不能通过
        //20221219 end


        //20230128 start

        //20230128 end
    }



    public void TestCompare()
    {
        Student student=new Student("张三",18);
        Student student1=new Student("李四",21);
        Student student2=new Student("王五",36);
        Student student3=new Student("赵六",15);
        Student student4=new Student("沈七",15);
        Student student5=new Student("钱八",15);
        Student student6=new Student("倪九",15);
        Student student7=new Student("高十",15);
        List<Student> stuList=new ArrayList<>();
        stuList.add(student);
        stuList.add(student1);
        stuList.add(student2);
        stuList.add(student3);
        stuList.add(student4);
        stuList.add(student5);
        stuList.add(student6);
        stuList.add(student7);

        stuList.sort(Comparator.comparing(Student::getAge).reversed());

        for(Student stu:stuList)
        {
            System.out.println(stu+"年龄："+stu.getAge());
        }
    }

    public class Student{
        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public Integer getAge() {
            return Age;
        }

        public void setAge(Integer age) {
            Age = age;
        }

        private String Name;
        private Integer Age;
        public Student(String name,Integer age)
        {
            Name=name;
            Age=age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;

            if (Name != null ? !Name.equals(student.Name) : student.Name != null) return false;
            return Age != null ? Age.equals(student.Age) : student.Age == null;
        }

        @Override
        public int hashCode() {
            int result = Name != null ? Name.hashCode() : 0;
            result = 31 * result + (Age != null ? Age.hashCode() : 0);
            return result;
        }
    }
    public void NoRepeatList()
    {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(5);


//      List<Integer> tempList=new ArrayList<>();
//      for(Integer i:list)
//      {
//            if(!tempList.contains(i))
//            {
//                tempList.add(i);
//            }
//      }
//
        //List<Integer> a=new ArrayList<>(list);
//        HashSet<Integer> set =new HashSet<>(list);
//        List<Integer> tempList=new ArrayList<>(set);

       //List<Integer> tempList = list.stream().distinct().collect(Collectors.toList());

        //System.out.println(tempList);



    }


    public  void getHashMapInfo()
    {
        HashMap<Student,String> hm=new HashMap<Student,String>();
        hm.put(new Student("张三",21),"上海");
        hm.put(new Student("李四",23),"北京");
        hm.put(new Student("王五",28),"杭州");
        hm.put(new Student("王五",28),"哈尔滨");

        //1、keySet取出
         Set<Student> keySet=hm.keySet();
       for(Iterator<Student> it=keySet.iterator();it.hasNext();)
         for(Student s:keySet)
         {
            //Student s=it.next();
            System.out.println(s.getName()+" "+s.getAge()+" "+hm.get(s));
         }

        //2、EntrySet
//        Set<Map.Entry<Student,String>> entrySet=hm.entrySet();
//        //for(Iterator<Map.Entry<Student,String>> iter=entrySet.iterator();iter.hasNext();)
//        for(Map.Entry<Student,String> en:entrySet)
//        {
//            //Map.Entry<Student,String> en=iter.next();
//            Student s=en.getKey();
//            String address=en.getValue();
//            System.out.println(s.getName()+" "+s.getAge()+" "+address);
//
//        }
    }
    public static int  calculateNum(int num)
    {
        if(num<=1) return 1;
        else return num*calculateNum(num-1);
    }
    public static int getIndex(int[] arr, int value) {
           for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                     return i;//字符串时，换为 equals
                              }
                  }
                    return -1;//如果未找到返回-1
        }
        }
