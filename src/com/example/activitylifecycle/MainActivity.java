package com.example.activitylifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	
	   private Button second,third;
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
        second=(Button) this.findViewById(R.id.second);
        third=(Button)  this.findViewById(R.id.third);
        System.out.println("MainActivity's onCteate");

		second.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent=new Intent (MainActivity.this,SecondActivity.class);
				startActivity(intent);
				
			}
		});
	
		third.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent=new Intent (MainActivity.this,ThirdActivity.class);
				startActivity(intent);
				
			}
		});
     
		}
		protected void onStart(){
     		super.onStart();
          System.out.println("MainActivity's onStart");
     	}
     	protected void onRestart(){
     		super.onStart();
          System.out.println("MainActivity's onRestart");
     	}	
     	protected void onResume(){
     		super.onStart();
     	     System.out.println("MainActivity's onResume");
     		}
     	protected void onStop(){
     		super.onStart();
     	     System.out.println("MainActivity's onStop");
     		}	
     	protected void onDestory(){
     		super.onStart();
     	     System.out.println("MainActivity's onDestory");
     		}
     	protected void onPause(){
     		super.onStart();
     	     System.out.println("MainActivity's onPause");
     		}
	}