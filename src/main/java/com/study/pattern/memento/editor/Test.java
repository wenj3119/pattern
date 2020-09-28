package com.study.pattern.memento.editor;

/**
 * @Author wenjun
 * @Date 2020/9/28
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        DraftsBox draftsBox = new DraftsBox();

        Editor editor = new Editor("测试","测试备忘录","sdkjfklsjdfljsaldfjlsajdfljljsdflj");

        ArticleMemento articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);

        System.out.println("标题："+ editor.getTitle() + "\n" + "内容：　" + editor.getContent() + "\n" + "图片：　" + editor.getImages());

        System.out.println("完整内容：　" + editor);

        System.out.println("============第一次修改===============");
        editor.setTitle("修改标题");
        editor.setContent("修改内容");
        System.out.println("第一次修改完成");
        System.out.println("完整信息：　" + editor);

        articleMemento = editor.saveToMemento();
        draftsBox.addMemento(articleMemento);
        System.out.println("===========保存到草稿箱===============");


        System.out.println("============第二次修改===============");
        editor.setTitle("spring");
        editor.setContent("修改内容");
        System.out.println("第二次修改完成");
        System.out.println("完整信息：　" + editor);

        System.out.println("第一次撤销回退：　");
        articleMemento = draftsBox.getMemento();
        editor.undoFromMemento(articleMemento);
        System.out.println("第一次回退信息：　" + editor);

        System.out.println("第二次撤销回退：　");
        articleMemento = draftsBox.getMemento();
        editor.undoFromMemento(articleMemento);
        System.out.println("第二次回退信息：　" + editor);


    }
}
