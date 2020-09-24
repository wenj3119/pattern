package com.study.pattern.adapter.demo.interfaceadapter;



/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class PowerAdapter implements DC {
    private AC220 ac220;
    public PowerAdapter(AC220 ac220){
        this.ac220 = ac220;
    }
    @Override
    public int output5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println("使用Adapter输入AC " + adapterInput + "V,输出DC: " + adapterOutput + "V");
        return adapterOutput;
    }

    @Override
    public int output12V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/18;
        System.out.println("使用Adapter输入AC " + adapterInput + "V,输出DC: " + adapterOutput + "V");
        return adapterOutput;
    }

    @Override
    public int output24V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/9;
        System.out.println("使用Adapter输入AC " + adapterInput + "V,输出DC: " + adapterOutput + "V");
        return adapterOutput;
    }

    @Override
    public int output36V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/6;
        System.out.println("使用Adapter输入AC " + adapterInput + "V,输出DC: " + adapterOutput + "V");
        return adapterOutput;
    }
}
