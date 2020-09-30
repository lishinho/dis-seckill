package com.seckill.dis.cache.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "redis")
public class RedisConfig {

    private String host;
    private int port;
    private int timeoutInSecond;
    private int poolMaxTotal;
    private int poolMaxIdle;
    private int poolMaxWaitInSecond;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getTimeoutInSecond() {
        return timeoutInSecond;
    }

    public void setTimeoutInSecond(int timeoutInSecond) {
        this.timeoutInSecond = timeoutInSecond;
    }

    public int getPoolMaxTotal() {
        return poolMaxTotal;
    }

    public void setPoolMaxTotal(int poolMaxTotal) {
        this.poolMaxTotal = poolMaxTotal;
    }

    public int getPoolMaxIdle() {
        return poolMaxIdle;
    }

    public void setPoolMaxIdle(int poolMaxIdle) {
        this.poolMaxIdle = poolMaxIdle;
    }

    public int getPoolMaxWaitInSecond() {
        return poolMaxWaitInSecond;
    }

    public void setPoolMaxWaitInSecond(int poolMaxWaitInSecond) {
        this.poolMaxWaitInSecond = poolMaxWaitInSecond;
    }
}
