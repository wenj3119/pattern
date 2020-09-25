package com.study.pattern.template.course;

/**
 * @Author wenjun
 * @Date 2020/9/25
 * @Description
 */
public abstract class AbstractCourse {
    public final void createCourse(){
        //1.发布预习资料
        postPreResource();
        //2.制作课件
        createPPT();
        //3.在线直播
        liveVideo();
        //4.上传课后资料
        postResource();
        //5.布置作业
        postHomeWork();
        //6.是否检查作业
        if(needCheckHomeWork()){
            checkHomeWork();
        }
    }

    protected boolean needCheckHomeWork(){return false;};

    protected abstract void checkHomeWork();

    protected  void postPreResource(){
        System.out.println("发布预习资料");
    };
    protected  void createPPT(){
        System.out.println("制作课件");
    };
    protected  void liveVideo(){
        System.out.println("在线直播");
    };
    protected  void postResource(){
        System.out.println("上传课后资料");
    };
    protected  void postHomeWork(){
        System.out.println("布置作业");
    };

}
