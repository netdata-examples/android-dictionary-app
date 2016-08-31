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

public class bilimSozlugu extends Activity {
    static NodeList nodeBilSoz;
    Button agacIsleri, Araba, Asalak, Atletizm, Ayaktopu, Aydınlatma, Basketbol, Bilisimm, Biyoloji,
            Boks, Budun, Cografyaa, DilBilgisi, Dilbilim, Döseme, Edebiyat,
            Eggitim, Felsefe, Fizik, Fiziksel, Gokk, Gosster, Graamer, Gumrukk,
            Guress, GuzelSanat, HalkBil, IktiEco, istatistikk, Jimnastik, kentBi,
            killic, kimmya, kitaplikk, Kriminal, mant, matt, medenihu, metall, nukk, otom,
            ruhh, sinemaa, su, Tarih, Tecim, Tıp, Tiyatro, toplumm,
            turkk, Uygulayım, yapimm, yapitHa, Yargılama, yazinn, Yerbilim, Yöntembilim,
            Veteriner, Voleybol, Zanaat, Zooloji;
    public static String urlAl;
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
            Intent i = new Intent(bilimSozlugu.this, geriBildirim.class);
            startActivity(i);
        }
        else if(item.getItemId() == R.id.action_ayarlar2){
            Intent i = new Intent(bilimSozlugu.this, hakkinda.class);
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
        setContentView(R.layout.bilimsoz);
        agacIsleri = (Button) findViewById(R.id.agacIsleri);
        Araba = (Button) findViewById(R.id.Araba);
        Asalak = (Button) findViewById(R.id.Asalak);
        Atletizm = (Button) findViewById(R.id.Atletizm);
        Ayaktopu = (Button) findViewById(R.id.Ayaktopu);
        Aydınlatma = (Button) findViewById(R.id.Aydınlatma);
        Basketbol = (Button) findViewById(R.id.Basketbol);
        Bilisimm = (Button) findViewById(R.id.Bilisimm);
        Biyoloji = (Button) findViewById(R.id.Biyoloji);
        Boks = (Button) findViewById(R.id.Boks);
        Budun = (Button) findViewById(R.id.Budun);
        Cografyaa = (Button) findViewById(R.id.Cografyaa);
        DilBilgisi = (Button) findViewById(R.id.DilBilgisi);
        Dilbilim = (Button) findViewById(R.id.Dilbilim);
        Döseme = (Button) findViewById(R.id.Döseme);
        Edebiyat = (Button) findViewById(R.id.Edebiyat);
        Eggitim = (Button) findViewById(R.id.Eggitim);
        Felsefe = (Button) findViewById(R.id.Felsefe);
        Fizik = (Button) findViewById(R.id.Fizik);
        Fiziksel = (Button) findViewById(R.id.Fiziksell);
        Gokk = (Button) findViewById(R.id.Gokk);
        Gosster = (Button) findViewById(R.id.Gosster);
        Graamer = (Button) findViewById(R.id.Graamer);
        Gumrukk = (Button) findViewById(R.id.Gumrukk);
        Guress = (Button) findViewById(R.id.Guress);
        GuzelSanat = (Button) findViewById(R.id.GuzelSanat);
        HalkBil = (Button) findViewById(R.id.HalkBil);
        IktiEco = (Button) findViewById(R.id.IktiEco);
        istatistikk = (Button) findViewById(R.id.istatistikk);
        Jimnastik = (Button) findViewById(R.id.Jimnastik);
        kentBi = (Button) findViewById(R.id.kentBi);
        killic = (Button) findViewById(R.id.killic);
        kimmya = (Button) findViewById(R.id.kimmya);
        kitaplikk = (Button) findViewById(R.id.kitaplikk);
        Kriminal = (Button) findViewById(R.id.Kriminal);
        mant = (Button) findViewById(R.id.mant);
        matt = (Button) findViewById(R.id.matt);
        medenihu = (Button) findViewById(R.id.medenihu);
        metall = (Button) findViewById(R.id.metall);
        nukk = (Button) findViewById(R.id.nukk);
        otom = (Button) findViewById(R.id.otom);
        ruhh = (Button) findViewById(R.id.ruhh);
        su = (Button) findViewById(R.id.su);
        sinemaa = (Button) findViewById(R.id.sinemaa);
        Tarih = (Button) findViewById(R.id.Tarih);
        Tecim = (Button) findViewById(R.id.Tecim);
        Tıp = (Button) findViewById(R.id.Tıp);
        Tiyatro = (Button) findViewById(R.id.Tiyatro);
        toplumm = (Button) findViewById(R.id.toplumm);
        turkk = (Button) findViewById(R.id.turkk);
        Uygulayım = (Button) findViewById(R.id.Uygulayım);
        Veteriner = (Button) findViewById(R.id.Veteriner);
        Voleybol = (Button) findViewById(R.id.Voleybol);
        yapimm = (Button) findViewById(R.id.yapimm);
        yapitHa = (Button) findViewById(R.id.yapitHa);
        Yargılama = (Button) findViewById(R.id.Yargılama);
        yazinn = (Button) findViewById(R.id.yazinn);
        Yerbilim = (Button) findViewById(R.id.Yerbilim);
        Yöntembilim = (Button) findViewById(R.id.Yöntembilim);
        Zanaat = (Button) findViewById(R.id.Zanaat);
        Zooloji = (Button) findViewById(R.id.Zooloji);
        if (agacIsleri.isEnabled() == true) {
            agacIsleri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent j = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(j);
                    urlAl = "https://www.netdata.com/XML/ef098383";
                }
            });
        }
        if (Araba.isEnabled() == true) {
            Araba.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent j = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(j);
                    urlAl = "https://www.netdata.com/XML/7897261b";
                }
            });
        }
        if (Asalak.isEnabled() == true) {
            Asalak.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/6975462c";
                }
            });
        }
        if (Atletizm.isEnabled() == true) {
            Atletizm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/bd18631b";
                }

            });
        }
        if (Ayaktopu.isEnabled() == true) {
            Ayaktopu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/3770a73a";
                }

            });
        }
        if (Aydınlatma.isEnabled() == true) {
            Aydınlatma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/25a1a234";
                }

            });
        }
        if (Basketbol.isEnabled() == true) {
            Basketbol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/eb2c5176";
                }

            });
        }
        if (Bilisimm.isEnabled() == true) {
            Bilisimm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/cde09eba";
                }

            });
        }
        if (Biyoloji.isEnabled() == true) {
            Biyoloji.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/23cf8f95";
                }

            });
        }
        if (Boks.isEnabled() == true) {
            Boks.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/709e7ceb";
                }

            });
        }
        if (Budun.isEnabled() == true) {
            Budun.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/9a5e6b44";
                }

            });
        }
        if (Cografyaa.isEnabled() == true) {
            Cografyaa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/6e5f2ab8";
                }

            });
        }
        if (DilBilgisi.isEnabled() == true) {
            DilBilgisi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/7194969e";
                }
            });
        }
        if (Dilbilim.isEnabled() == true) {
            Dilbilim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/bfd80fdf";
                }

            });
        }
        if (Döseme.isEnabled() == true) {
            Döseme.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/ac902df1";
                }

            });
        }
        if (Edebiyat.isEnabled() == true) {
            Edebiyat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/85c2f87d";
                }

            });
        }
        if (Eggitim.isEnabled() == true) {
            Eggitim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/051c12db";
                }

            });
        }

        if (Felsefe.isEnabled() == true) {
            Felsefe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/2331c917";
                }

            });
        }

        if (Fizik.isEnabled() == true) {
            Fizik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/8b750098";
                }

            });
        }
        if (Fiziksel.isEnabled() == true) {
            Fiziksel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/e38922ed";
                }

            });
        }
        if (Gokk.isEnabled() == true) {
            Gokk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/acf0d750";
                }

            });
        }
        if (Gosster.isEnabled() == true) {
            Gosster.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/c95f29fd";
                }

            });
        }
        if (Graamer.isEnabled() == true) {
            Graamer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/ecdd9c7d";
                }

            });
        }
        if (Gumrukk.isEnabled() == true) {
            Gumrukk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/310b54c1";
                }

            });
        }
        if (Guress.isEnabled() == true) {
            Guress.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/fea83385";
                }

            });
        }
        if (GuzelSanat.isEnabled() == true) {
            GuzelSanat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/ba3e3884";
                }

            });
        }
        if (HalkBil.isEnabled() == true) {
            HalkBil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/27480754";
                }

            });
        }
        if (IktiEco.isEnabled() == true) {
            IktiEco.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/9200e8ee";
                }

            });
        }
        if (istatistikk.isEnabled() == true) {
            istatistikk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/186b79d5";
                }

            });
        }
        if (Jimnastik.isEnabled() == true) {
            Jimnastik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/3b1ab6fa";
                }

            });
        }
        if (kentBi.isEnabled() == true) {
            kentBi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/b9306bc6";
                }

            });
        }
        if (killic.isEnabled() == true) {
            killic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/85157ad0";
                }

            });
        }
        if (kimmya.isEnabled() == true) {
            kimmya.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/9bb34c87";
                }

            });
        }
        if (kitaplikk.isEnabled() == true) {
            kitaplikk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/774e0278";
                }

            });
        }
        if (Kriminal.isEnabled() == true) {
            Kriminal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/4915fd04";
                }

            });
        }
        if (mant.isEnabled() == true) {
            mant.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/614c5465";
                }

            });
        }
        if (matt.isEnabled() == true) {
            matt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/90572dfa";
                }

            });
        }
        if (medenihu.isEnabled() == true) {
            medenihu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/fe0b110e";
                }

            });
        }
        if (metall.isEnabled() == true) {
            metall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/b041d768";
                }

            });
        }
        if (nukk.isEnabled() == true) {
            nukk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/7e627e0c";
                }

            });
        }
        if (otom.isEnabled() == true) {
            otom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/ea29639f";
                }

            });
        }
        if (ruhh.isEnabled() == true) {
            ruhh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/77812cac";
                }

            });
        }
        if (su.isEnabled() == true) {
            su.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/c06fd169";
                }

            });
        }
        if (sinemaa.isEnabled() == true) {
            sinemaa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/823fba8b";
                }

            });
        }
        if (Tarih.isEnabled() == true) {
            Tarih.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/b8376563";
                }

            });
        }
        if (Tecim.isEnabled() == true) {
            Tecim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/4cfbbe4f";
                }

            });
        }
        if (Tıp.isEnabled() == true) {
            Tıp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/65afcd40";
                }

            });
        }
        if (Tiyatro.isEnabled() == true) {
            Tiyatro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/98ceb590";
                }

            });
        }
        if (toplumm.isEnabled() == true) {
            toplumm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/712f80aa";
                }

            });
        }
        if (turkk.isEnabled() == true) {
            turkk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/a15cde8e";
                }

            });
        }
        if (Uygulayım.isEnabled() == true) {
            Uygulayım.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/0cd07b80";
                }

            });
        }
        if (yapimm.isEnabled() == true) {
            yapimm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/86671c27";
                }

            });
        }
        if (yapitHa.isEnabled() == true) {
            yapitHa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/0fc9f50a";
                }

            });
        }
        if (yazinn.isEnabled() == true) {
            yazinn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/ebc709e8";
                }

            });
        }
        if (Yerbilim.isEnabled() == true) {
            Yerbilim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/6b1d782a";
                }

            });
        }
        if (Yöntembilim.isEnabled() == true) {
            Yöntembilim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/0d3b3b50";
                }

            });
        }

        if (Zanaat.isEnabled() == true) {
            Zanaat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/0606dfdb";
                }

            });
        }
        if (Zooloji.isEnabled() == true) {
            Zooloji.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/fb849e7d";
                }

            });
        }
        if (Veteriner.isEnabled() == true) {
            Veteriner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/adcd6990";
                }
            });
        }
        if (Voleybol.isEnabled() == true) {
            Voleybol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/b2d1e9ba";
                }
            });
        }
        if (Yargılama.isEnabled() == true) {
            Yargılama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(bilimSozlugu.this, bilisimOrtak.class);
                    startActivity(k);
                    urlAl = "https://www.netdata.com/XML/31750813";
                }
            });
        }
    }
}