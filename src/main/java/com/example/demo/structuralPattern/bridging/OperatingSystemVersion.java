package com.example.demo.structuralPattern.bridging;

/**
 * @author jl.yao
 * @className OperatingSystemVersion
 * @description
 * @date 2021/12/2 14:06
 **/
public abstract class OperatingSystemVersion {
    protected VideoFile videoFile;
    public OperatingSystemVersion(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
