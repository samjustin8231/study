package com.example.designpattern.behavior.strategy.sort;

import java.io.File;

/**
 * 不用设计模式，进行排序</br>
 * 题目：实现对一个文件进行排序的功能。文件中只包含整型数，并且，相邻的数字通过逗号来区隔。
 *
 * @author sunyajun
 * @date 2020/4/14 12:04 PM
 */

public class NotUsePatternSorter {
    private static final long GB = 1000 * 1000 * 1000;

    public void sortFile(String filePath) {
        // 省略校验逻辑
        File file = new File(filePath);
        long fileSize = file.length();
        if (fileSize < 6 * GB) { // [0, 6GB)
            quickSort(filePath);
        } else if (fileSize < 10 * GB) { // [6GB, 10GB)
            externalSort(filePath);
        } else if (fileSize < 100 * GB) { // [10GB, 100GB)
            concurrentExternalSort(filePath);
        } else { // [100GB, ~)
            mapreduceSort(filePath);
        }
    }

    private void quickSort(String filePath) {
        // 快速排序
    }

    private void externalSort(String filePath) {
        // 外部排序
    }

    private void concurrentExternalSort(String filePath) {
        // 多线程外部排序
    }

    private void mapreduceSort(String filePath) {
        // 利用MapReduce多机排序
    }
}

class SortingTool {
    public static void main(String[] args) {
        NotUsePatternSorter notUsePatternSorter = new NotUsePatternSorter();
        notUsePatternSorter.sortFile(args[0]);
    }
}
