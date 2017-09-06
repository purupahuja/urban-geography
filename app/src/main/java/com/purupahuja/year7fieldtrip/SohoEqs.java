package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SohoEqs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soho_eqs);

        TextView trees = (TextView) findViewById(R.id.strees);
        TextView air = (TextView) findViewById(R.id.sair);
        TextView noise = (TextView) findViewById(R.id.snoise);
        TextView derelict = (TextView) findViewById(R.id.sderelict);
        TextView space = (TextView) findViewById(R.id.sspace);
        TextView tidy = (TextView) findViewById(R.id.stidy);

        SharedPreferences sohoEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);

        String treesSP = sohoEqs.getString("treesso", "0");
        trees.setText(treesSP);
        String airSP = sohoEqs.getString("airso", "0");
        air.setText(airSP);
        String noiseSP = sohoEqs.getString("noiseso", "0");
        noise.setText(noiseSP);
        String derelictSP = sohoEqs.getString("derelictso", "0");
        derelict.setText(derelictSP);
        String spaceSP = sohoEqs.getString("spaceso", "0");
        space.setText(spaceSP);
        String tidySP = sohoEqs.getString("tidyso", "0");
        tidy.setText(tidySP);
    }

    public void stree0(View v) {
        SharedPreferences sohoEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView trees = (TextView) findViewById(R.id.strees);
        int treess = Integer.parseInt(trees.getText().toString());
        treess = treess - 1;
        String treesString = Integer.toString(treess);
        trees.setText(treesString);
        sohoEqs.edit().putString("treesso", treesString).apply();
    }

    public void stree1(View v) {
        SharedPreferences sohoEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView trees = (TextView) findViewById(R.id.strees);
        int treess = Integer.parseInt(trees.getText().toString());
        treess = treess + 1;
        String treesString = Integer.toString(treess);
        trees.setText(treesString);
        sohoEqs.edit().putString("treesso", treesString).apply();
    }

    public void sair0(View v) {
        SharedPreferences sohoEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView air = (TextView) findViewById(R.id.sair);
        int airs = Integer.parseInt(air.getText().toString());
        airs = airs - 1;
        String airString = Integer.toString(airs);
        air.setText(airString);
        sohoEqs.edit().putString("airso", airString).apply();
    }

    public void sair1(View v) {
        SharedPreferences sohoEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView air = (TextView) findViewById(R.id.sair);
        int airs = Integer.parseInt(air.getText().toString());
        airs = airs + 1;
        String airString = Integer.toString(airs);
        air.setText(airString);
        sohoEqs.edit().putString("airso", airString).apply();
    }

    public void snoise0(View v) {
        SharedPreferences sohoEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView noise = (TextView) findViewById(R.id.snoise);
        int noises = Integer.parseInt(noise.getText().toString());
        noises = noises - 1;
        String noiseString = Integer.toString(noises);
        noise.setText(noiseString);
        sohoEqs.edit().putString("noiseso", noiseString).apply();
    }

    public void snoise1(View v) {
        SharedPreferences sohoEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView noise = (TextView) findViewById(R.id.snoise);
        int noises = Integer.parseInt(noise.getText().toString());
        noises = noises + 1;
        String noiseString = Integer.toString(noises);
        noise.setText(noiseString);
        sohoEqs.edit().putString("noiseso", noiseString).apply();
    }

    public void sderelict0(View v) {
        SharedPreferences sohoEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView derelict = (TextView) findViewById(R.id.sderelict);
        int derelicts = Integer.parseInt(derelict.getText().toString());
        derelicts = derelicts - 1;
        String derelictString = Integer.toString(derelicts);
        derelict.setText(derelictString);
        sohoEqs.edit().putString("derelictso", derelictString).apply();
    }

    public void sderelict1(View v) {
        SharedPreferences sohoEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView derelict = (TextView) findViewById(R.id.sderelict);
        int derelicts = Integer.parseInt(derelict.getText().toString());
        derelicts = derelicts + 1;
        String derelictString = Integer.toString(derelicts);
        derelict.setText(derelictString);
        sohoEqs.edit().putString("derelictso", derelictString).apply();
    }

    public void stidy0(View v) {
        SharedPreferences sohoEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView tidy = (TextView) findViewById(R.id.stidy);
        int tidys = Integer.parseInt(tidy.getText().toString());
        tidys = tidys - 1;
        String tidyString = Integer.toString(tidys);
        tidy.setText(tidyString);
        sohoEqs.edit().putString("tidyso", tidyString).apply();
    }

    public void stidy1(View v) {
        SharedPreferences sohoEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView tidy = (TextView) findViewById(R.id.stidy);
        int tidys = Integer.parseInt(tidy.getText().toString());
        tidys = tidys + 1;
        String tidyString = Integer.toString(tidys);
        tidy.setText(tidyString);
        sohoEqs.edit().putString("tidyso", tidyString).apply();
    }

    public void sspace0(View v) {
        SharedPreferences sohoEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView space = (TextView) findViewById(R.id.sspace);
        int spaces = Integer.parseInt(space.getText().toString());
        spaces = spaces - 1;
        String spaceString = Integer.toString(spaces);
        space.setText(spaceString);
        sohoEqs.edit().putString("spaceso", spaceString).apply();
    }

    public void sspace1(View v) {
        SharedPreferences sohoEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView space = (TextView) findViewById(R.id.sspace);
        int spaces = Integer.parseInt(space.getText().toString());
        spaces = spaces + 1;
        String spaceString = Integer.toString(spaces);
        space.setText(spaceString);
        sohoEqs.edit().putString("spaceso", spaceString).apply();
    }

}
