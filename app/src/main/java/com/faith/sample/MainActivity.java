package com.faith.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.faith.sample.view.MediaGalleryView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MediaGalleryView mgv;
    ArrayList<MediaData> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mgv = findViewById(R.id.mgv);

        initData();

        mgv.setData(datas);

    }

    private void initData(){

        datas.add(new MediaData("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic.jj20.com%2Fup%2Fallimg%2F1114%2F0FR0104017%2F200FQ04017-6-1200.jpg&refer=http%3A%2F%2Fpic.jj20.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1616406148&t=0099ab8c79490a82eb5e44246221d8bc"));
        datas.add(new MediaData("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fwww.wallcoo.com%2Fnature%2F2009_Landscape_1680_Desktop_03%2Fwallpapers%2F1680x1050%2FWild%2520Goose%2520Island%2520on%2520Saint%2520Mary%2520Lake%2520at%2520Sunrise%2520Glacier%2520National%2520Park%2520Montana.jpg&refer=http%3A%2F%2Fwww.wallcoo.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1616406230&t=c2469759c8439b36827fd07a66fa398c"));
        datas.add(new MediaData("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Ft1.hxzdhn.com%2Fuploads%2Ftu%2Fzyf%2Ftt%2F20160520%2F40kxnrgrmpd.jpg&refer=http%3A%2F%2Ft1.hxzdhn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1616406230&t=d3869cc9af208e6d0bd6c726dd7ccede"));
        datas.addAll(datas);

    }

}