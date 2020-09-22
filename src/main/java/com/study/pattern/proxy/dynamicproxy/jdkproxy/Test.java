package com.study.pattern.proxy.dynamicproxy.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        JdkMatchmaker jdkMatchmaker = new JdkMatchmaker();
        IPerson instance = jdkMatchmaker.getInstance(new LisiSon());
        instance.findLove();
        instance.buySafe();
        byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPerson.class});
        try {
            FileOutputStream os = new FileOutputStream("/opt/workspace/2020/09/22/$Proxy0.class");
            os.write($Proxy0s);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        IPerson instance1 = jdkMatchmaker.getInstance(new Wangwu());
        instance1.findLove();
        instance1.buySafe();
    }
}
