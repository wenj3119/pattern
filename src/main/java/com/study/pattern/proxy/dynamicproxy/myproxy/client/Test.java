package com.study.pattern.proxy.dynamicproxy.myproxy.client;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        MyMatchmaker myMatchmaker = new MyMatchmaker();
        IPerson instance = myMatchmaker.getInstance(new LisiSon());
        instance.findLove();
        instance.buySafe();
      /*  byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{com.study.pattern.proxy.dynamicproxy.jdkproxy.IPerson.class});
        try {
            FileOutputStream os = new FileOutputStream("/opt/workspace/2020/09/22/$Proxy0.class");
            os.write($Proxy0s);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


    }
}
