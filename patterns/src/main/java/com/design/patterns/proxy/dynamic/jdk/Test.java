package com.design.patterns.proxy.dynamic.jdk;

import com.design.patterns.proxy.Station;
import com.design.patterns.proxy.Trading;

/**
 * @program: myproject
 * @description: 测试类
 * @author: xyu
 * @create: 2019-08-05 15:22
 */
public class Test {

    public static void main(String[] args) {
        Station station = new Station();
        TicketSoftwareHandler handler =new TicketSoftwareHandler(station);
        ProxyFactory factory = new ProxyFactory(handler);
        Trading trading = (Trading) factory.getProxyInstance();
        trading.sellTicket();
    }
}
