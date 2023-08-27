package com.company.adaptor;

import com.company.adaptor.external.ImageViewer;

public class ImageAdaptor implements Player{

    private  ImageViewer imageViewer;

    public ImageAdaptor(ImageViewer viewer){
        this.imageViewer = viewer;
    }
    @Override
    public void play(String filepath) {
        // call the ImageViewer -> show(filePath) method through this...

        //one way of doing this.
        //ImageViewer imageViewer = new ImageViewer();

        imageViewer.show(filepath);
    }
}
