package com.jettech;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Java8Date {

    private String name;



    public static void main(String[] args) {
        Java8Date java8Date = new Java8Date();
        java8Date.testLocalDateTime();
    }
    public void testLocalDateTime(){
        //获取当前的日期时间
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间："+currentTime);

        //当前日期
        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1:"+date1);
        Month month = currentTime.getMonth();
        int year = currentTime.getDayOfYear();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();
        System.out.println("年："+year+",月："+month+"，日："+day+",秒："+seconds);

        LocalDateTime date2 =currentTime.withMonth(12).withYear(2012);
        System.out.println("date2:"+date2);

        //当前时间
        LocalTime date6 = currentTime.toLocalTime();
        System.out.println("date6:"+date6);

        //12 12 2014
        LocalDate date3 = LocalDate.of(2014,Month.MARCH,12);
        System.out.println("date3:"+date3);

        //日期转换为字符串
        String string2 = date3.toString();
        System.out.println("string2:"+string2);

        //22时15分钟
        LocalTime date4 = LocalTime.of(22,15);
        System.out.println("date4:"+date4);

        //解析字符串
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5:"+date5);

        //时间转换为字符串
        String string1 = date5.toString();
        System.out.println("string1："+string1);
        throw new NullPointerException();

    }


}
