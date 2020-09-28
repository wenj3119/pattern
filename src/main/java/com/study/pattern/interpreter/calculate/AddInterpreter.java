package com.study.pattern.interpreter.calculate;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class AddInterpreter extends Interpreter{

    public AddInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() + this.right.interpret();
    }
}
