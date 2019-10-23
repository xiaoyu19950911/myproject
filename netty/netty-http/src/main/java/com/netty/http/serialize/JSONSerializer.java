package com.netty.http.serialize;

import com.alibaba.fastjson.JSON;

/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-13 15:59
 */
public class JSONSerializer implements Serializer {
    @Override
    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes,clazz);
    }
}
