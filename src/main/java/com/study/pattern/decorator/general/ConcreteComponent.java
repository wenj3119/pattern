package com.study.pattern.decorator.general;

/**
 * @Author wenjun
 * @Date 2020/9/23
 * @Description
 */
public class ConcreteComponent extends Component{
    @Override
    void operation() {
        System.out.println("我是第二级");
    }
}
