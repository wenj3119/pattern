package com.study.pattern.composite.demo.safe;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("==========安全模式写法=========");
        File qq = new File("qq.exe");
        File wx = new File("微信.exe");

        Folder office = new Folder("办公软件",2);

        File word = new File("Word.exe");
        File ppt = new File("PowerPoint.exe");
        File excel = new File("Excel.exe");

        office.add(word);
        office.add(ppt);
        office.add(excel);

        Folder root = new Folder("/opt/",1);
        root.add(qq);
        root.add(wx);
        root.add(office);
        System.out.println("=======show()========");
        root.show();
        System.out.println("======list()===========");
        root.list();
    }
}
