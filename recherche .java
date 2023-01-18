package com.mycompany.eStore;
  import android.app.*;
import android.os.*;
import android.os.Bundle;  
import android.view.View;  
import android.widget.AdapterView;  
import android.widget.ArrayAdapter;  
import android.widget.ListView;  
import android.widget.TextView;  
import android.widget.*;  

public class recherche extends Activity {

    SearchView searchView;
    ListView l;
    String[] s=new String[]{"Clavier","Souris","Haut-Parleurs","Microphone","Webcam","Processeur","Carte Graphique","Barette memoire RAM","Carte Mère","Boite d'alimentation",
            "ACER","LENOVO","ASUS","MSI","DELL","Philips","Basic","Asus","BenQ","BenQ Zowie","Disque Dur SSD","Disque Dur Interne","Disque Dur Externe","Clé USB","Carte Mémoire"};
    ArrayAdapter str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recherche);
        searchView=findViewById(R.id.searchview);
        l=findViewById(R.id.recherchelist);
        str = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,s);
        l.setAdapter(str);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                str.getFilter().filter(s);
                return false;
            }
        });
    }
}