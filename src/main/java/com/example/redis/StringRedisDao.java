package com.example.redis;

/**
 * 封装string类型的redis操作
 * Created by cc on 17-1-19.
 */
public interface StringRedisDao {

    /**
     * 设置指定 key 的值
     * @param key
     * @param value
     */
    void set(String key,String value);

    /**
     * 如果 key 已经存在并且是一个字符串， APPEND 命令将 value 追加到 key 原来的值的末尾。
     * @param key
     * @param value
     */
    void append(String key,String value);


    /**
     * 获取指定 key 的值。
     * @param key
     * @return
     */
    String get(String key);


    /**
     * 将给定 key 的值设为 value ，并返回 key 的旧值(old value)。
     * @param key
     * @param value
     * @return
     */
    String getset(String key,String value);

    /**
     * 只有在 key 不存在时设置 key 的值。
     * @param key
     * @param value
     * @return
     */
    Boolean setnx(String key,String value);

}
