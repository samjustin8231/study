package com.example.designpattern.structure.composite.filesystem;

/**
 * @author sunyajun
 * @date 2020/4/15 11:04 AM
 */
public abstract class FileSystemNode {
    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();
    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }
}