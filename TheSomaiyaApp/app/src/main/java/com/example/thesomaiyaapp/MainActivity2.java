package com.example.thesomaiyaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    static int a,b;
    TextView sem;
    int bttn[] = {R.id.button, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8};
    int d,l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView txt;
        Button btn;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RelativeLayout Layout1 = (RelativeLayout) findViewById(R.id.activity_sem);
        switch (a) {
            case 1:
                Layout1.setBackgroundColor(getResources().getColor(R.color.LightPurple));
                for (int i = 0; i < 8; i++) {
                    btn = (Button) findViewById(bttn[i]);
                    btn.setTextColor(getResources().getColor(R.color.DarkPurple));
                }
                d=getResources().getColor(R.color.DarkPurple);
                l=getResources().getColor(R.color.LightPurple);
                txt = (TextView) findViewById(R.id.textView);
                txt.setTextColor(getResources().getColor(R.color.DarkPurple));

                break;
            case 2:
                Layout1.setBackgroundColor(getResources().getColor(R.color.LightOrange));
                for (int i = 0; i < 8; i++) {
                    btn = (Button) findViewById(bttn[i]);
                    btn.setTextColor(getResources().getColor(R.color.DarkOrange));
                }
                d= getResources().getColor(R.color.DarkOrange);
                l=getResources().getColor(R.color.LightOrange);
                txt = (TextView) findViewById(R.id.textView);
                txt.setTextColor(getResources().getColor(R.color.DarkOrange));
                break;
            case 3:
                Layout1.setBackgroundColor(getResources().getColor(R.color.LightBlue));
                for (int i = 0; i < 8; i++) {
                    btn = (Button) findViewById(bttn[i]);
                    btn.setTextColor(getResources().getColor(R.color.DarkBlue));
                }
                d=getResources().getColor(R.color.DarkBlue);
                l=getResources().getColor(R.color.LightBlue);
                txt = (TextView) findViewById(R.id.textView);
                txt.setTextColor(getResources().getColor(R.color.DarkBlue));
                break;
            case 4:
                Layout1.setBackgroundColor(getResources().getColor(R.color.LightRed));
                for (int i = 0; i < 8; i++) {
                    btn = (Button) findViewById(bttn[i]);
                    btn.setTextColor(getResources().getColor(R.color.DarkRed));
                }
                d= getResources().getColor(R.color.DarkRed);
                l=getResources().getColor(R.color.LightRed);
                txt = (TextView) findViewById(R.id.textView);
                txt.setTextColor(getResources().getColor(R.color.DarkRed));
                break;
            case 5:
                Layout1.setBackgroundColor(getResources().getColor(R.color.LightGreen));
                for (int i = 0; i < 8; i++) {
                    btn = (Button) findViewById(bttn[i]);
                    d=getResources().getColor(R.color.DarkGreen);
                    l=getResources().getColor(R.color.LightGreen);
                    btn.setTextColor(getResources().getColor(R.color.DarkGreen));
                }
                txt = (TextView) findViewById(R.id.textView);
                txt.setTextColor(getResources().getColor(R.color.DarkGreen));
                break;
        }
        MainActivity3 m3=new MainActivity3();
        m3.getcol(d,l);

    }
    public static void getView(int n) {
        a = n;
        ExpandableListDataPump e=new ExpandableListDataPump();
        e.getdept(a);
    }

    public void Onclick(View v) {
         b=v.getId();
        ExpandableListDataPump e=new ExpandableListDataPump();
        e.getsem(b);
        Intent i = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(i);
    }
}
