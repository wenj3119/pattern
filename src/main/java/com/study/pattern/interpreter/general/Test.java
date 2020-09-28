package com.study.pattern.interpreter.general;

import java.util.Stack;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        try{
            Context context = new Context();
            Stack<IExpression> stack = new Stack<>();
            IExpression expression = stack.pop();
            expression.interpret(context);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
