package com.example.redis_dz;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class PublishThread extends Thread {
    private JedisPool jedisPool;
    private String message;

    public PublishThread(JedisPool jedisPool, String message) {
        this.jedisPool = jedisPool;
        this.message= message;
    }

    @Override
    public void run() {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            //通过subscribe 的api去发布，入参是都被订阅的频道和要发送的消息
            jedisPool.getResource().publish("mychannel", message);
        } catch (Exception e) {
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }

    }
}
