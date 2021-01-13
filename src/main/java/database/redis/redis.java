package database.redis;

import entity.Dog;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class redis {
    /**
    * @Description:  
    * @Param: [args] 
    * @returns: void 
    * @Author: ypc 
    * @Date: 2021/1/13 15:41
    * @packageName: database.redis
    */
    public static void main(String[] args) {
        //redis数据的key一但被使用，不能被别的类型覆盖，除非删除已经持有的key
        RedisConf redisConf=new RedisConf();
        Jedis jedis=new Jedis(redisConf.getIpAddress(),redisConf.getPort());


        //redis set，元素不重复
        jedis.sadd("","nihaoa");
        System.out.println(jedis.ping());



    }
}
