package com.study.pattern.proxy.dynamicproxy.myproxy.proxy;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author wenjun
 * @Date 2020/9/22
 * @Description
 */
public class MyProxy {
    public static final String LN = "\r\n";
    public static Object newProxyInstance(MyClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.动态生成源代码
        String src = generateSrc(interfaces);
        //2.java文件输出到磁盘，保存为文件$Proxy0.java
        String filePath = MyProxy.class.getResource("").getPath();
        File f = new File(filePath + "$Proxy0.java");
        FileWriter fw = new FileWriter(f);
        fw.write(src);
        fw.flush();
        fw.close();
        //3.把.java文件编译成$Proxy0.class文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager standardFileManager = compiler.getStandardFileManager(null, null, null);
        Iterable<? extends JavaFileObject> javaFileObjects = standardFileManager.getJavaFileObjects(f);
        JavaCompiler.CompilationTask task = compiler.getTask(null, standardFileManager, null, null, null, javaFileObjects);
        task.call();
        //4.把生成的.class文件加载到jvm中
        Class proxyClass = loader.findClass("$Proxy0");
        Constructor constructor = proxyClass.getConstructor(MyInvocationHandler.class);
        //5.返回新的代理对象
        f.delete();
        return constructor.newInstance(h);
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.study.pattern.proxy.dynamicproxy.myproxy.proxy;" + LN);
        sb.append("import com.study.pattern.proxy.dynamicproxy.myproxy.client.IPerson;" + LN);
        sb.append("import java.lang.reflect.*;" + LN);
        sb.append("public final class $Proxy0 implements " + interfaces[0].getName() + "{" + LN);
        sb.append("MyInvocationHandler h;" + LN);
        sb.append("public $Proxy0(MyInvocationHandler h){ " + LN);
            sb.append("this.h = h;" + LN);
        sb.append("}" + LN);

        for(Method m : interfaces[0].getMethods()){
            Class<?>[] params = m.getParameterTypes();
            StringBuilder paramNames = new StringBuilder();
            StringBuilder paramValues = new StringBuilder();
            StringBuilder paramClasses = new StringBuilder();

            for(int i = 0; i < params.length; i++){
                
            }

            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(){" + LN);
                sb.append("try{ " + LN);
                    sb.append("Method m =" + interfaces[0].getName() + ".class.getMethod(\""+ m.getName() + "\",new Class[]{});" + LN);
                    sb.append("this.h.invoke(this,m,new Object[]{});" + LN);
                    sb.append("return;" +LN);
                sb.append("}catch (RuntimeException | Error var3) {" +LN);
                sb.append("            throw var3;" +LN);
                sb.append("        } catch (Throwable var4) {" +LN);
                sb.append("            throw new UndeclaredThrowableException(var4);" +LN);
                sb.append("        }");
            sb.append("}" + LN);
        }

        sb.append("}");
        return sb.toString();
    }
}
