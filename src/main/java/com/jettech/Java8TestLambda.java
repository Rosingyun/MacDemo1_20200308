package com.jettech;



public class Java8TestLambda {
    public static void main(String[] args) {
        Java8TestLambda java8TestLambda = new Java8TestLambda();
        //类型声明
        MathOperation addition = (int a,int b) -> a+b;
        //不用声明类型
        MathOperation subtraction = (a,b) -> a-b;
        //大括号中的返回语句
        MathOperation muitiplication = (int a,int b) -> {return a*b;};
        //没有大括号
        MathOperation division = (int a,int b) -> a/b;

        System.out.println("10 + 5 = " + java8TestLambda.operate(10,5,addition));
        System.out.println("10 + 6 = " + addition.operation(10,6));
        System.out.println("10 - 5 = " + subtraction.operation(10,5));
        System.out.println("10 * 5 = " + muitiplication.operation(10,5));
        System.out.println("10 / 5 = " + division.operation(10,5));

        //不用括号
        GreetingService greetingService1 = message -> System.out.println("Hello" + message);
        greetingService1.sayMeaasge("Runoob");
        GreetingService greetingService2 = (message) -> System.out.println("Hello" + message);
        greetingService2.sayMeaasge("Google");


    }



    interface MathOperation{
        int operation(int a,int b);
    }
    interface GreetingService{
        void sayMeaasge(String message);
    }
    private int operate(int a,int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
