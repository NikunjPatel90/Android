package com.example.patelnikunjhwk6;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends Activity {
	
	
	 public void onCreate(Bundle savedInstanceState)
	 {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.homescreen);
		   
		    Button configuration = (Button)findViewById(R.id.Configbtn);

		    configuration.setOnClickListener(new Button.OnClickListener()
		    {
		      public void onClick(View arg0)
		      {
		    	  setContentView(R.layout.configuration);

		    	 // Intent i = new Intent(HomeScreen.this, Configuration.class);
			     // startActivity(i);
		      }
		      

		    });
	 }
		  


}
