package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class SecAct extends AppCompatActivity {

    private boolean running2 = true;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);


    }

    private  void runTimer2(){
        final TextView textViewCount = findViewById(R.id.textViewCount);
        final Handler handler2 = new Handler();
        handler2.post(new Runnable() {
            @Override
            public void run() {
                textViewCount.setText(Integer.toString(count));
                count++;
                handler2.postDelayed(this, 1000);
            }
        });
    }

    public void onClickCount(View view){
        runTimer2();
        
    }
}