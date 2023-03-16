package com.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {
    public static  String getYesterdayDate()
    {
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DATE,-1);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(cal.getTime());
    }
}
