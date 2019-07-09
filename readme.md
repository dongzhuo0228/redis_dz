```
订阅命令 subscribe mychannel (表示订阅这个频道 相当于对这个做了监听)

```
![订阅](https://raw.githubusercontent.com/dongzhuo0228/redis_dz/master/%E8%AE%A2%E9%98%85.png)
```
发布命令 publish mychannel "message"( 表示发布消息到这个频道 此时订阅了这个频道的监听器就会监听到这个发布的消息 然后做对应的操作)
```
![发布](https://raw.githubusercontent.com/dongzhuo0228/redis_dz/master/%E5%8F%91%E5%B8%83.png)

###控制台打印
![打印](https://raw.githubusercontent.com/dongzhuo0228/redis_dz/master/%E6%8E%A7%E5%88%B6%E5%8F%B0%E7%9B%91%E5%90%AC%E6%B6%88%E6%81%AF.png)