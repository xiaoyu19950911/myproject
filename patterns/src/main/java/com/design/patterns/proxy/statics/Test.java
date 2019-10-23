package com.design.patterns.proxy.statics;

import com.design.patterns.proxy.Station;

/**
 * @program: myproject
 * @description: 测试类
 * @author: xyu
 * @create: 2019-08-05 15:07
 */
public class Test {

    public static void main(String[] args) {
        Station station = new Station();
        TicketSoftware ticketSoftware = new TicketSoftware(station);
        ticketSoftware.sellTicket();
    }
}
