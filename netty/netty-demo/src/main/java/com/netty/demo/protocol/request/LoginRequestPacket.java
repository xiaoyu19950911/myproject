package com.netty.demo.protocol.request;


import com.netty.demo.constant.Command;
import com.netty.demo.protocol.Packet;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-06 17:22
 */
public class LoginRequestPacket  extends Packet {

    private String userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {
        return Command.LOGIN_REQUEST;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
