package com.study.pattern.proxy.staticproxy;



/**
 * @Author wenjun
 * @Date 2020/9/21
 * @Description
 */
public class Lisi implements IPerson {
    private LisiSon lisiSon;
    public Lisi(LisiSon lisiSon){
        this.lisiSon = lisiSon;
    }
    @Override
    public void findLove() {
        System.out.println("开始物色");
        lisiSon.findLove();
        System.out.println("开始交往");
    }
}
