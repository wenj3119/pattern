package com.study.pattern.interpreter.calculate;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public abstract class Interpreter implements IArithmeticInterpreter{
    protected IArithmeticInterpreter left;
    protected IArithmeticInterpreter right;

    public Interpreter(IArithmeticInterpreter left,IArithmeticInterpreter right){
        this.left = left;
        this.right = right;
    }
}
