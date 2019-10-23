package com.design.patterns.proxy.dynamic.cglib;

import com.design.patterns.proxy.Station;
import com.design.patterns.proxy.Trading;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-05 15:47
 */
public class Test {

    public static void main(String[] args) {
        TicketSoftwareProxy proxy = new TicketSoftwareProxy();
        Station station =(Station) proxy.getProxy(Station.class);
        station.sellTicket();
    }
}
