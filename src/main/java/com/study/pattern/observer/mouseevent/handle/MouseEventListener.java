package com.study.pattern.observer.mouseevent.handle;

import com.study.pattern.observer.mouseevent.core.Event;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class MouseEventListener implements EventListener{

    public void onClick(Event e){
        System.out.println("触发鼠标单击事件\n"+ e);
    }

    public void onMove(Event e){
        System.out.println("触发了移动事件\n" + e);

    }
}
