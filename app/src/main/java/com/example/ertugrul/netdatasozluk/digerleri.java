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

public class digerleri extends Activity {
    Button kisi;
    Button deyim;
    Button plaka;
    Button kisalt;
    static NodeList nodePlaka;
    static NodeList nodeKisi;
    static NodeList nodeKısa;
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
            Intent i = new Intent(digerleri.this, geriBildirim.class);
            startActivity(i);
        }
        else if(item.getItemId() == R.id.action_ayarlar2){
            Intent i = new Intent(digerleri.this, hakkinda.class);
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
        setContentView(R.layout.digerleri);
        kisi = (Button) findViewById(R.id.button9);
        deyim = (Button) findViewById(R.id.button10);
        plaka = (Button) findViewById(R.id.button11);
        kisalt = (Button) findViewById(R.id.button12);
        if (kisi.isEnabled() == true) {
            kisi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(digerleri.this, kisiAdlari.class);
                    startActivity(i);
                }
            });
        }
        if (deyim.isEnabled() == true) {
            deyim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent j = new Intent(digerleri.this, deyimler.class);
                    startActivity(j);
                }
            });
        }
        if (plaka.isEnabled() == true) {
            plaka.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(digerleri.this, plaka.class);
                    startActivity(k);
                }
            });
        }
        if (kisalt.isEnabled() == true) {
            kisalt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(digerleri.this, kisa.class);
                    startActivity(k);
                }
            });
        }
    }
}