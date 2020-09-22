package com.study.pattern.facade.general;

/**
 * @Author wenjun
 * @Date 2020/9/22
 * @Description
 */
public class Facade {
    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();
    private SubSystemC c = new SubSystemC();
    public void doA(){this.a.doA();}
    public void doB(){this.b.doB();}
    public void doC(){this.c.doC();}
}
