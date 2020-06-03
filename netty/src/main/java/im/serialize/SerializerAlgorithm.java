package im.serialize;

import im.serialize.impl.JSONSerializer;

/**
 * @author sunyajun
 * @date 2020/4/20 2:40 PM
 */
public interface SerializerAlgorithm {

    /**
     * json 序列化标识
     */
    byte SERIALIZER_JSON = 1;

    Serializer DEFAULT = new JSONSerializer();

}
