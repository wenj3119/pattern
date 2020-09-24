package com.study.pattern.flyweight.jdk;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);//true
        String s3 = "he" + "llo";
        System.out.println(s1 == s3);//true

        String s4 = "he" + new String("llo");
        System.out.println(s1 == s4);//false
        String s5 = new String("hello");
        System.out.println(s1 == s5);//false
        String s6 = s5.intern();
        System.out.println(s1 == s6);//true
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;
        System.out.println(s1 == s9);//false
        String s10 = s9.intern();
        System.out.println(s1 == s10);
    }
}
