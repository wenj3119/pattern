package com.study.pattern.adapter.demo.classdapter;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class PowerAdapter extends AC220 implements DCS {
    @Override
    public int output5V() {
        int adapterInput = super.outputAC220V();
        int adapterOutput = adapterInput/44;
        System.out.println("使用Adapter输入AC " + adapterInput + "V,输出DC: " + adapterOutput + "V");
        return adapterOutput;
    }
}
