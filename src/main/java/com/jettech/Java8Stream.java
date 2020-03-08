package com.jettech;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Stream {
    public static void main(String[] args) {
        System.out.println("使用JAVA7：");
        List<String> strings = Arrays.asList("abc","","bc","efg","","abdg");
        System.out.println("列表为："+strings);
        //计算空字符串的数量
        long count = getEmptyCountUsingByJava7(strings);
        System.out.println("空字符串的数量为："+count);
        //字符串长度为3的数量
        count = getThreeLengthCountUsingByJava7(strings);
        System.out.println("字符串长度为3的数量为："+count);
        //删除空字符串
        List<String> filtered = deleteEmptyUsingByJava7(strings);
        System.out.println("删除空字符串后的集合为："+strings);
        //删除空字符串，并使用逗号把他们合并起来
        String mergeded = getMergedStringUsingByJava7(strings,",");
        System.out.println("删除空字符串后用，将字符串合并起来："+mergeded);
        //获取列表元素的平方数
        List<Integer> numberList = Arrays.asList(3,2,3,4,5,6,6);
        System.out.println("数字列表为："+numberList);
        List<Integer> squareList = getSquareListByJava7(numberList);
        System.out.println("数字的平方数集合为："+squareList);
        List<Integer> squareList1 =Arrays.asList(4,5,6,22,34,55);
        //输出10个随机数
        System.out.println("随机数：");
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            System.out.println(random.nextInt(10));
        }
        //返回集合中最大的数
        Integer integer = getMax(squareList1);
        System.out.println("最大的数为："+ integer);
        //返回集合中最小的数
        integer = getMin(squareList1);
        System.out.println("最小的数为："+integer);
        //返回集合中数的和
        integer = getSum(squareList1);
        System.out.println("集合中数的和为："+integer);
        //返回集合中的平均数
        integer = getAverage(squareList1);
        System.out.println("集合中的平均数为："+integer);
        System.out.println("使用Java8");
        List<String> strings1 =Arrays.asList("abc","","bc","efg","","abdg");
        System.out.println("列表："+strings1);
        count = strings1.stream().filter(string1 -> string1.isEmpty()).count();
        System.out.println("空字符的数量为："+count);
        count = strings1.stream().filter(string1 -> string1.length()==3).count();
        //并行处理
        count = strings1.parallelStream().filter(string1 ->string1.isEmpty()).count();
        System.out.println("空字符串的数量为："+count);
        System.out.println("字符串长度为3的数量为："+count);
        filtered = strings1.stream().filter(string1 ->!string1.isEmpty()).collect(Collectors.toList());
        System.out.println("非空字符串的集合为："+filtered);
        mergeded = strings1.stream().filter(string1->!string1.isEmpty()).collect(Collectors.joining(","));
        System.out.println("非空字符串集合用逗号合并："+mergeded);
        System.out.println("数字集合为："+numberList);
        squareList = numberList.stream().map(i->i*i).distinct().collect(Collectors.toList());
        System.out.println("平方集合为："+squareList);
        IntSummaryStatistics stats = numberList.stream().mapToInt(x->x).summaryStatistics();
        System.out.println("列表中最大的数为："+stats.getMax());
        System.out.println("列表中最小的数为："+stats.getMin());
        System.out.println("列表中的数之和为："+stats.getSum());
        System.out.println("平均数为："+stats.getAverage());
        System.out.println("随机数为：");
        random.ints(0,10).limit(10).sorted().forEach(System.out::println);


    }
    //使用Java7返回空字符串的数量
    public static long getEmptyCountUsingByJava7(List<String> strings){
        long count = 0;
        for (String string:strings){
            if (string.isEmpty()){
                count++;
            }
        }
        return count;
    }
    //使用Java7返回字符串长度为3的数量
    public static long getThreeLengthCountUsingByJava7(List<String> strings){
        long count = 0;
        for (String string:strings){
            if (string.length()==3){
                count++;
            }
        }
        return count;
    }
    //删除空字符串
    public static List<String> deleteEmptyUsingByJava7(List<String> strings){
        List<String> newString = new ArrayList<>();
        for (String string:strings){
            if (!string.isEmpty()){
                newString.add(string);
            }
        }
        return newString;
    }
    //删除空字符串后使用逗号合并
    public static String getMergedStringUsingByJava7(List<String> strings,String separator){
        StringBuilder stringBuilder = new StringBuilder();
        for (String string:strings){
            if (!string.isEmpty()){
                stringBuilder.append(string);
                stringBuilder.append(separator);
            }
        }
        String string = stringBuilder.toString().substring(0,stringBuilder.length()-2);
        return string;
    }
    //使用Java7返回平方数的集合
    public static List<Integer> getSquareListByJava7(List<Integer> squareList){
        List<Integer> newSquareList = new ArrayList<>();
        for (Integer integer:squareList){
            if (!newSquareList.contains(integer*integer)){
                newSquareList.add(integer*integer);
            }
        }
        return newSquareList;

    }
    //使用Java7返回最大的数
    public static Integer getMax(List<Integer> integers){
        Integer integer = integers.get(0);
        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i)>integer){
                integer = integers.get(i);
            }
        }
        return integer;
    }
    //使用Java7返回最小的数
    public static Integer getMin(List<Integer> integers){
        Integer integer = integers.get(0);
        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i)<integer){
                integer = integers.get(i);
            }
        }
        return integer;
    }
    //使用java7返回所有数的和
    public static Integer getSum(List<Integer> integers){
        Integer integer = 0;
        for (Integer integer1:integers){
            integer +=integer1;
        }
        return integer;
    }
    //返回平均数
    public static Integer getAverage(List<Integer> integers){
        Integer integer = 0 ;
        integer = getSum(integers)/integers.size();
        return integer;
    }
}
