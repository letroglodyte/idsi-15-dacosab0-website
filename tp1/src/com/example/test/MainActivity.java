package com.example.test;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	EditText text1;
	EditText text2;
	Button ex;
	Button del;
	Button sa;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text1 = (EditText) findViewById(R.id.editText1);
		text2 = (EditText) findViewById(R.id.editText2);
		ex = (Button) findViewById(R.id.button_exchange);
		del = (Button) findViewById(R.id.button_delete);
		sa = (Button) findViewById(R.id.show_alert);
		//final AlertDialog.Builder builder = new AlertDialog.Builder(null);		

		
		
	ex.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
	String t1 = "";
	String t2 = "";	
	t1 = text1.getText().toString();
	t2 = text2.getText().toString();
	text1.setText(t2);
	text2.setText(t1);
			
		}
	});
del.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
	text1.setText("");
	text2.setText("");
			
		}
	});
sa.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
		
		AlertDialog.Builder di = new AlertDialog.Builder(MainActivity.this);
		AlertDialog dialog = di.create();
		dialog.setTitle("Alert");
		dialog.setMessage("This is an alert message !");
		dialog.show();
		
	
	}

});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
