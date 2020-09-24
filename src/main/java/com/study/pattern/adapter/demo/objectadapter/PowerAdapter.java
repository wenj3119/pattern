package com.study.pattern.adapter.demo.objectadapter;

import com.study.pattern.adapter.demo.classdapter.DCS;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class PowerAdapter implements DCS {
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
}
