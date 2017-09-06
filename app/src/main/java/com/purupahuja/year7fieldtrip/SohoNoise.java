package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SohoNoise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soho_noise);
        TextView sonoip = (TextView) findViewById(R.id.sonoip);
        SharedPreferences sohoNoise = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        String sonoipSP = sohoNoise.getString("sonoip", "0");
        sonoip.setText(sonoipSP);
    }

    public void sonoip0(View v) {
        SharedPreferences sohoNoise = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView sonoip = (TextView) findViewById(R.id.sonoip);
        int sonoips = Integer.parseInt(sonoip.getText().toString());
        sonoips = sonoips - 1;
        String sonoipString = Integer.toString(sonoips);
        sonoip.setText(sonoipString);
        sohoNoise.edit().putString("sonoip", sonoipString).apply();
    }

    public void sonoip1(View v) {
        SharedPreferences sohoNoise = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView sonoip = (TextView) findViewById(R.id.sonoip);
        int sonoips = Integer.parseInt(sonoip.getText().toString());
        sonoips = sonoips + 1;
        String sonoipString = Integer.toString(sonoips);
        sonoip.setText(sonoipString);
        sohoNoise.edit().putString("sonoip", sonoipString).apply();
    }

}
