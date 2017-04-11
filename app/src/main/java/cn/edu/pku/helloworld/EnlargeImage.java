package cn.edu.pku.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.bm.library.PhotoView;

public class EnlargeImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enlarge_image);

        PhotoView photoView = (PhotoView) findViewById(R.id.img);
        photoView.enable(); // 启用图片缩放功能
    }
}
