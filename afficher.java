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

  import java.util.*;
public class afficher extends Activity {  
    ListView listView;  
    TextView textView;  
    String[] listItem;  
    @Override
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.afficher);  
  
        listView=(ListView)findViewById(R.id.lv);  
        textView=(TextView)findViewById(R.id.tv);  
        listItem = getResources().getStringArray(R.array.array_technology);  
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,  
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);  
        listView.setAdapter(adapter);  
  
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {  
            @Override  
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {  
                // TODO Auto-generated method stub  
                String value=adapter.getItem(position);  
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();  
  
            }  
        });  
    }  
}