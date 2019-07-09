package com.example.redis_dz;

import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.JedisPubSub;

@Slf4j
public class Subscriber extends JedisPubSub {

    @Override
    public void onMessage(String channel, String message) {
       log.info("订阅监控的频道={},接受的消息为={}",channel,message);
    }
    @Override
    public void onSubscribe(String channel, int subscribedChannels) {    //订阅了频道会调用
        System.out.println(String.format("subscribe redis channel success, channel %s, subscribedChannels %d",
                channel, subscribedChannels));
    }
    @Override
    public void onUnsubscribe(String channel, int subscribedChannels) {   //取消订阅 会调用
     /*   System.out.println(String.format("unsubscribe redis channel, channel %s, subscribedChannels %d",
                channel, subscribedChannels));*/
    }
}
