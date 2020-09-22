package com.study.pattern.builder.general;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class ConcreteBuilder implements IBuilder{
    private Product product = new Product();
    @Override
    public Product build() {
        return product;
    }
}
