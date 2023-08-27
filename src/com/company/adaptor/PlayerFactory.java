package com.company.adaptor;

import com.company.adaptor.external.ImageViewer;

public class PlayerFactory {

    Player player = null;

    public Player getInstance(String filePath){

        if(filePath.endsWith(".mp3")){


            player = new MP3Player();

        }else if(filePath.endsWith(".mp4")){

            player = new MP4Player();

        }else if (filePath.endsWith(".mkv")){
            player = new MKVPlayer();
        }else if(filePath.endsWith("jpg")){
            //player = new ImageViewer(); //this error comes because the imageViewer class is incompatible with Player interface.
            //to sort out this problem, we can use an Adaptor class.

            player = new ImageAdaptor(new ImageViewer());

        }

        return player;
    }


}
