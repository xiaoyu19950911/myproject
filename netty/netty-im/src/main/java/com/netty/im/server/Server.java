package com.netty.im.server;

public interface Server {

    /**
     * return the attribute of current server
     *
     * @return the attribute of the server
     */
    ServerAttr attribute();

    /**
     * start the server
     */
    void start();

    /**
     * stop the server
     */
    void stop();

    /**
     * register to a router
     */
    void registerToRouter();
}
