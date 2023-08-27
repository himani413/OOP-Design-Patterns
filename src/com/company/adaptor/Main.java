package com.company.adaptor;

public class Main {

    public static void main(String[] args) {

        String filePath = args[0];

        PlayerFactory playerFactory = new PlayerFactory();
        Player player = playerFactory.getInstance(filePath);

        if (player != null) {
            player.play(filePath);
        }else{
            System.out.println("The file format is not supported.");
        }


    }

}

//Adaptor Design Pattern

//let's assume that we are going to create an app which can be used to play audio/video files.

//MP3 files, MP4 files, MKV file etc will be supported.

//filepath is given as a cli argument to this program.

//run this app in production for a while.

//after a while, you get a requirement to display image files in this adaptor.

//and you saw that there is a library written by someone else which can be used to display images.

//Adaptor pattern -> used to make an incompatible interface/class compatible with the existing interface.