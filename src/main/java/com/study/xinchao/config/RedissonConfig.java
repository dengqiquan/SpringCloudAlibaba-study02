//package com.study.xinchao.config;
//import org.redisson.Redisson;
//import org.redisson.config.Config;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @description:
// * @author: Deng Qi Qua_n
// * @date: 2021/1/27 17:42
// */
//@Configuration
//public class RedissonConfig {
//
//    @Value("${spring.redis.host}")
//    private String redisHost;
//
//    @Value("${spring.redis.port}")
//    private String redisPort;
//
//    static final String REDIS_PRE = "redis://";
//
//    @Bean
//    public Redisson getRedisson(){
//        Redisson redisson;
//        Config config = new Config();
//        config.useSingleServer().setAddress(REDIS_PRE+redisHost+":"+redisPort);
//        //得到redisson对象
//        redisson = (Redisson) Redisson.create(config);
//        return redisson;
//    }
//}
