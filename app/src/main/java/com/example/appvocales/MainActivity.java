package com.example.appvocales;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //establece como predeterminada la horientación vertical de la pantalla
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //elimina el encabezado de la app
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }

    @Override
    public void onPause() {
        super.onPause();
        onPause();
        Intent i = new Intent(this, AudioService.class);
        i.putExtra("action", AudioService.PAUSE);
        startService(i);
    }

    @Override
    public void onResume() {
        super.onResume();
        Intent i = new Intent(this, AudioService.class);
        i.putExtra("action", AudioService.START);
        startService(i);
    }

    public void PlaySound_A(View view) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),
                R.raw.a_deavion);
        mp.start();
    }
    public void PlaySound_E(View view) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),
                R.raw.e_elefante);
        mp.start();
    }
    public void PlaySound_I(View view) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),
                R.raw.i_deisla);
        mp.start();
    }
    public void PlaySound_O(View view) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),
                R.raw.o_deoso);
        mp.start();
    }
    public void PlaySound_U(View view) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),
                R.raw.u_deuva);
        mp.start();
    }
    public void PlaySound_Principal(View view) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),
                R.raw.audio_bienvenida);
        mp.start();
    }


    public void rotation(View view){
        Animation Button = AnimationUtils.loadAnimation(MainActivity.this,
                R.anim.rotacion);

        imagen.startAnimation (Button);

    }


}