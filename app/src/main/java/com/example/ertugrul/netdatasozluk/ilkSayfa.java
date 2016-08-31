package com.example.ertugrul.netdatasozluk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ilkSayfa extends Activity {
    private   void menuEkraninaGec() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        ImageView girisLogo = (ImageView) findViewById(R.id.imageView);
        anim.reset();
        girisLogo.clearAnimation();
        girisLogo.startAnimation(anim);
        anim.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(ilkSayfa.this, menuBaglanti.class);
                startActivity(intent);
                ilkSayfa.this.finish();
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilk_sayfa);
        menuEkraninaGec();
    }
}
