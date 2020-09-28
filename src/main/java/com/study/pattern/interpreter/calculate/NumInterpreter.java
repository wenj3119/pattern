package com.study.pattern.interpreter.calculate;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class NumInterpreter implements IArithmeticInterpreter{
    private int value;
    public NumInterpreter(int value){
        this.value = value;
    }
    @Override
    public int interpret() {
        return this.value;
    }
}
