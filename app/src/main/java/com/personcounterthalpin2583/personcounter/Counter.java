package com.personcounterthalpin2583.personcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Counter extends AppCompatActivity {
     Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.idBtn);

      }
    public void btnClick(View view){
        Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show();
    }
}
