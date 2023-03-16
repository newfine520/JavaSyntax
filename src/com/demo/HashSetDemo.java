package com.demo;

import java.util.*;

public class HashSetDemo {


    public  void HashSetTest()
    {
        Set<Integer> userSet=new HashSet<>();
        List<UserDO> userDoList=new ArrayList<>();
        int userSize=userDoList.size();
        for (UserDO userDo:userDoList)
        {
            userSet.add(userDo.getId());
        }

        //HashSet时间复杂度微O（1）
    }
}
  class UserDO{
    private int Id;

      public String getName() {
          return Name;
      }

      public void setName(String name) {
          Name = name;
      }

      private String Name;
      public int getId() {
          return Id;
      }

      public void setId(int id) {
          Id = id;
      }
  }
