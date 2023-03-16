package com.demo;

import sun.nio.ch.sctp.SctpNet;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class AlgorithmProblem {
    static public void main(String[] args)
    {
        /**
         * 202210211523
         *以下程序从键盘输入一个正整数，然后将该正整数的各位数字反序输出。例如，当 输入正整数123时，程序输出321。
         */
//         int i,j;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("输入一个正整数：");
//         i=sc.nextInt();
//         while(i!=0)
//         {
//             j=i%10;
//             System.out.print(j);
//             i/=10;
//         }


        /**
         * 202210211528
         * 以下程序从键盘输入1至9之间的一个整数a,计算从一个a到a个a的和s并输出。例如，当a=5时，s=5+55+555+5555+55555.
         */
//        int a,s=0,r=0;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("输入1～9间的一个整数：");
//        a=sc.nextInt();
//        for(int i=1;i<=a;i++)
//        {
//            r=r*10+a;
//            s=s+r;
//        }
//        System.out.println("和为："+s);


        /**
         * 202210211637
         * 编写方法voidmyPrint(int n)，打印三角形图案。如当n=5时，将打印如下的图案。
         *      *****
         *       ****
         *        ***
         *         **
         *          *
         */
        //new AlgorithmProblem().myPrint(5);

        /**
         * 202301281806
         * 有N个单词和字符串T，按字典序输出以字符串T为前缀的所有单词。
         */
//        Scanner scan=new Scanner(System.in);
//        String str_0=scan.nextLine().trim();
//        int N=Integer.parseInt(str_0);
//
//        ArrayList<String> vec=new ArrayList<>();
//        for(int i=0;i<N;i++)
//        {
//            String str_1=scan.nextLine().trim();
//            vec.add(str_1);
//        }
//
//        String str_2=scan.nextLine().trim();
//        String T=str_2;
//        scan.close();
//
//        ArrayList<String> result=solution(N,vec,T);
//
//        for(int i=0;i<result.size();i++)
//        {
//            System.out.println(result.get(i));
//        }

        /**
         * 202301281836
         * 连续子数组的最大和：给定一个整数数组nums，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
         */
//        Scanner scan=new Scanner(System.in);
//        String str_0=scan.nextLine().trim();
//        int n=Integer.parseInt(str_0);
//
//        String str_1=scan.nextLine();
//        String[] line_list_1=str_1.trim().split(" ");
//        ArrayList<Integer> arr=new ArrayList<>();
//        for(int i=0;i<line_list_1.length;i++)
//        {
//            arr.add(Integer.parseInt(line_list_1[i]));
//        }
//
//        scan.close();
//        int result=arrMaxSumSolution(n,arr);
//        System.out.println(result);

        /**
         * 202302231039
         * 最优利润值：你在读的经营课程上，老师布置了一道作业。在一家公司的日常运营中，是会对一些商品的价格走势根据一些经验和数据
         * 进行预估，并据此进行决策。例如，假设某商品每天的价格都有可能变动，我们要做的就是低买高卖获得最高利润。比如
         * 假设我们预估该商品接下来七天内的价格走势如下： 4 1 2 3 6 4 8 那我们采取的最佳策略是在价格1块钱的时候买入，在
         * 价格8块钱的时候卖出。为了简化整个过程，我们限定在此周期内只能有一次买入一次卖出，且商品在没有购入前是无法
         * 卖出的，即该商品不是期货而是现货。 现要求你用程序来实现自动决策。输入一定天数的商品预估价格，自动计算出最优
         * 利润值。例如，上面的例子中，最优利润值为8-1=7。（简单起见，只考虑0-100000之间的整数价格）
         */
//          Scanner scan=new Scanner(System.in);
//
//          String str_0=scan.nextLine();
//          String[] line_list_0=str_0.trim().split(" ");
//          ArrayList<Integer> arr=new ArrayList<>();
//          for(int i=0;i<line_list_0.length;i++)
//          {
//              arr.add(Integer.parseInt(line_list_0[i]));
//          }
//          scan.close();
//          int result=optimalProfitValueSolution(arr);
//          System.out.println(result);


        /**
         * 202302231105
         * 开学趣闻之美食诱惑:小艺酱又开学了，可是在上学的路上总会又各种意想不到的美食诱惑让小艺酱迟到。 假设小艺酱家到学校是一个n*n的矩
         * 阵。 每个格子包含一个诱惑值p，诱惑着小艺，让她迟到。 小艺位于矩阵的左上角，学校在矩阵的右下角落。 小艺想知道
         * 自己到达学校所要经历的最小诱惑值是？
         */
//          Scanner scan=new Scanner(System.in);
//
//          String str_0=scan.nextLine().trim();
//          int n=Integer.parseInt(str_0);
//
//          ArrayList<ArrayList<Integer>> vector=new ArrayList<>();
//          for(int i=0;i<n;i++)
//          {
//              String str_1=scan.nextLine();
//              String[] line_list_1=str_1.trim().split(" ");
//              ArrayList<Integer> temp_1=new ArrayList<>();
//              for(int j=0;j<line_list_1.length;j++)
//              {
//                  temp_1.add(Integer.parseInt(line_list_1[j]));
//              }
//              vector.add(temp_1);
//          }
//          scan.close();
//          int result=getMinPathSumSolution(n,vector);
//          System.out.println(result);


        /**
         * 202302231136
         *最大回文串：回文串是一个正读和反读都一样的字符串，已知字符串str。 输出字符串str中最长回文串的长度
         */
//        Scanner scan = new Scanner(System.in);
//        String str_0 = scan.nextLine().trim();
//        String s = str_0;
//        scan.close();
//        String result = longestPalindromeSolution(s);
//        System.out.println(result);
//        System.out.println(result.length());


         /**
         *202302231226
          * 背包问题：第一行输入整数v和n,分别代表肚子容量上限，和零食种类数(1<=v,n<=1000)
          * 以下n行每行包含两个整数，代表每种零食占据肚子空间a和甜蜜值b.(1<=a,b<=1000)
          *  输出描述：
          *  最大甜蜜值
         */
//        Scanner scan = new Scanner(System.in);
//        String str_0 = scan.nextLine();
//        String[] line_list_0 = str_0.trim().split(" ");
//
//        int v = Integer.parseInt(line_list_0[0]);
//        int n = Integer.parseInt(line_list_0[1]);
//        int[] varr=new int[n];
//        int[] tarr=new int[n];
//        for(int i = 0; i < n; i++){
//            String str_2 = scan.nextLine();
//            String[] line_list_2 = str_2.trim().split(" ");
//            varr[i]=Integer.parseInt(line_list_2[0]);
//            tarr[i]=Integer.parseInt(line_list_2[1]);
//        }
//        scan.close();
//        int result = tianMiSolution(varr,tarr,v, n);
//        System.out.println(result);
    }
    public void myPrint(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
                System.out.print(" ");
            for(int k=0;k<n-i;k++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static ArrayList<String> solution(int N,ArrayList<String> vec,String T)
    {
        ArrayList<String> result=new ArrayList<>();
        Collections.sort(vec);//Collections.sort(vec)可以直接对vec排序
        for(String str:vec)
        {
            if(str.startsWith(T))
            {
                result.add(str);
            }
        }
        return result;
    }
    public  static int arrMaxSumSolution(int n,ArrayList<Integer> arr)
    {
        int result=0;
        if(arr.size()==1)
        {
            return arr.get(0);
        }
        ArrayList<Integer> dp=new ArrayList<>();
        dp.add(arr.get(0));
        for(int i=1;i<arr.size();i++)
        {
            if(dp.get(i-1)>0)
            {
                Integer tem=dp.get(i-1)+arr.get(i);
                dp.add(tem);
            }
            else
            {
                dp.add(arr.get(i));
            }
        }
        result=dp.get(0);
        for(int i=1;i<dp.size();i++)
        {
            if(dp.get(i)>result)
            {
                result=dp.get(i);
            }
        }
        return result;
    }
    public static int optimalProfitValueSolution(ArrayList<Integer> arr)
    {
        if(arr==null||arr.size()<2) return 0;
        int[] dp=new int[2];
        dp[0]=-arr.get(0);
        dp[1]=0;
        for(int i=1;i<arr.size();i++)
        {
            //Math.max的使用是关键
            dp[0]=Math.max(-arr.get(i),dp[0]);
            dp[1]=Math.max(dp[0]+arr.get(i),dp[1]);
        }
        return dp[1];
    }
    public static int getMinPathSumSolution(int n,ArrayList<ArrayList<Integer>> vector)
    {
        int[][] arr=new int[vector.size()][vector.get(0).size()];
        int tmp=0;
        for(int i=vector.size()-1;i>=0;i--)
        {
           for(int j=vector.get(0).size()-1;j>=0;j--)
           {
               if(i==vector.size()-1)
               {
                   tmp+=vector.get(i).get(j);
                   arr[i][j]=tmp;
               }
               else if(j==vector.get(0).size()-1)
               {
                   if(i==vector.size()-2)
                   {
                       tmp=arr[i+1][j];
                   }
                   tmp+=vector.get(i).get(j);
                   arr[i][j]=tmp;
               }
               else
               {
                   arr[i][j]=Math.min(arr[i+1][j],arr[i][j+1])+vector.get(i).get(j);
               }
           }
        }
        return arr[0][0];
    }
    public static String longestPalindromeSolution(String s)
    {
        if(s==null||s.length()<1)
        {
            return "";
        }
        int start=0,end=0;
        for(int i=0;i<s.length();i++)
        {
            int len1=expandAroundCenter(s,i,i);
            int len2=expandAroundCenter(s,i,i+1);

            int len=Math.max(len1,len2);
            if(len>end-start)
            {
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public static int expandAroundCenter(String s,int left,int right)
    {
        int L=left,R=right;
        while (L>=0&&R<s.length()&&s.charAt(L)==s.charAt(R))
        {
            L--;
            R++;
        }
        return (R-1)-(L+1)+1;
    }
    public static int tianMiSolution(int[] varr,int[] tarr,int v,int n) {
             int maxm=1000;
                 int k=0;
                 int tianmi=0;
                 int[] f=new int[maxm];
         //        int[] c=new int[maxm];
         //        int[] w=new int[maxm];
                 for(int i=0;i<n;i++) {
                         for(k=varr[i];k<=v;k++)
                                 f[k]=Math.max(f[k-varr[i]]+tarr[i],f[k]);
                     }
                 tianmi=f[v];
                 return tianmi;
             }
}
