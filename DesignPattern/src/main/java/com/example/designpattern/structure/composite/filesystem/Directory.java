package com.example.designpattern.structure.composite.filesystem;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunyajun
 * @date 2020/4/15 11:05 AM
 */
@Slf4j
public class Directory extends FileSystemNode {
    private List<FileSystemNode> subNodes = new ArrayList<>();

    public Directory(String path) {
        super(path);
        log.info("======> new Directory, path:{}", path);
    }

    @Override
    public int countNumOfFiles() {
        log.info("=====> countNumOfFiles[目录]");
        int numOfFiles = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            numOfFiles += fileOrDir.countNumOfFiles();
        }
        return numOfFiles;
    }

    @Override
    public long countSizeOfFiles() {
        log.info("=====> countSizeOfFiles[目录]");
        long sizeofFiles = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            sizeofFiles += fileOrDir.countSizeOfFiles();
        }
        return sizeofFiles;
    }

    public void addSubNode(FileSystemNode fileOrDir) {
        if (fileOrDir instanceof Directory) {
            log.info("=====> addSubNode, dir:{}", JSON.toJSONString(fileOrDir));

        } else if (fileOrDir instanceof File) {
            log.info("=====> addSubNode, file:{}", JSON.toJSONString(fileOrDir));

        }
        subNodes.add(fileOrDir);
    }

    public void removeSubNode(FileSystemNode fileOrDir) {
        log.info("=====> removeSubNode, fileOrDir:{}", JSON.toJSONString(fileOrDir));
        int size = subNodes.size();
        int i = 0;
        for (; i < size; ++i) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }
}
