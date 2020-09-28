package com.study.pattern.memento.editor;

import java.util.Stack;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class DraftsBox {
    private final Stack<ArticleMemento> STACK = new Stack<>();

    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        STACK.push(articleMemento);
    }
}
