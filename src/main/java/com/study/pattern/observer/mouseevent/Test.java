package com.study.pattern.observer.mouseevent;

import com.study.pattern.observer.mouseevent.handle.Mouse;
import com.study.pattern.observer.mouseevent.handle.MouseEventListener;
import com.study.pattern.observer.mouseevent.handle.MouseEventType;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        MouseEventListener callBack = new MouseEventListener();

        Mouse mouse = new Mouse();
        mouse.addListener(MouseEventType.ON_CLICK,callBack);
        mouse.addListener(MouseEventType.ON_MOVE,callBack);

        mouse.click();
        mouse.move();
    }
}
