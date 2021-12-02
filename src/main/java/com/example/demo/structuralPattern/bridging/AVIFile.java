package com.example.demo.structuralPattern.bridging;

/**
 * @author jl.yao
 * @className AVIFile
 * @description
 * @date 2021/12/2 14:04
 **/
public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件："+ fileName);
    }
}
