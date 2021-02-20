package com.faith.sample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.faith.sample.model.MediaModel;
import com.github.chrisbanes.photoview.PhotoView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import static com.faith.sample.MediaGalleryInfo.MEDIA_TYPE_PHOTO;

public class MediaPagerAdapter<T extends MediaModel> extends PagerAdapter {

    List<T> datas;
    private Context context;

    public MediaPagerAdapter(Context context,List<T> datas){
        this.datas = datas;
        this.context = context;
        if(this.datas==null){
            this.datas = new ArrayList<>();
        }
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        MediaModel mediaModel = datas.get(position);
        View root = LayoutInflater.from(context).inflate(R.layout.item_gallery,null);
        PhotoView photoView = root.findViewById(R.id.pv);

        if(mediaModel.getMediaType()==MEDIA_TYPE_PHOTO){
            photoView.setVisibility(View.VISIBLE);
            Glide.with(context)
                    .load(mediaModel.getUrl())
                    .into(photoView);
        }else{


        }
        return root;
    }
}
