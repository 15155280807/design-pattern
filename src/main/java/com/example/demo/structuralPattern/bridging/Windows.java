package com.example.demo.structuralPattern.bridging;

/**
 * @author jl.yao
 * @className Windows
 * @description
 * @date 2021/12/2 14:07
 **/
public class Windows extends OperatingSystemVersion{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
