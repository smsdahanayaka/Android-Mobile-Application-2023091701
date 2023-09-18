    package com.codelink.kasun_0750;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

    public class SplashScreenActivity extends AppCompatActivity {
        private static final int SPLASH_SCREEN =3000 ;

    // Variables
        ImageView image;
        TextView  txtView1,txtView2;
        Animation topAnimation, botAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        //Animation
        topAnimation= AnimationUtils.loadAnimation(this,R.anim.tp_animation);
        botAnimation= AnimationUtils.loadAnimation(this,R.anim.bt_animatin);

        //Hooks
        image=findViewById(R.id.imageView);
        txtView1=findViewById(R.id.textView);
        txtView2 =findViewById(R.id.textView2);

        image.setAnimation(topAnimation);
        txtView1.setAnimation(botAnimation);
        txtView2.setAnimation(botAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreenActivity.this,DashboardActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}