package com.study.pattern.observer.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wenjun
 * @Date 2020/9/29
 * @Description
 */
public class ConcreteSubject<E> implements ISubject <E>{
    private List<IObserver<E>> mObservers = new ArrayList<>();
    @Override
    public boolean attach(IObserver e) {
        return !this.mObservers.contains(e)&&this.mObservers.add(e);
    }

    @Override
    public boolean detach(IObserver e) {
        return this.mObservers.remove(e);
    }

    @Override
    public void notify(E o) {
        for(IObserver<E> observer: this.mObservers){
            observer.update(o);
        }
    }
}
