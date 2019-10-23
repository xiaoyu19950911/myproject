package com.design.patterns.proxy.statics;

import com.design.patterns.proxy.Station;
import com.design.patterns.proxy.Trading;

/**
 * @program: myproject
 * @description: 抢票软件
 * @author: xyu
 * @create: 2019-08-05 15:04
 */
public class TicketSoftware implements Trading {

    private Station station;

    public TicketSoftware(Station station){
        this.station=station;
    }

    @Override
    public void sellTicket() {
        System.out.println("抢票软件搜集个人信息！");
        station.sellTicket();
        System.out.println("抢票软件已抢到票！");
    }
}
