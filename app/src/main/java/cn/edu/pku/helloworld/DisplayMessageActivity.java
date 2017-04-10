package cn.edu.pku.helloworld;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Uri myUri = getIntent().getData();
        String scheme = myUri.getScheme();
        String host = myUri.getHost();
        String arg0 = myUri.getQueryParameter("arg0");
        String arg1 = myUri.getQueryParameter("arg1");

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(scheme + "\n" + host + "\n" + arg0 + "\n" + arg1 );

    }
}
