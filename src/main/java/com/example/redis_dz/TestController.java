package com.example.redis_dz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisPool;

@RestController
public class TestController {

    @Autowired
    private JedisPool jedisPool;
    @RequestMapping("/demo")
    public String demo(@RequestParam(name="demo") String demo){
        PublishThread publishThread =new PublishThread(jedisPool,demo);
        publishThread.start();
        return demo;
    }
}
