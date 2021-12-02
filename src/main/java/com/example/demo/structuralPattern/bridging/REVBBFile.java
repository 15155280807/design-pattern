package com.example.demo.structuralPattern.bridging;

/**
 * @author jl.yao
 * @className REVBBFile
 * @description
 * @date 2021/12/2 14:05
 **/
public class REVBBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb文件：" + fileName);
    }
}
