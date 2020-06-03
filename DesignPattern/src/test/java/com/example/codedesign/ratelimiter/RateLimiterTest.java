package com.example.codedesign.ratelimiter;

import org.junit.Test;

import static org.junit.Assert.*;

public class RateLimiterTest {

    @Test
    public void limit() {
        RateLimiter rateLimiter = new RateLimiter();
        rateLimiter.limit("login", "loginUrl");
    }
}