package com.example.thesomaiyaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView sem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void opensem(View v) {
        int m=0;
        MainActivity2 s=new MainActivity2();
        BookActivity b=new BookActivity();
        switch(v.getId()){
            case R.id.comp: s.getView(1);
                b.getView(1);
                break;
            case R.id.it: s.getView(2);
                b.getView(2);
                break;
            case R.id.etrx:s.getView(3);
                break;
            case R.id.mech:s.getView(4);
                break;
            case R.id.extc:s.getView(5);
                break;

        }
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i);





    }
}
