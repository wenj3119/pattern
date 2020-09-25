package com.study.pattern.template.course;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public class JavaCourse extends AbstractCourse{
    private boolean needCheckHomeWork = false;

    public void setNeedCheckHomeWork(boolean needCheckHomeWork) {
        this.needCheckHomeWork = needCheckHomeWork;
    }

    @Override
    protected boolean needCheckHomeWork() {
        return this.needCheckHomeWork;
    }

    @Override
    protected void checkHomeWork() {
        System.out.println("检查java作业");
    }

}
