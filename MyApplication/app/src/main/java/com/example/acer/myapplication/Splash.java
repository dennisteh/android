package com.example.acer.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Acer on 2/11/2014.
 */
public class Splash extends Activity{
    @Override
    protected void onCreate(Bundle splashItem) {
        super.onCreate(splashItem);
        setContentView(R.layout.splash);
        Thread timer=new Thread(){
            public void run(){
                try{
                    sleep(1500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent openStartingPoint = new Intent("com.example.acer.myapplication.MYACTIVITY11");
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
