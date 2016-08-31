package com.example.ertugrul.netdatasozluk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.NodeList;

public class ikinciSayfa extends Activity {
    Button ing;
    Button tur;
    Button alm;
    Button aTur;
    Button tering;
    static NodeList noDeLi;
    static NodeList noBes;
    static NodeList noDord;
    static NodeList noUc;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Action Bar içinde kullanılacak menü öğelerini inflate edelim
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.action_ayarlar){
            Intent i = new Intent(ikinciSayfa.this, geriBildirim.class);
            startActivity(i);
        }
        else if(item.getItemId() == R.id.action_ayarlar2){
            Intent i = new Intent(ikinciSayfa.this, hakkinda.class);
            startActivity(i);
        }else{
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci_sayfa);
        ing = (Button) findViewById(R.id.button2);
        tur = (Button) findViewById(R.id.button1);
        aTur = (Button) findViewById(R.id.buttonn3);
        alm = (Button) findViewById(R.id.buttonn4);
        tering = (Button) findViewById(R.id.button13);
        if (tur.isEnabled() == true) {
            tur.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ikinciSayfa.this, ucuncuSayfa.class);
                    startActivity(i);
                }
            });
        }
        if (tering.isEnabled() == true) {
            tering.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ikinciSayfa.this, vocabulary.class);
                    startActivity(i);
                }
            });
        }
        if (ing.isEnabled() == true) {

            ing.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent j = new Intent(ikinciSayfa.this, dorduncuSayfa.class);
                    startActivity(j);
                }
            });
        }
        if (aTur.isEnabled() == true) {
            aTur.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(ikinciSayfa.this, besinciSayfa.class);
                    startActivity(k);
                }

            });
        }
        if (alm.isEnabled() == true) {
            alm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent l = new Intent(ikinciSayfa.this, altinciSayfa.class);
                    startActivity(l);
                }
            });
        }
    }
}