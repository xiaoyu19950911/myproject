package com.example.consumer.web;

import com.example.consumer.utils.MyJackson2Deserializer;
import com.example.consumer.utils.MyJackson2Serializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.util.StringUtils;

import java.io.Serializable;

@JsonSerialize(using = MyJackson2Serializer.class)
@JsonDeserialize(using = MyJackson2Deserializer.class)
public class Response<T extends Serializable> implements Serializable {

    private static String STATUS_OK = "ok";

    private static String STATUS_ERROR = "error";

    private String code;

    private String errorMsg;

    private T payload;

    public static class Builder<T extends Serializable> {

        private String code;

        private String errorMsg;

        private T payload;

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        public Builder payload(T payload) {
            this.payload = payload;
            return this;
        }

        public Response build() {
            return new Response(StringUtils.isEmpty(code) ? STATUS_OK : code, errorMsg, payload);
        }
    }

    private Response() {}

    private Response(String code, String errorMsg, T payload) {
        this.code = code;
        this.errorMsg = errorMsg;
        this.payload = payload;
    }

    private String getCode() {
        return code;
    }

    private void setCode(String code) {
        this.code = code;
    }

    private String getErrorMsg() {
        return errorMsg;
    }

    private void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    private T getPayload() {
        return payload;
    }

    private void setPayload(T payload) {
        this.payload = payload;
    }
}
