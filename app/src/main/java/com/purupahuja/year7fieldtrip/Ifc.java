package com.purupahuja.year7fieldtrip;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Ifc extends AppCompatActivity {

    private static Button button7;
    private static Button button8;
    private static Button button9;
    private static Button button10;
    private static Button button11;
    private static Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        iSurvey();
        iTraffic();
        iPed();
        iEqs();
        iNoise();
        iLand();
    }

    public void iTraffic(){
        button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pTrafficIntent = new Intent("com.purupahuja.year7fieldtrip.IfcTraffic");
                        startActivity(pTrafficIntent);
                    }
                }
        );
    }
    public void iPed(){
        button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pPedIntent = new Intent("com.purupahuja.year7fieldtrip.IfcPed");
                        startActivity(pPedIntent);
                    }
                }
        );
    }
    public void iEqs(){
        button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pEqsIntent = new Intent("com.purupahuja.year7fieldtrip.IfcEqs");
                        startActivity(pEqsIntent);
                    }
                }
        );
    }
    public void iNoise(){
        button10 = (Button)findViewById(R.id.button10);
        button10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pNoiseIntent = new Intent("com.purupahuja.year7fieldtrip.IfcNoise");
                        startActivity(pNoiseIntent);
                    }
                }
        );
    }
    public void iLand(){
        button11 = (Button)findViewById(R.id.button11);
        button11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pLandIntent = new Intent("com.purupahuja.year7fieldtrip.IfcLand");
                        startActivity(pLandIntent);
                    }
                }
        );
    }
    public void iSurvey(){
        button12 = (Button)findViewById(R.id.button12);
        button12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent pSurveyIntent = new Intent("com.purupahuja.year7fieldtrip.IfcSurvey");
                        startActivity(pSurveyIntent);
                    }
                }
        );
    }
}
