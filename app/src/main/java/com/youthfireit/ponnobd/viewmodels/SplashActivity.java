package com.youthfireit.ponnobd.viewmodels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

import com.youthfireit.ponnobd.MainActivity;
import com.youthfireit.ponnobd.R;
import com.youthfireit.ponnobd.databinding.ActivityMainBinding;
import com.youthfireit.ponnobd.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();
        setContentView(v);

        Thread splash = new Thread() {
            public void run() {
                try {
                    sleep(2 * 700);
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        splash.start();

        binding.splashLogo.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in));
    }
}