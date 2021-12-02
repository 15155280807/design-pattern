package com.example.demo.structuralPattern.bridging;

/**
 * @author jl.yao
 * @className Mac
 * @description
 * @date 2021/12/2 14:07
 **/
public class Mac extends OperatingSystemVersion{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }
    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
