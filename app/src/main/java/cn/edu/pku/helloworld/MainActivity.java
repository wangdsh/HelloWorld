package cn.edu.pku.helloworld;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.bm.library.PhotoView;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "cn.edu.pku.helloworld.MESSAGE";
//    private PhotoView test_iv;
//    private PhotoViewAttacher photoViewAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        test_iv = (PhotoView) findViewById(R.id.test_iv);
//        displayImage();
//        photoViewAttacher = new PhotoViewAttacher(test_iv);

        PhotoView photoView = (PhotoView) findViewById(R.id.img);
        photoView.enable(); // 启用图片缩放功能



    }

//    private void displayImage() {
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.image);
//
//        test_iv.setImageBitmap(bitmap);
//    }

//    public void sendMessage(View view) {
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//    }
}
