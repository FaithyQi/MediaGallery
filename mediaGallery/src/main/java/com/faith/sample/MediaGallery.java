package com.faith.sample;

import android.app.Dialog;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MediaGallery extends Dialog {
    private MediaGallery(@NonNull Context context) {
        super(context);
    }

    private MediaGallery(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    private MediaGallery(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }


    private void init(){


    }


    public void show(int position){

    }

    public void show(){

    }


    public static class Builder{

        MediaGallery mediaGallery;
        boolean needOriginal = false;


        public MediaGallery build(Context context){
            mediaGallery = new MediaGallery(context);
            return  mediaGallery;
        }

    }

}
