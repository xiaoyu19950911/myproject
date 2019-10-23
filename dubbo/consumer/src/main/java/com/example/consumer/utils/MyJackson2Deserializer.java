package com.example.consumer.utils;

import com.example.consumer.web.Response;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.springframework.util.Assert;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * @program: myproject
 * @description: 自定义反序列化
 * @author: xyu
 * @create: 2019-08-14 10:15
 */
public class MyJackson2Deserializer extends StdDeserializer<Response> {


    private static final long serialVersionUID = -7740404244627953443L;

    protected MyJackson2Deserializer() {
        super(Response.class);
    }


    @Override
    public Response<String> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        System.out.println("反序列化");
        return null;
    }
}
