package com.study.pattern.interpreter.calculate;

import java.util.Stack;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class MyCalculator {
    private Stack<IArithmeticInterpreter> stack = new Stack<>();
    public MyCalculator(String expression){
        parse(expression);
    }
    //20 + 50
    private void parse(String expression) {
        String [] elements = expression.split(" ");
        IArithmeticInterpreter left,right;
        for (int i = 0; i < elements.length; i ++){
            String operation = elements[i];
            if(OperationUtil.ifOperation(operation)){
                left = this.stack.pop();
                right = new NumInterpreter(Integer.valueOf(elements[++i]));
                System.out.println("出栈：　" + left.interpret() + "　和　" + right.interpret());
                this.stack.push(OperationUtil.getInterpreter(left,right,operation));
                System.out.println("应用运算符：　" + operation);
            }else{
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(operation));
                this.stack.push(numInterpreter);
                System.out.println("入栈：　" + numInterpreter.interpret());
            }
        }
    }

    public int calulate(){
        return this.stack.pop().interpret();
    }
}
