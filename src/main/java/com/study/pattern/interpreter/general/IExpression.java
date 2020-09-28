package com.study.pattern.interpreter.general;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public interface IExpression {
    Object interpret(Context context);
}
