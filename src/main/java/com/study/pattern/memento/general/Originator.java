package com.study.pattern.memento.general;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class Originator{
    private String name;

    public Originator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState() {

    }

    public Memento createMemento(){
        Memento memento = new Memento(this.name);
        return memento;
    }
    public void restoreMemento(Memento memento){
        this.name = memento.getName();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "name='" + name + '\'' +
                '}';
    }
}
