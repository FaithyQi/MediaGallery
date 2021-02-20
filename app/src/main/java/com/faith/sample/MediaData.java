package com.faith.sample;

import com.faith.sample.model.MediaModel;

public class MediaData extends MediaModel {

    private String url;
    private int type = 1;

    public MediaData(String url){

        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public int getMediaType() {
        return type;
    }
}
