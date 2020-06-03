package com.example.designpattern.structure.composite.filesystem;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sunyajun
 * @date 2020/4/15 11:04 AM
 */
@Slf4j
public class File extends FileSystemNode {
    public File(String path) {
        super(path);
        log.info("======> new File, path:{}", path);
    }

    @Override
    public int countNumOfFiles() {
        log.info("=====> countSizeOfFiles[file]");
        return 1;
    }

    @Override
    public long countSizeOfFiles() {
        log.info("=====> countSizeOfFiles[file]");
        java.io.File file = new java.io.File(path);
        if (!file.exists()) return 0;
        return file.length();
    }
}