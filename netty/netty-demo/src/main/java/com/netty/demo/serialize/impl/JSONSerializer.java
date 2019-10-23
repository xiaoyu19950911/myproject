package com.netty.demo.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.netty.demo.constant.SerializerAlgorithm;
import com.netty.demo.serialize.Serializer;


/**
 * @program: myproject
 * @description:
 * @author: xyu
 * @create: 2019-08-07 09:56
 */
public class JSONSerializer implements Serializer {


    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}
