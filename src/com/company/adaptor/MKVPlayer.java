package com.company.adaptor;

public class MKVPlayer implements Player{

    @Override
    public void play(String filepath) {

        System.out.println("Playing the MKV file " +filepath);

    }
}
