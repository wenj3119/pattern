package com.study.pattern.interpreter.calculate;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class SubInterpreter extends Interpreter{

    public SubInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() - this.right.interpret();
    }
}
