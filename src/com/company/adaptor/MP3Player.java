package com.company.adaptor;

public class MP3Player implements Player{

    public void play(String filePath){

        System.out.println("Playing the MP3 File " +filePath);

    }
}
