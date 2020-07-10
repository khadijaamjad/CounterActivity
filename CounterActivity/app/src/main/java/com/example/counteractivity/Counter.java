package com.example.counteractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Counter extends AppCompatActivity {
    TextView txtCount;
    public static int activities=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        txtCount=(TextView)findViewById(R.id.textview);
    }
    @Override
    protected void onResume() {
        activities++;
        txtCount.setText(Integer.toString(activities));
        super.onResume();
    }

    public void btnAclicked(View view) {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}