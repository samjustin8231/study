package com.example.designpattern.behavior.strategy.sort;

import java.io.File;

/**
 * 可以使用策略工厂进行优化
 *
 * @author sunyajun
 * @date 2020/4/14 12:08 PM
 */
public class Sorter {
    private static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg;
        if (fileSize < 6 * GB) {
            sortAlg = new QuickSort();
        } else if (fileSize < 10 * GB) {
            sortAlg = new ExternalSort();
        } else if (fileSize < 100 * GB) {
            sortAlg = new ConcurrentExternalSort();
        } else {
            sortAlg = new MapReduceSort();
        }
        sortAlg.sort(filePath);
    }
}

