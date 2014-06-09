package com.thenewboston.travis;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity {
	String classes[] = { "StartingPoint", "TextPlay", "example2",
			"example3", "example4", "example5", "example6" };
/*	String classes[] = { "startingPoint", "TextPlay", "example2",
			"example3", "example4", "example5", "example6" };*/

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		//setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
		//setListAdapter();
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		        android.R.layout.simple_list_item_1, classes);
		    setListAdapter(adapter);

	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		String cheese = classes[position];
		String lookFor = "com.thenewboston.travis."+cheese;
		super.onListItemClick(l, v, position, id);
		try{
			Class ourClass = Class.forName(lookFor);
			Intent ourIntent = new Intent(Menu.this, ourClass);
			startActivity(ourIntent);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
