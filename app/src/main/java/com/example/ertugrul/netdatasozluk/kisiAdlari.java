package com.example.ertugrul.netdatasozluk;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class kisiAdlari extends Activity {
    TextView textview;
    NodeList nodelist;
    ProgressDialog pDialog;
    private ListView lv;
    ArrayAdapter<String> adapter;
    EditText inputSearch;
    String URL = "https://www.netdata.com/XML/bb1706de";
    List<String> arrList = new ArrayList<String>();
    List<String> arrList2 = new ArrayList<String>();
    List<String> arrList3 = new ArrayList<String>();
    List<String> arrList4 = new ArrayList<String>();
    List<String> id = new ArrayList<String>();
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
            Intent i = new Intent(kisiAdlari.this, geriBildirim.class);
            startActivity(i);
        }
        else if(item.getItemId() == R.id.action_ayarlar2){
            Intent i = new Intent(kisiAdlari.this, hakkinda.class);
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
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listeleme);
        lv = (ListView) findViewById(R.id.list_view);
        textview = (TextView) findViewById(R.id.product_name);
        inputSearch = (EditText) findViewById(R.id.inputSearch);
        if (digerleri.nodeKisi != null) {
            for (int temp = 0; temp < digerleri.nodeKisi.getLength(); temp++) {
                Node nNode = digerleri.nodeKisi.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    String b = getNode("dc_Isim", eElement);
                    String a = getNode("dc_Koken", eElement);
                    String c = getNode("dc_Cinsiyet", eElement);
                    String d = getNode("dc_Soylenisi", eElement);
                    String e = getNode("dc_Anlami", eElement);
                    arrList2.add(a);
                    arrList.add(b);
                    id.add(c);
                    arrList3.add(d);
                    arrList4.add(e);
                }
            }
            adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, arrList);
        } else {
            new DownloadXML().execute(URL);
            adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, arrList);
        }
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String a = (String) adapterView.getItemAtPosition(i);
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(kisiAdlari.this);
                for (int aw = 0; aw < digerleri.nodeKisi.getLength(); aw++) {
                    if (arrList.get(aw).equals(a)) {
                        alertDialog.setTitle(a);
                        alertDialog.setMessage(arrList2.get(aw)+"\n"+id.get(aw)+"\n"+arrList3.get(aw)+"\n"+arrList4.get(aw));
                    }
                }

                alertDialog.show();

            }

        });
        inputSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                kisiAdlari.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
            }

            @Override
            public void afterTextChanged(Editable arg0) {
            }
        });
    }

    private class DownloadXML extends AsyncTask<String, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(kisiAdlari.this);
            pDialog.setTitle("Sözlük Hazırlanıyor...");
            pDialog.setMessage("Yükleniyor...");
            pDialog.setIndeterminate(false);
            pDialog.show();
        }

        @Override
        protected Void doInBackground(String... Url) {
            try {
                java.net.URL url = new URL(Url[0]);
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document doc = db.parse(new InputSource(url.openStream()));
                doc.getDocumentElement().normalize();
                nodelist = doc.getElementsByTagName("DataRow");
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void args) {
            for (int temp = 0; temp < nodelist.getLength(); temp++) {
                Node nNode = nodelist.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    String b = getNode("dc_Isim", eElement);
                    String a = getNode("dc_Koken", eElement);
                    String c = getNode("dc_Cinsiyet", eElement);
                    String d = getNode("dc_Soylenisi", eElement);
                    String e = getNode("dc_Anlami", eElement);
                    arrList2.add(a);
                    arrList.add(b);
                    id.add(c);
                    arrList3.add(d);
                    arrList4.add(e);
                    digerleri.nodeKisi = nodelist;
                }
            }
            pDialog.dismiss();
        }
    }

    private static String getNode(String sTag, Element eElement) {
        NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
        Node nValue = (Node) nlList.item(0);
        if (nValue != null) {
            return nValue.getNodeValue();
        } else {
            String a = "...";
            return a;
        }

    }
}