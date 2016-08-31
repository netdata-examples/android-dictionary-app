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

public class vocabulary extends Activity {

    Button ba, bb, bc, bd, bf, be, bg, bk, bl, bm, bn, bp, br, bq;
    static NodeList baa;
    static NodeList bbb;
    static NodeList bcc;
    static NodeList bdd;
    static NodeList bff;
    static NodeList bee;
    static NodeList bgg;
    static NodeList bkk;
    static NodeList bll;
    static NodeList bmm;
    static NodeList bnn;
    static NodeList bpp;
    static NodeList brr;
    static NodeList bqq;
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
            Intent i = new Intent(vocabulary.this, geriBildirim.class);
            startActivity(i);
        }
        else if(item.getItemId() == R.id.action_ayarlar2){
            Intent i = new Intent(vocabulary.this, hakkinda.class);
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
        setContentView(R.layout.vocabulary);
        ba = (Button) findViewById(R.id.ba);
        bb = (Button) findViewById(R.id.bb);
        bc = (Button) findViewById(R.id.bc);
        bd = (Button) findViewById(R.id.bd);
        bf = (Button) findViewById(R.id.be);
        be = (Button) findViewById(R.id.bf);
        bg = (Button) findViewById(R.id.bg);
        bk = (Button) findViewById(R.id.bk);
        bl = (Button) findViewById(R.id.bl);
        bm = (Button) findViewById(R.id.bm);
        bn = (Button) findViewById(R.id.bn);
        bp = (Button) findViewById(R.id.bp);
        br = (Button) findViewById(R.id.br);
        bq = (Button) findViewById(R.id.bq);

        if (ba.isEnabled() == true) {
            ba.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(vocabulary.this, ba.class);
                    startActivity(i);
                }
            });
        }
        if (bb.isEnabled() == true) {
            bb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(vocabulary.this, bb.class);
                    startActivity(i);
                }
            });
        }
        if (bc.isEnabled() == true) {
            bc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent j = new Intent(vocabulary.this, bc.class);
                    startActivity(j);
                }
            });
        }
        if (bd.isEnabled() == true) {
            bd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(vocabulary.this, bd.class);
                    startActivity(k);
                }
            });
        }
        if (be.isEnabled() == true) {
            be.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent l = new Intent(vocabulary.this, be.class);
                    startActivity(l);
                }
            });
        }
        if (bf.isEnabled() == true) {
            bf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent l = new Intent(vocabulary.this, bf.class);
                    startActivity(l);
                }
            });
        }
        if (bg.isEnabled() == true) {
            bg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent l = new Intent(vocabulary.this, bg.class);
                    startActivity(l);

                }
            });
        }
        if (bk.isEnabled() == true) {
            bk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent l = new Intent(vocabulary.this, bk.class);
                    startActivity(l);
                }
            });
        }
        if (bl.isEnabled() == true) {
            bl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent l = new Intent(vocabulary.this, bl.class);
                    startActivity(l);

                }
            });
        }
        if (bm.isEnabled() == true) {
            bm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent l = new Intent(vocabulary.this, bm.class);
                    startActivity(l);

                }
            });
        }
        if (bn.isEnabled() == true) {
            bn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent l = new Intent(vocabulary.this, bn.class);
                    startActivity(l);

                }
            });
        }
        if (bp.isEnabled() == true) {
            bp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent l = new Intent(vocabulary.this, bp.class);
                    startActivity(l);

                }
            });
        }
        if (br.isEnabled() == true) {
            br.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent l = new Intent(vocabulary.this, br.class);
                    startActivity(l);

                }
            });
        }
        if (bq.isEnabled() == true) {
            bq.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent l = new Intent(vocabulary.this, bq.class);
                    startActivity(l);

                }
            });
        }


    }
}