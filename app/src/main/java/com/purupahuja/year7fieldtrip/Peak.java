package com.purupahuja.year7fieldtrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Peak extends AppCompatActivity {

    private static Button button;
    private static Button button2;
    private static Button button3;
    private static Button button4;
    private static Button button5;
    private static Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peak);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        pTraffic();
        pPed();
        pEqs();
        pNoise();
        pLand();
        pSurvey();
    }

    public void pTraffic(){
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pTrafficIntent = new Intent("com.purupahuja.year7fieldtrip.PeakTraffic");
                        startActivity(pTrafficIntent);
                    }
                }
        );
    }
    public void pPed(){
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pPedIntent = new Intent("com.purupahuja.year7fieldtrip.PeakPed");
                        startActivity(pPedIntent);
                    }
                }
        );
    }
    public void pEqs(){
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pEqsIntent = new Intent("com.purupahuja.year7fieldtrip.PeakEqs");
                        startActivity(pEqsIntent);
                    }
                }
        );
    }
    public void pNoise(){
        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pNoiseIntent = new Intent("com.purupahuja.year7fieldtrip.PeakNoise");
                        startActivity(pNoiseIntent);
                    }
                }
        );
    }
    public void pLand(){
        button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pLandIntent = new Intent("com.purupahuja.year7fieldtrip.PeakLand");
                        startActivity(pLandIntent);
                    }
                }
        );
    }
    public void pSurvey(){
        button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pSurveyIntent = new Intent("com.purupahuja.year7fieldtrip.PeakSurvey");
                        startActivity(pSurveyIntent);
                    }
                }
        );
    }
}
