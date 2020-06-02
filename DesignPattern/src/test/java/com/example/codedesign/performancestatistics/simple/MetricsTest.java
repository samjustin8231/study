package com.example.codedesign.performancestatistics.simple;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class MetricsTest {

    @Test
    public void startRepeatedReport() {
        Metrics metrics = new Metrics();
        metrics.startRepeatedReport(5, TimeUnit.SECONDS);
    }
}