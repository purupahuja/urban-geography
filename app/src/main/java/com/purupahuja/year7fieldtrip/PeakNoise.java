package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class PeakNoise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peak_noise);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView noip = (TextView) findViewById(R.id.noip);
        SharedPreferences peakNoise = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        String noipSP = peakNoise.getString("noip", "0");
        noip.setText(noipSP);
    }

    public void noip0(View v) {
        SharedPreferences peakNoise = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView noip = (TextView) findViewById(R.id.noip);
        int noips = Integer.parseInt(noip.getText().toString());
        noips = noips - 1;
        String noipString = Integer.toString(noips);
        noip.setText(noipString);
        peakNoise.edit().putString("noip", noipString).apply();
    }

    public void noip1(View v) {
        SharedPreferences peakNoise = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView noip = (TextView) findViewById(R.id.noip);
        int noips = Integer.parseInt(noip.getText().toString());
        noips = noips + 1;
        String noipString = Integer.toString(noips);
        noip.setText(noipString);
        peakNoise.edit().putString("noip", noipString).apply();
    }

}
