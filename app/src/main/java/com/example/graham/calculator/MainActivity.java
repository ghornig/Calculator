package com.example.graham.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String calcview=null;
    private String oldcalcview=null;
    private String OP=null;

    TextView text = (TextView) findViewById(R.id.textView2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void numPad(int number, View view) {

        calcview = calcview + Double.toString(number);

        text.setText(calcview);

    }

    public void plus(View view) {
        if (OP.equals("p")){
           oldcalcview = Double.toString(Double.parseDouble(oldcalcview) + Double.parseDouble(calcview));
        } else if (OP.equals("m")) {
           oldcalcview = Double.toString(Double.parseDouble(oldcalcview) * Double.parseDouble(calcview));
        }

        oldcalcview = calcview;
        calcview = "";
        OP = "p";
        text.setText(calcview);
    }

    public void multiply(View view) {
        if (OP.equals("p")){
            oldcalcview = Double.toString(Double.parseDouble(oldcalcview) + Double.parseDouble(calcview));
        } else if (OP.equals("m")) {
            oldcalcview = Double.toString(Double.parseDouble(oldcalcview) * Double.parseDouble(calcview));
        }

        oldcalcview = calcview;
        calcview = "";
        OP = "m";
        text.setText(calcview);
    }


    public void equals(View view) {
        if (OP.equals("p")) {
            oldcalcview = Double.toString(Double.parseDouble(oldcalcview) + Double.parseDouble(calcview));
        } else if (OP.equals("m")) {
            oldcalcview = Double.toString(Double.parseDouble(oldcalcview) * Double.parseDouble(calcview));
        }

        oldcalcview = calcview;
        text.setText(calcview);
    }

    public void clear(View view) {

        oldcalcview = "";
        calcview = "";
        OP = "";
        text.setText(calcview);
    }
}
