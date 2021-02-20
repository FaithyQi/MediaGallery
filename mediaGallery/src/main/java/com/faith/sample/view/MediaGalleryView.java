package com.faith.sample.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.faith.sample.model.MediaModel;
import com.faith.sample.MediaPagerAdapter;
import com.faith.sample.R;

import java.util.ArrayList;

import androidx.annotation.DrawableRes;

public class MediaGalleryView<T extends MediaModel> extends RelativeLayout {

    MediaViewPager viewPager;
    MediaPagerAdapter pagerAdapter;
    ArrayList<T> mediaModels = new ArrayList<>();
    ImageView backGround;
    ImageView ivDownload;
    LoadingView loadingView;
    private final String TAG = "MediaGallery";

    public MediaGalleryView(Context context) {
        this(context,null);
    }

    public MediaGalleryView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MediaGalleryView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr,0);
    }

    public MediaGalleryView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init(){
        LayoutInflater.from(getContext()).inflate(R.layout.media_gallery,this);
        viewPager = this.findViewById(R.id.vp);
        backGround = this.findViewById(R.id.bg);
        ivDownload = this.findViewById(R.id.iv_download);
        loadingView = this.findViewById(R.id.loading_view);
    }

    public  void setData(ArrayList<T> data){
        if(data==null||data.size()==0){
            Log.e(TAG,"set empty data!!!");
            return;
        }
        this.mediaModels.clear();
        this.mediaModels .addAll(data);

        if(pagerAdapter==null){
            pagerAdapter = new MediaPagerAdapter(getContext(),mediaModels);
            viewPager.setAdapter(pagerAdapter);
        }else{
            pagerAdapter.notifyDataSetChanged();
        }
    }

    public MediaGalleryView setDownloadIcon(@DrawableRes int resId){
        ivDownload.setImageResource(resId);
        return this;
    }




}
