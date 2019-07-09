package com.example.redis_dz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.JedisPool;

@SpringBootApplication
public class RedisDzApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisDzApplication.class, args);
    }

}
