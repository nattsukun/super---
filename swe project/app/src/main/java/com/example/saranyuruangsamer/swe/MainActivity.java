package com.example.saranyuruangsamer.swe;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

   /* MediaPlayer mysong; */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*   mysong = MediaPlayer.create(this, R.menu.song); */

        Button button = (Button) findViewById(R.id.button);
        ImageView superman = (ImageView) findViewById(R.id.imageView2);
        int x=50;
        /*for(int i =0;i<x;i++) {
            button.setTranslationX(i);
        }*/
     /*   Animation an = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);

        button.startAnimation(an);
        */
        Animation ab = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);

        superman.startAnimation(ab);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), menu.class);
                startActivity(i);
            }
        /*    public void playMusic(View view) {

                mysong.start();
            } */
        });

    }}
