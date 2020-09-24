package com.study.pattern.composite.demo.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class CoursePage extends CourseComponent{
    private List<CourseComponent> itmes = new ArrayList<>();
    private String name;
    private Integer level;

    public CoursePage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(CourseComponent component) {
        itmes.add(component);
    }

    @Override
    public void removeChild(CourseComponent component) {
        itmes.remove(component);
    }

    @Override
    public String getName(CourseComponent component) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for(CourseComponent component1 : itmes){
            if(this.level != null){
                for(int i = 0; i < this.level; i ++){
                    System.out.print("   ");
                }
                for(int i = 0 ; i < this.level; i ++){
                    if(i == 0){
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            component1.print();
        }
    }
}
