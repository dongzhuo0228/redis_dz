package com.example.redis_dz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;

/**
 * 订阅频道
 */
@Slf4j
@Component
public class SubEvent implements CommandLineRunner {
    @Autowired
   JedisPool jedisPool;

    @Override
    public void run(String... args) throws Exception {
        log.info("初始化启动redis频道订阅");
        //订阅者
        SubThread subThread = new SubThread(jedisPool,new Subscriber());
        subThread.start();
    }
}
