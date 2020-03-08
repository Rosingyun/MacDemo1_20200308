package com.jettech;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8Predicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        // Predicate<Integer> predicate = n -> true
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // n 如果存在则 test 方法返回 true
        System.out.println("输出所有数据：");
        //传递参数n
        evil(list,n->true);
        // Predicate<Integer> predicate1 = n -> n%2 == 0
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n%2 为 0 test 方法返回 true
        System.out.println("输出所有偶数：");
        evil(list,n->n%2==0);
        // Predicate<Integer> predicate2 = n -> n > 3
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n 大于 3 test 方法返回 true
        System.out.println("输出大于3的数：");
        evil(list,n->n>3);
    }
    //Predicate <T> 接口是一个函数式接口，它接受一个输入参数 T，返回一个布尔值结果。
    public static void evil(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.println(n + " ");
            }
        }

    }
}
