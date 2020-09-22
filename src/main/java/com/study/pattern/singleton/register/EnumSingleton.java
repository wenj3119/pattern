package com.study.pattern.singleton.register;

/**
 * @Author wenjun
 * @Date 2020/9/18
 * @Description
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){return INSTANCE;};
}
