package com.example.thesomaiyaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity3 extends AppCompatActivity {
 static int clrd,clrl;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        RelativeLayout Layout1 = (RelativeLayout) findViewById(R.id.activity_pdvid);
        Layout1.setBackgroundColor(clrl);
        Button b=(Button)findViewById(R.id.button9);
        b.setTextColor(clrd);
        b=(Button)findViewById(R.id.button10);
        b.setTextColor(clrd);

    }
    public void openbook(View v){
        Intent i = new Intent(MainActivity3.this, BookActivity.class);
        startActivity(i);
    }
public void openvid(View v){
    Intent i = new Intent(MainActivity3.this, VideoActivity.class);
    startActivity(i);
}
    public void getcol(int d,int l){
       clrd=d;
        clrl=l;
    }
public int givcoll(){
    return clrl;
}
    public  int givcold(){
        return  clrd;
    }

}
