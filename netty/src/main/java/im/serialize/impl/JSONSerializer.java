package im.serialize.impl;


import com.alibaba.fastjson.JSON;
import im.serialize.Serializer;
import im.serialize.SerializerAlgorithm;

/**
 * @author sunyajun
 * @date 2020/4/20 2:40 PM
 */
public class JSONSerializer implements Serializer {
    public byte getSerializerAlogrithm() {
        return SerializerAlgorithm.SERIALIZER_JSON;
    }

    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}
