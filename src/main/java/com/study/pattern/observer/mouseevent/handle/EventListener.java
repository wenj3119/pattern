package com.study.pattern.observer.mouseevent.handle;

import com.study.pattern.observer.mouseevent.core.Event;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public interface EventListener {
    void onClick(Event e);
    void onMove(Event e);
}
