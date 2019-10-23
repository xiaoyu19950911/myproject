package com.example.consumer.utils;

import com.example.consumer.web.Response;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.springframework.util.Assert;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * @program: myproject
 * @description: 自定义序列化
 * @author: xyu
 * @create: 2019-08-14 10:15
 */
public class MyJackson2Serializer extends StdSerializer<Response> {

    private static final long serialVersionUID = 6873358481305190913L;

    protected MyJackson2Serializer() {
        super(Response.class);
    }


    @Override
    public void serialize(Response response, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        Class clazz = Response.class;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            jgen.writeObjectField(field.getName(), response);
        }
        jgen.writeStartObject();
        jgen.writeStringField("test", "自定义序列化");
        jgen.writeEndObject();
    }

    /**
     * 根据属性名 获取值（value）
     *
     * @param name
     * @param response
     * @return
     * @throws IllegalAccessException
     */
    public static Object getFieldValueByName(String name, Response response) {
        String firstletter = name.substring(0, 1).toUpperCase();

        String getter = "get" + firstletter + name.substring(1);

        Method method;
        Object value = "";
        try {
            method = response.getClass().getMethod(getter);
            value = method.invoke(response);
        } catch (Exception e) {
            if (e instanceof NoSuchMethodException){
                value = "";
            }
        }
        return value;
    }
}
