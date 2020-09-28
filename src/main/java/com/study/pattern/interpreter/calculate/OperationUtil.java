package com.study.pattern.interpreter.calculate;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class OperationUtil {
    public static boolean ifOperation(String symbol){
        return ("+".equals(symbol)||"-".equals(symbol)||"*".equals(symbol)||"/".equals(symbol));
    }

    public static IArithmeticInterpreter getInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right, String operation) {
        if("+".equals(operation)){
            AddInterpreter addInterpreter = new AddInterpreter(left, right);
            return addInterpreter;
        }else if("-".equals(operation)){
            SubInterpreter subInterpreter = new SubInterpreter(left, right);
            return subInterpreter;
        }else if("*".equals(operation)){
            MulInterpreter mulInterpreter = new MulInterpreter(left, right);
            return mulInterpreter;
        }else if("/".equals(operation)){
            DivInterpreter divInterpreter = new DivInterpreter(left, right);
            return divInterpreter;
        }else  {
            return null;
        }
    }
}
