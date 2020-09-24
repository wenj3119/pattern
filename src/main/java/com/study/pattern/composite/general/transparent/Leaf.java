package com.study.pattern.composite.general.transparent;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return null;
    }
}
