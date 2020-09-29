package com.study.pattern.visitor.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class ObjectStructure {
    private List<IElement> list = new ArrayList<>();
    {
        this.list.add(new ConcreteElementA());
        this.list.add(new ConcreteElementB());
    }
    public void accept(IVisitor visitor){
        for(IElement element: this.list){
            element.accept(visitor);
        }
    }
}
