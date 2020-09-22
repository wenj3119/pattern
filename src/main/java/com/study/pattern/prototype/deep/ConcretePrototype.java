package com.study.pattern.prototype.deep;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class ConcretePrototype implements Cloneable ,Serializable{
    private int age;
    private String name;
    private List<String> hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    private static ConcretePrototype instance = new ConcretePrototype();
    private ConcretePrototype(){
    }
    public static ConcretePrototype getInstance(){
        return instance;
    }

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ConcretePrototype deepClone(){
        ConcretePrototype concretePrototype = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            concretePrototype = (ConcretePrototype)ois.readObject();
            ois.close();
            bis.close();
            oos.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return concretePrototype;
    }
    public ConcretePrototype deepCloneObject(){
        ConcretePrototype concretePrototype = null;
        try {
            ConcretePrototype clone = (ConcretePrototype)super.clone();
            clone.hobbies = (List)((ArrayList)clone.hobbies).clone();
            concretePrototype = clone;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return concretePrototype;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
