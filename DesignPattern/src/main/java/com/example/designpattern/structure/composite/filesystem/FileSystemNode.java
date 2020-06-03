package com.example.designpattern.structure.composite.filesystem;

import lombok.Data;

/**
 * 抽象的文件系统节点
 *
 * @author sunyajun
 * @date 2020/4/15 11:04 AM
 */
@Data
public abstract class FileSystemNode {
    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    /**
     * 节点下的文件数目，抽象方法
     *
     * @return
     */
    public abstract int countNumOfFiles();

    /**
     * 节点下的文件内容的size，抽象方法
     *
     * @return
     */
    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }
}