package com.example.codedesign.ratelimiter.alg;

import com.example.codedesign.ratelimiter.exception.InternalErrorException;

public interface RateLimitAlg {
    boolean tryAcquire() throws InternalErrorException;
}
