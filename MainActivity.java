package com.mycompany.eStore;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.Menu.*;
import org.apache.http.conn.util.*;
import android.content.*;
import android.content.Intent;

public class MainActivity extends Activity 
{
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}
   

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId()) {
		case R.id.it1:
				Intent intent = new Intent(MainActivity.this, ajout.class);
			startActivity(intent);
			break;
			
					case R.id.it2:
						Intent intent2= new Intent(MainActivity.this, afficher.class);
						startActivity(intent2);
						break;
case R.id.it3:
						Intent intent3= new Intent(MainActivity.this, recherche.class);
						startActivity(intent3);
						break;
			
		}
		return super.onOptionsItemSelected(item);
	}
	@Override
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.main);  


    }  
	
}
