package com.study.pattern.flyweight.ticket;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("北京西","临汾");
        ticket.showInfo("硬卧");
        ticket = TicketFactory.queryTicket("北京西","临汾");
        ticket.showInfo("软卧");

        ticket = TicketFactory.queryTicket("北京西","大连");
        ticket.showInfo("软卧");
    }
}
