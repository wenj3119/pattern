package com.study.pattern.iterator.course;

import java.util.List;

/**
 * @Author wenjun
 * @Date 2020/9/27
 * @Description
 */
public class IteratorImpl<E> implements Iterator {
    private List<E> list;
    private int cursor;
    private E element;
    public IteratorImpl(List<E> list){
        this.list = list;
    }
    @Override
    public E next() {
        System.out.println("当前位置：　" + cursor + " :");
        element = list.get(cursor);
        cursor ++;
        return element;
    }

    @Override
    public boolean hasNext() {
        if(cursor<list.size()){
            return true;
        }
        return false;
    }
}
