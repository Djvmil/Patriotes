package com.example.prototype01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class Splash extends AppCompatActivity {


    private final int SPLASH_DISPLAY_LENGTH = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer = new Thread(){

            @Override
            public void run() {
                 try {
                     sleep(SPLASH_DISPLAY_LENGTH);
                     Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                     startActivity(intent);
                     finish();
                     super.run();
                 }catch (InterruptedException e){
                    e.printStackTrace();
                 }
            }
        };

        timer.start();


    }

}
