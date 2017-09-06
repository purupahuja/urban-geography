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

public class PeakEqs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peak_eqs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView trees = (TextView) findViewById(R.id.trees);
        TextView air = (TextView) findViewById(R.id.air);
        TextView noise = (TextView) findViewById(R.id.noise);
        TextView derelict = (TextView) findViewById(R.id.derelict);
        TextView space = (TextView) findViewById(R.id.space);
        TextView tidy = (TextView) findViewById(R.id.tidy);

        SharedPreferences peakEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);

        String treesSP = peakEqs.getString("trees", "0");
        trees.setText(treesSP);
        String airSP = peakEqs.getString("air", "0");
        air.setText(airSP);
        String noiseSP = peakEqs.getString("noise", "0");
        noise.setText(noiseSP);
        String derelictSP = peakEqs.getString("derelict", "0");
        derelict.setText(derelictSP);
        String spaceSP = peakEqs.getString("space", "0");
        space.setText(spaceSP);
        String tidySP = peakEqs.getString("tidy", "0");
        tidy.setText(tidySP);
    }

    public void tree0(View v) {
        SharedPreferences peakEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView trees = (TextView) findViewById(R.id.trees);
        int treess = Integer.parseInt(trees.getText().toString());
        treess = treess - 1;
        String treesString = Integer.toString(treess);
        trees.setText(treesString);
        peakEqs.edit().putString("trees", treesString).apply();
    }

    public void tree1(View v) {
        SharedPreferences peakEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView trees = (TextView) findViewById(R.id.trees);
        int treess = Integer.parseInt(trees.getText().toString());
        treess = treess + 1;
        String treesString = Integer.toString(treess);
        trees.setText(treesString);
        peakEqs.edit().putString("trees", treesString).apply();
    }

    public void air0(View v) {
        SharedPreferences peakEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView air = (TextView) findViewById(R.id.air);
        int airs = Integer.parseInt(air.getText().toString());
        airs = airs - 1;
        String airString = Integer.toString(airs);
        air.setText(airString);
        peakEqs.edit().putString("air", airString).apply();
    }

    public void air1(View v) {
        SharedPreferences peakEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView air = (TextView) findViewById(R.id.air);
        int airs = Integer.parseInt(air.getText().toString());
        airs = airs + 1;
        String airString = Integer.toString(airs);
        air.setText(airString);
        peakEqs.edit().putString("air", airString).apply();
    }

    public void noise0(View v) {
        SharedPreferences peakEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView noise = (TextView) findViewById(R.id.noise);
        int noises = Integer.parseInt(noise.getText().toString());
        noises = noises - 1;
        String noiseString = Integer.toString(noises);
        noise.setText(noiseString);
        peakEqs.edit().putString("noise", noiseString).apply();
    }

    public void noise1(View v) {
        SharedPreferences peakEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView noise = (TextView) findViewById(R.id.noise);
        int noises = Integer.parseInt(noise.getText().toString());
        noises = noises + 1;
        String noiseString = Integer.toString(noises);
        noise.setText(noiseString);
        peakEqs.edit().putString("noise", noiseString).apply();
    }

    public void derelict0(View v) {
        SharedPreferences peakEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView derelict = (TextView) findViewById(R.id.derelict);
        int derelicts = Integer.parseInt(derelict.getText().toString());
        derelicts = derelicts - 1;
        String derelictString = Integer.toString(derelicts);
        derelict.setText(derelictString);
        peakEqs.edit().putString("derelict", derelictString).apply();
    }

    public void derelict1(View v) {
        SharedPreferences peakEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView derelict = (TextView) findViewById(R.id.derelict);
        int derelicts = Integer.parseInt(derelict.getText().toString());
        derelicts = derelicts + 1;
        String derelictString = Integer.toString(derelicts);
        derelict.setText(derelictString);
        peakEqs.edit().putString("derelict", derelictString).apply();
    }

    public void tidy0(View v) {
        SharedPreferences peakEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView tidy = (TextView) findViewById(R.id.tidy);
        int tidys = Integer.parseInt(tidy.getText().toString());
        tidys = tidys - 1;
        String tidyString = Integer.toString(tidys);
        tidy.setText(tidyString);
        peakEqs.edit().putString("tidy", tidyString).apply();
    }

    public void tidy1(View v) {
        SharedPreferences peakEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView tidy = (TextView) findViewById(R.id.tidy);
        int tidys = Integer.parseInt(tidy.getText().toString());
        tidys = tidys + 1;
        String tidyString = Integer.toString(tidys);
        tidy.setText(tidyString);
        peakEqs.edit().putString("tidy", tidyString).apply();
    }

    public void space0(View v) {
        SharedPreferences peakEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView space = (TextView) findViewById(R.id.space);
        int spaces = Integer.parseInt(space.getText().toString());
        spaces = spaces - 1;
        String spaceString = Integer.toString(spaces);
        space.setText(spaceString);
        peakEqs.edit().putString("space", spaceString).apply();
    }

    public void space1(View v) {
        SharedPreferences peakEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView space = (TextView) findViewById(R.id.space);
        int spaces = Integer.parseInt(space.getText().toString());
        spaces = spaces + 1;
        String spaceString = Integer.toString(spaces);
        space.setText(spaceString);
        peakEqs.edit().putString("space", spaceString).apply();
    }

}
