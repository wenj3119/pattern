package com.study.pattern.memento.general;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator("hahahaha");
        Memento memento = originator.createMemento();

        Caretaker caretaker = new Caretaker();
        caretaker.storeMemento(memento);

        System.out.println("首次创建originator:" +originator);
        System.out.println("＝＝＝＝＝＝＝＝＝＝第一次修改originator＝＝＝＝＝＝＝＝＝" );
        originator.setName("第一次修改");
        Memento memento1 = originator.createMemento();
        caretaker.storeMemento(memento1);
        System.out.println("第一次修改完成");
        System.out.println("第一次修改完成之后：　" + originator);

        originator.setName("第二次修改");
        System.out.println("第二次修改完成");
        System.out.println("第二次修改完成之后：　" + originator);

        System.out.println("第一次后悔＝＝＝＝＝＝＝＝＝＝＝＝");
        Memento memento2 = caretaker.getMemento();
        originator.restoreMemento(memento2);
        System.out.println("第一次后悔：" + originator);

        System.out.println("第二次后悔＝＝＝＝＝＝＝＝＝＝＝＝");
        Memento memento3 = caretaker.getMemento();
        originator.restoreMemento(memento3);
        System.out.println("第二次后悔：" + originator);

    }
}
