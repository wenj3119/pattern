package com.study.pattern.iterator.course;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Course java = new Course("Java课程");
        Course javaBase = new Course("Java晋级课程");
        Course design = new Course("设计模式");
        Course ai = new Course("人工智能");
        ICourseAggregate aggregate = new CourseAggregateImpl();
        aggregate.add(java);
        aggregate.add(javaBase);
        aggregate.add(design);
        aggregate.add(ai);

        System.out.println("============课程列表============");
        printCourse(aggregate);


        System.out.println("==============删除操作之后的课程列表================");
        printCourse(aggregate);
    }

    private static void printCourse(ICourseAggregate aggregate) {
        Iterator<Course> i = aggregate.iterator();
        while (i.hasNext()){
            Course course = i.next();
            System.out.println("<< " + course.getName() + ">>");

        }
    }
}
