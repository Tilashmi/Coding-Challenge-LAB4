package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        public static final String EXTRA_MESSAGE = "com.example.activity1.extra.MESSAGE";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void StartActivity(View view) {
            Intent intent = new Intent(this,SecondActivity.class);
            if(view.getId()==R.id.View1){
                intent.putExtra(EXTRA_MESSAGE, 1);
            }
            else if(view.getId()==R.id.View2){
                intent.putExtra(EXTRA_MESSAGE, 2);
            }
            else if(view.getId()==R.id.View3){
                intent.putExtra(EXTRA_MESSAGE, 3);
            }
            startActivity(intent);
        }
    }