package com.study.pattern.flyweight.ticket;

import java.util.Random;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class TrainTicket implements ITicket{
    private String from;
    private String to;
    private double price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        this.price = new Random().nextDouble()*100;
        System.out.println(from + "->" + to + ": " + bunk + "价格: " + this.price);
    }
}
