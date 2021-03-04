package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView article;
    private TextView heading;
    private String content;
    private String topic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        article = findViewById(R.id.content);
        heading = findViewById(R.id.heading);

        Intent intent = getIntent();
        int button_num = intent.getIntExtra(MainActivity.EXTRA_MESSAGE,0);
        if(button_num==1) {
            content = getResources().getString(R.string.content1);
            topic = getResources().getString(R.string.heading1);
        }
        else if(button_num==2){
            content = getResources().getString(R.string.content2);
            topic = getResources().getString(R.string.heading2);
        }
        else if(button_num==3){
            content = getResources().getString(R.string.content3);
            topic = getResources().getString(R.string.heading3);
        }
        article.setText(content);
        heading.setText(topic);
    }
}
