package com.example.designpattern.behavior.strategy.sort;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sunyajun
 * @date 2020/4/14 12:11 PM
 */
public class SortAlgFactory {

    private static final Map<String, ISortAlg> algs = new HashMap<>();

    static {
        algs.put("QuickSort", new QuickSort());
        algs.put("ExternalSort", new ExternalSort());
        algs.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        algs.put("MapReduceSort", new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return algs.get(type);
    }

    class Sorter {
        private static final long GB = 1000 * 1000 * 1000;

        public void sortFile(String filePath) {
            // 省略校验逻辑
            File file = new File(filePath);
            long fileSize = file.length();
            ISortAlg sortAlg;
            if (fileSize < 6 * GB) { // [0, 6GB)
                sortAlg = SortAlgFactory.getSortAlg("QuickSort");
            } else if (fileSize < 10 * GB) { // [6GB, 10GB)
                sortAlg = SortAlgFactory.getSortAlg("ExternalSort");
            } else if (fileSize < 100 * GB) { // [10GB, 100GB)
                sortAlg = SortAlgFactory.getSortAlg("ConcurrentExternalSort");
            } else { // [100GB, ~)
                sortAlg = SortAlgFactory.getSortAlg("MapReduceSort");
            }
            sortAlg.sort(filePath);
        }
    }
}

