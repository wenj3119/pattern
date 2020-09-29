package com.study.pattern.observer.mouseevent.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 *
 */
public class EventObservable {
    protected Map<String,Event> events = new HashMap<>();

    public void addListener(String eventType, Object target, Method callBack){
        events.put(eventType,new Event(target,callBack));
    }
    public void addListener(String eventType, Object target){
        try {
            this.addListener(eventType,target,target.getClass().getMethod("on" + toUpperFirestCase(eventType),Event.class));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private String toUpperFirestCase(String eventType) {
        char[] chars = eventType.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try {
            if (event.getCallBack() != null) {
                event.getCallBack().invoke(event.getTarget(), event);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void trigger(String trigger){
        if(!this.events.containsKey(trigger)){
            return;
        }
        trigger(this.events.get(trigger).setTrigger(trigger));
    }
}
