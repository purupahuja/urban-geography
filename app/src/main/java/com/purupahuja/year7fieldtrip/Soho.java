package com.purupahuja.year7fieldtrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Soho extends AppCompatActivity {

    private static Button button13;
    private static Button button14;
    private static Button button15;
    private static Button button16;
    private static Button button17;
    private static Button button18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soho);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sTraffic();
        sPed();
        sEqs();
        sNoise();
        sLand();
        sSurvey();
    }

    public void sTraffic(){
        button13 = (Button)findViewById(R.id.button13);
        button13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pTrafficIntent = new Intent("com.purupahuja.year7fieldtrip.SohoTraffic");
                        startActivity(pTrafficIntent);
                    }
                }
        );
    }
    public void sPed(){
        button14 = (Button)findViewById(R.id.button14);
        button14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pPedIntent = new Intent("com.purupahuja.year7fieldtrip.SohoPed");
                        startActivity(pPedIntent);
                    }
                }
        );
    }
    public void sEqs(){
        button15 = (Button)findViewById(R.id.button15);
        button15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pEqsIntent = new Intent("com.purupahuja.year7fieldtrip.SohoEqs");
                        startActivity(pEqsIntent);
                    }
                }
        );
    }
    public void sNoise(){
        button16 = (Button)findViewById(R.id.button16);
        button16.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pNoiseIntent = new Intent("com.purupahuja.year7fieldtrip.SohoNoise");
                        startActivity(pNoiseIntent);
                    }
                }
        );
    }
    public void sLand(){
        button17 = (Button)findViewById(R.id.button17);
        button17.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pLandIntent = new Intent("com.purupahuja.year7fieldtrip.SohoLand");
                        startActivity(pLandIntent);
                    }
                }
        );
    }
    public void sSurvey(){
        button18 = (Button)findViewById(R.id.button18);
        button18.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pSurveyIntent = new Intent("com.purupahuja.year7fieldtrip.SohoSurvey");
                        startActivity(pSurveyIntent);
                    }
                }
        );
    }
}
