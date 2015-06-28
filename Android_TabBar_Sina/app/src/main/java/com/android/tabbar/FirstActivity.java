package com.android.tabbar;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity {
	/** Called when the activity is first created. */
	private Button button;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.first);
		button = (Button)findViewById(R.id.detailButton);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent();
				intent.setClass(FirstActivity.this, Detail.class);
				FirstActivity.this.startActivity(intent);
			}
		});
		
		
	}
}