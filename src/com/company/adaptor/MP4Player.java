package com.company.adaptor;

public class MP4Player implements Player{

    @Override
    public void play(String filepath) {
        System.out.println("Playing the MP4 File " +filepath);
    }
}
