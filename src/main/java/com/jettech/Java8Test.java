package com.jettech;

import java.util.*;

public class Java8Test {


    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("Google");
        names1.add("Runoob");
        names1.add("taobao");
        names1.add("baidu");
        names1.add("sina");
        List<String> names2 = new ArrayList<String>();
        names2.add("Google");
        names2.add("Runoob");
        names2.add("taobao");
        names2.add("baidu");
        names2.add("sina");
        Java8Test test = new Java8Test();
        System.out.println("使用JAVA7语法：");
        // todo
        test.sortUsingJava7(names1);
        System.out.println(names1);
        System.out.println("使用JAVA8语法：");
        test.sortUsingJava8(names2);
        System.out.println(names2);
    }

    public  void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);

            }
        });
    }

    public void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
