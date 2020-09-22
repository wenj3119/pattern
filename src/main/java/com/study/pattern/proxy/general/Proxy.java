package com.study.pattern.proxy.general;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class Proxy implements ISubject{
    private ISubject subject;
    @Override
    public void request() {
        before();
        subject.request();
        after();
    }
    public Proxy(ISubject subject){
        this.subject = subject;
    }
    public void before(){
        System.out.println("called before request().");
    }
    public void after(){
        System.out.println("called after request().");
    }
}
