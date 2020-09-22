package com.study.lambda;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class Java8Tester {
    static String salutation = "Hello";
    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();
        //类型声明
        MathOperation addition = (int a, int b)->a + b;
        //不用类型声明
        MathOperation subtraction = (a,b) -> a-b;
        //大括号的返回语句
        MathOperation multiplication = (int a ,int b) ->{return a * b;};
        //没有大括号及返回语句
        MathOperation division = (int a,int b) -> a/b;
        System.out.println("10 + 5 = " + tester.operate(10,5,addition));
        System.out.println("10 - 5 =" + tester.operate(10,5,subtraction));
        System.out.println("10 * 5 = " + tester.operate(10,5,multiplication));
        System.out.println("10 / 5 = " + tester.operate(10,5,division));

        //不用括号
        GreetingService greetingService = message ->
                System.out.println(salutation + message);
        salutation = "skdfj ";
        //用括号
        GreetingService greetingService1 = (message) ->
                System.out.println("Hello " + message);
        greetingService.sayMessage("Runoob");
        greetingService1.sayMessage("Google");
        final int num = 1;
        Converter<Integer,String> s = (param) ->
                System.out.println(String.valueOf(param + num));
        s.convert(2);


    }
    interface  MathOperation{
        int operation(int a,int b);
    }
    interface GreetingService{
        void sayMessage(String message);
    }
    public interface Converter<T1,T2>{
        void convert(int i);
    }
    private int operate(int a ,int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
