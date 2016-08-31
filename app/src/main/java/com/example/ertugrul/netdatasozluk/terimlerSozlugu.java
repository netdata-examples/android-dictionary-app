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

public class terimlerSozlugu extends Activity {
    static NodeList noDeLiTerSoz;
    Button aga, asa, atlet, ayak, bilisimter, biyo, boks, bud, ceza,
            cografya, cift, dilbil, dilbilim, dose, edep, egiti,
            felsefe, fiz, fiziksel, gok, goster, gramer, gumruk,
            gures, guzel, halk, iktisat, istatistik, kent, kilic,
            kimya, kitaplik, mantik, medeni, metal, mat, nuk, oto,
            ruh, basket, sinema, tari, tecim, tip, tiyatro, toplum,
            turk, uygula, yap, yapit, yazin, yerbilim, yontembilim,
            vet, vole, zaanat, zoolo;
    public static String urlVer;
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
            Intent i = new Intent(terimlerSozlugu.this, geriBildirim.class);
            startActivity(i);
        }
        else if(item.getItemId() == R.id.action_ayarlar2){
            Intent i = new Intent(terimlerSozlugu.this, hakkinda.class);
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
        setContentView(R.layout.terimlersozlugu);
        aga = (Button) findViewById(R.id.agac);
        asa = (Button) findViewById(R.id.asalak);
        atlet = (Button) findViewById(R.id.atlet);
        ayak = (Button) findViewById(R.id.ayak);
        bilisimter = (Button) findViewById(R.id.bilisimter);
        biyo = (Button) findViewById(R.id.biyo);
        boks = (Button) findViewById(R.id.boks);
        bud = (Button) findViewById(R.id.bud);
        ceza = (Button) findViewById(R.id.ceza);
        cografya = (Button) findViewById(R.id.cografya);
        cift = (Button) findViewById(R.id.cift);
        dilbil = (Button) findViewById(R.id.dilbil);
        dilbilim = (Button) findViewById(R.id.dilbilim);
        dose = (Button) findViewById(R.id.dose);
        edep = (Button) findViewById(R.id.edep);
        egiti = (Button) findViewById(R.id.egiti);
        felsefe = (Button) findViewById(R.id.felsefe);
        fiz = (Button) findViewById(R.id.fiz);
        fiziksel = (Button) findViewById(R.id.fiziksel);
        gok = (Button) findViewById(R.id.gok);
        goster = (Button) findViewById(R.id.goster);
        gramer = (Button) findViewById(R.id.gramer);
        gumruk = (Button) findViewById(R.id.gumruk);
        gures = (Button) findViewById(R.id.gures);
        guzel = (Button) findViewById(R.id.guzel);
        halk = (Button) findViewById(R.id.halk);
        iktisat = (Button) findViewById(R.id.iktisat);
        istatistik = (Button) findViewById(R.id.istatistik);
        kent = (Button) findViewById(R.id.kent);
        kilic = (Button) findViewById(R.id.kilic);
        kimya = (Button) findViewById(R.id.kimya);
        kitaplik = (Button) findViewById(R.id.kitaplik);
        mantik = (Button) findViewById(R.id.mantik);
        medeni = (Button) findViewById(R.id.medeni);
        metal = (Button) findViewById(R.id.metal);
        mat = (Button) findViewById(R.id.mat);
        nuk = (Button) findViewById(R.id.nuk);
        oto = (Button) findViewById(R.id.oto);
        ruh = (Button) findViewById(R.id.ruh);
        basket = (Button) findViewById(R.id.basket);
        sinema = (Button) findViewById(R.id.sinema);
        tari = (Button) findViewById(R.id.tari);
        tecim = (Button) findViewById(R.id.tecim);
        tip = (Button) findViewById(R.id.tip);
        tiyatro = (Button) findViewById(R.id.tiyatro);
        toplum = (Button) findViewById(R.id.toplum);
        turk = (Button) findViewById(R.id.turk);
        uygula = (Button) findViewById(R.id.uygula);
        yap = (Button) findViewById(R.id.yap);
        yapit = (Button) findViewById(R.id.yapit);
        yazin = (Button) findViewById(R.id.yazin);
        yerbilim = (Button) findViewById(R.id.yerbilim);
        yontembilim = (Button) findViewById(R.id.yontembilim);
        vet = (Button) findViewById(R.id.vet);
        vole = (Button) findViewById(R.id.vole);
        zaanat = (Button) findViewById(R.id.zaanat);
        zoolo = (Button) findViewById(R.id.zoolo);
        if (aga.isEnabled() == true) {
            aga.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent j = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(j);
                    urlVer = "https://www.netdata.com/XML/c9041046";
                }
            });
        }
        if (asa.isEnabled() == true) {
            asa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent j = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(j);
                    urlVer = "https://www.netdata.com/XML/94783a00";
                }
            });
        }
        if (atlet.isEnabled() == true) {
            atlet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/4160f400";
                }

            });
        }
        if (ayak.isEnabled() == true) {
            ayak.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/22ff973c";
                }

            });
        }
        if (bilisimter.isEnabled() == true) {
            bilisimter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/9673a5bf";
                }

            });
        }
        if (biyo.isEnabled() == true) {
            biyo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/b2c0a8f1";
                }

            });
        }
        if (bud.isEnabled() == true) {
            bud.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/a5093db0";
                }

            });
        }
        if (ceza.isEnabled() == true) {
            ceza.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/dec26538";
                }

            });
        }
        if (cografya.isEnabled() == true) {
            cografya.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/3cb12158";
                }

            });
        }
        if (cift.isEnabled() == true) {
            cift.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/b4ccfb3e";
                }

            });
        }
        if (dilbil.isEnabled() == true) {
            dilbil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/ff0bb940";
                }

            });
        }
        if (dilbilim.isEnabled() == true) {
            dilbilim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/03da7dd0";
                }

            });
        }
        if (dose.isEnabled() == true) {
            dose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/de02c349";
                }

            });
        }
        if (edep.isEnabled() == true) {
            edep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/6f6f7889";
                }

            });
        }
        if (egiti.isEnabled() == true) {
            egiti.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/61a1f80c";
                }

            });
        }
        if (felsefe.isEnabled() == true) {
            felsefe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/495a44de";
                }

            });
        }
        if (fiz.isEnabled() == true) {
            fiz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/66cbaf5c";
                }
            });
        }
        if (fiziksel.isEnabled() == true) {
            fiziksel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/eded9ec0";
                }

            });
        }
        if (gok.isEnabled() == true) {
            gok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/766ded96";
                }
            });
        }
        if (goster.isEnabled() == true) {
            goster.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/b3ee9877";
                }

            });
        }
        if (gramer.isEnabled() == true) {
            gramer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/14ba498f";
                }

            });
        }
        if (gumruk.isEnabled() == true) {
            gumruk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/0291711a";
                }

            });
        }
        if (gures.isEnabled() == true) {
            gures.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/22c27ee1";
                }

            });
        }
        if (guzel.isEnabled() == true) {
            guzel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/8d7b69b6";
                }

            });
        }
        if (halk.isEnabled() == true) {
            halk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/57cb1d6c";
                }

            });
        }
        if (iktisat.isEnabled() == true) {
            iktisat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/c877b2f7";
                }

            });
        }
        if (kent.isEnabled() == true) {
            kent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/03584506";
                }

            });
        }
        if (kilic.isEnabled() == true) {
            kilic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/72ad3b77";
                }
            });
        }
        if (kimya.isEnabled() == true) {
            kimya.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/f82661cf";
                }

            });
        }
        if (kitaplik.isEnabled() == true) {
            kitaplik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/a809c6c8";
                }

            });
        }
        if (istatistik.isEnabled() == true) {
            istatistik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/69f52ae3";
                }

            });
        }
        if (mantik.isEnabled() == true) {
            mantik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/13d8d222";
                }

            });

        }
        if (medeni.isEnabled() == true) {

            medeni.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/519f203f";
                }

            });
        }
        if (metal.isEnabled() == true) {
            metal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/17cdb33f";
                }

            });
        }
        if (mat.isEnabled() == true) {
            mat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/dbc7f8a8";
                }

            });
        }
        if (nuk.isEnabled() == true) {
            nuk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/b4c61215";
                }

            });
        }
        if (oto.isEnabled() == true) {
            oto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/a77bf48f";
                }

            });
        }
        if (ruh.isEnabled() == true) {
            ruh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/242e7375";
                }

            });
        }
        if (basket.isEnabled() == true) {
            basket.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/03f4dd1d";
                }

            });
        }
        if (sinema.isEnabled() == true) {
            sinema.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/dacbc43b";
                }

            });
        }
        if (tari.isEnabled() == true) {
            tari.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/f6bd9d96";
                }

            });
        }
        if (tecim.isEnabled() == true) {
            tecim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/1cabb474";
                }

            });
        }
        if (tip.isEnabled() == true) {
            tip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/694926c9";
                }

            });
        }
        if (tiyatro.isEnabled() == true) {
            tiyatro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/8d19ac57";
                }

            });
        }
        if (toplum.isEnabled() == true) {
            toplum.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/cc918306";
                }

            });
        }
        if (turk.isEnabled() == true) {
            turk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/d355e7a2";
                }

            });
        }
        if (uygula.isEnabled() == true) {
            uygula.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/a460485c";
                }

            });
        }
        if (yap.isEnabled() == true) {
            yap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/b7ed5265";
                }

            });
        }
        if (yapit.isEnabled() == true) {
            yapit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/20d33e8c";
                }

            });
        }
        if (yazin.isEnabled() == true) {
            yazin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/cec03d3e";
                }

            });
        }
        if (yerbilim.isEnabled() == true) {
            yerbilim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/c614c53c";
                }

            });
        }
        if (yontembilim.isEnabled() == true) {
            yontembilim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/cabf9837";
                }

            });
        }
        if (boks.isEnabled() == true) {
            boks.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/8d6d3ba9";
                }

            });
        }
        if (zaanat.isEnabled() == true) {

            zaanat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/5ce8961b";
                }

            });
        }
        if (zoolo.isEnabled() == true) {
            zoolo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/f2729db5";

                }

            });
        }
        if (vet.isEnabled() == true) {
            vet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/b9b08698";

                }

            });
        }
        if (vole.isEnabled() == true) {
            vole.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent k = new Intent(terimlerSozlugu.this, terimlerortak.class);
                    startActivity(k);
                    urlVer = "https://www.netdata.com/XML/d94e66f4";

                }

            });
        }
    }
}