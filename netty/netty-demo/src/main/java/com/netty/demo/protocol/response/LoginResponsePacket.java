package com.netty.demo.protocol.response;


import com.netty.demo.protocol.Packet;

import static com.netty.demo.constant.Command.LOGIN_RESPONSE;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-06 17:23
 */
public class LoginResponsePacket extends Packet {

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
