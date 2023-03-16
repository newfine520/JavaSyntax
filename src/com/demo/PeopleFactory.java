package com.demo;

public class PeopleFactory {
    public static People CreatePeople(String strPeople)
    {
        People people=null;
        switch (strPeople)
        {
            case"男":
                people= new Man();
                break;
            case "女":
                people=new Women();
                break;
            default:
                break;
        }
        return people;
    }
}
