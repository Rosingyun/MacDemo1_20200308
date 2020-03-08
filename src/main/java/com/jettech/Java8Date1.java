package com.jettech;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java8Date1 {
    public static void main(String[] args) {
        Java8Date1 java8Date1 = new Java8Date1();
        java8Date1.testZoneDateTime();
    }
    public void testZoneDateTime(){
        ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println("date1:"+date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId:"+id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("当前时区："+currentZone);
        
    }
}
