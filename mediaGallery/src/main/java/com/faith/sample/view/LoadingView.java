package com.faith.sample.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.faith.sample.R;
import com.faith.sample.util.SizeUtils;

public class LoadingView extends RelativeLayout {

    TextView tvLoading;
    ImageView ivCancel;
    private long sizeKb;

    public LoadingView(Context context) {
        this(context,null);
    }

    public LoadingView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public LoadingView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr,0);
    }

    public LoadingView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init(){

        LayoutInflater.from(getContext()).inflate(R.layout.view_loading,this);

        tvLoading = this.findViewById(R.id.tv_progress);
        ivCancel = this.findViewById(R.id.iv_cancel);

        ivCancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }

    private void cancelLoading(){


    }

    public void showOrigin(long kb){

        this.sizeKb = kb;
        tvLoading.setText("查看原图（"+ SizeUtils.FormetFileSize(sizeKb)+"）");

    }


    public void loading(int percent){
        tvLoading.setText(percent+"%");
    }

    public void loadingFinish(){
        this.setVisibility(GONE);
    }

}
