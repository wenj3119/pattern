package com.study.pattern.decorator.general;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class ConcreteDecoratorB extends Decorator{
    /**
     * 构造方法，传入组件对象
     *
     * @param component
     */
    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    private void operationFirst(){
        System.out.println("执行前操作B");
    };//在调用父类的operation方法之前需要执行的操作
    private void operationLast(){
        System.out.println("执行后操作B");
    };//在调用父类的operation方法之后需要执行的操作

    public void operation(){
        //调用父类的方法，可以在调用前后执行一些附加动作
        operationFirst();//添加的功能
        super.operation();//这里可以选择性的调用父类的方法，如果不调用则相当于完全改写了方法，
        operationLast();//添加的功能
    }
}
