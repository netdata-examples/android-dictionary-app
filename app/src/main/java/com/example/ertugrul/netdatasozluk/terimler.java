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

public class terimler extends Activity {
    Button ter;
    Button uzay;
    Button tip;
    Button bilim;
    static NodeList nodeUzay;
    static NodeList nodeCerrah;
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
            Intent i = new Intent(terimler.this, geriBildirim.class);
            startActivity(i);
        }
        else if(item.getItemId() == R.id.action_ayarlar2){
            Intent i = new Intent(terimler.this, hakkinda.class);
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
        setContentView(R.layout.terimler);
        ter = (Button) findViewById(R.id.button5);
        uzay = (Button) findViewById(R.id.button6);
        tip = (Button) findViewById(R.id.button7);
        bilim = (Button) findViewById(R.id.button8);
        if (ter.isEnabled() == true) {
            ter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(terimler.this, terimlerSozlugu.class);
                    startActivity(i);
                }
            });
        }
        if (uzay.isEnabled() == true) {
            uzay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent j = new Intent(terimler.this, uzaySozlugu.class);
                    startActivity(j);
                }
            });
        }
        if (tip.isEnabled() == true) {
            tip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimler.this, cerrahSozlugu.class);
                    startActivity(k);
                }
            });
        }
        if (bilim.isEnabled() == true) {
            bilim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimler.this, bilimSozlugu.class);
                    startActivity(k);
                }
            });
        }
    }
}