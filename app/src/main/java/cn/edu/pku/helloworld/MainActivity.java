package cn.edu.pku.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "cn.edu.pku.helloworld.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
