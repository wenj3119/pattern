package com.study.pattern.proxy.dynamicproxy.cglibproxy;


import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @Author wenjun
 * @Date 2020/9/22
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        //CGlib　采用继承的方式，覆盖父类的方法
        //JDK　采用的实现方式，必须要求代理的目标对象一定要实现一个接口
        //思想：都是通过生成字节码，重组成一个新的类

        //JDK Proxy　对于用户而言，依赖更强，调用也更复杂
        //Cglib 对目标类没有任何的要求

        //CGlib 效率更高，性能也更高，低层没有用到反射
        //JDK　Proxy　生成逻辑较为简单，执行效率要低，每次都要用反射

        //Cglib 有个坑，目标代理类不能有final修饰的方法，忽略final修饰的方法

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/opt/workspace/2020/09/22/.cglib_proxy_class");
        LisiSon lisi = (LisiSon)new CglibMatchmaker().getInstance(LisiSon.class);
        lisi.findLove();
        lisi.buySafe();
    }
}
