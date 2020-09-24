package com.study.pattern.composite.demo.transparent;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("======透明的组合模式==========");
        CourseComponent javaBase = new Course("Java入门课程",6300);
        CourseComponent ai = new Course("人工智能",5000);
        CourseComponent packageCourse = new CoursePage("Java架构师课程",2);
        CourseComponent design = new Course("Java设计模式",1500);
        CourseComponent source = new Course("源码分析",3000);
        CourseComponent softSkill = new Course("软技能",3000);

        packageCourse.addChild(design);
        packageCourse.addChild(source);
        packageCourse.addChild(softSkill);

        CourseComponent catalog = new CoursePage("my课程目录",1);
        catalog.addChild(javaBase);
        catalog.addChild(ai);
        catalog.addChild(packageCourse);

        catalog.print();

    }
}
