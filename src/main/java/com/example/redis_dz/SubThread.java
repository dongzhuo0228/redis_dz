package com.example.redis_dz;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class SubThread extends Thread {
    private JedisPool jedisPool;
    private Subscriber subscriber;

    public final String channel = "mychannel";

    public SubThread(JedisPool jedisPool, Subscriber subscriber) {
        this.jedisPool = jedisPool;
        this.subscriber = subscriber;
    }

    @Override
    public void run() {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();   //取出一个连接
            jedis.subscribe(subscriber, channel);    //通过subscribe 的api去订阅，入参是订阅者和频道名
        } catch (Exception e) {
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }
}
