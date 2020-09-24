package com.study.pattern.composite.demo.transparent;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Course extends CourseComponent{
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CourseComponent component) {
        return this.name;
    }

    @Override
    public double getPrice(CourseComponent component) {
        return this.price;
    }

    @Override
    public void print() {
       System.out.println(name + ",价格: " + price + "元");
    }
}
