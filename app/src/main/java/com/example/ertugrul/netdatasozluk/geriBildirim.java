package com.example.ertugrul.netdatasozluk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class geriBildirim extends Activity {
String baslik,mesaj;
    EditText t1,t2;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.action_ayarlar){
            Intent i = new Intent(geriBildirim.this, geriBildirim.class);
            startActivity(i);
        }
        else if(item.getItemId() == R.id.action_ayarlar2){
            Intent i = new Intent(geriBildirim.this, hakkinda.class);
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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.geri_bildirim);
        //Koyduğumuz buton'u gerçekliyoruz.
        Button dugme = (Button)findViewById(R.id.mailGonder);
       t1=(EditText) findViewById(R.id.basAl) ;
        t2=(EditText) findViewById(R.id.mesajAl);
        //Buton'a basılma interrupt'ını oluşturuyoruz.
        dugme.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //Bir email intent'i oluşturuyoruz.
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"gunduzert@gmail.com"});
                baslik=t1.getText().toString();
                mesaj=t2.getText().toString();
                email.putExtra(Intent.EXTRA_SUBJECT, baslik);
                email.putExtra(Intent.EXTRA_TEXT, mesaj);
                email.setType("text/html");
                startActivity(Intent.createChooser(email, "Gönderme Yonunu Seçiniz"));
                t1.setText("");
                t2.setText("");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Action Bar içinde kullanılacak menü öğelerini inflate edelim
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
}

