package edu.sinica.testee;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private static final String TAG="TESTCASE";
	public void doButtonClick(View view){
		Log.v(TAG,"button 1 click!");
		
		TextView textView1=(TextView) this.findViewById(R.id.textView1);
		EditText editText1=(EditText) this.findViewById(R.id.editText1);
		textView1.setText(editText1.getText().toString());
	}
	
}
