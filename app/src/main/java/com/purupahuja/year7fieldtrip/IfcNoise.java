package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IfcNoise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifc_noise);
        TextView inoip = (TextView) findViewById(R.id.inoip);
        SharedPreferences peakNoise = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        String inoipSP = peakNoise.getString("inoip", "0");
        inoip.setText(inoipSP);
    }

    public void inoip0(View v) {
        SharedPreferences peakNoise = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView inoip = (TextView) findViewById(R.id.inoip);
        int inoips = Integer.parseInt(inoip.getText().toString());
        inoips = inoips - 1;
        String inoipString = Integer.toString(inoips);
        inoip.setText(inoipString);
        peakNoise.edit().putString("inoip", inoipString).apply();
    }

    public void inoip1(View v) {
        SharedPreferences peakNoise = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView inoip = (TextView) findViewById(R.id.inoip);
        int inoips = Integer.parseInt(inoip.getText().toString());
        inoips = inoips + 1;
        String inoipString = Integer.toString(inoips);
        inoip.setText(inoipString);
        peakNoise.edit().putString("inoip", inoipString).apply();
    }

}
