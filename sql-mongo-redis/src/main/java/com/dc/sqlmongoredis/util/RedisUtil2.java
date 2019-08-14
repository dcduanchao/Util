//package com.dc.sqlmongoredis.util;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.BoundListOperations;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.util.CollectionUtils;
//
//import javax.annotation.Resource;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
///**
// * @CreateDate: 2019/6/26 0026 16:40
// * duanchao
// */
//@Resource
//public class RedisUtil2 extends RedisTemplate<String,Object>  {
//
//
//    public void del(final  String key){
//        super.delete(key);
//    }
//
//
//    public void set1(final String key, final Object value) {
//        opsForValue().set(key, value);
//    }
//
//    public <V> V get1(final String key) {
//        return (V) opsForValue().get(key);
//    }
//
//
//
//}
