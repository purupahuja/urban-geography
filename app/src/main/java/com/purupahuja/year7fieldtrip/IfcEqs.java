package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IfcEqs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifc_eqs);
        TextView trees = (TextView) findViewById(R.id.itrees);
        TextView air = (TextView) findViewById(R.id.iair);
        TextView noise = (TextView) findViewById(R.id.inoise);
        TextView derelict = (TextView) findViewById(R.id.iderelict);
        TextView space = (TextView) findViewById(R.id.ispace);
        TextView tidy = (TextView) findViewById(R.id.itidy);

        SharedPreferences ifcEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);

        String treesSP = ifcEqs.getString("itrees", "0");
        trees.setText(treesSP);
        String airSP = ifcEqs.getString("iair", "0");
        air.setText(airSP);
        String noiseSP = ifcEqs.getString("inoise", "0");
        noise.setText(noiseSP);
        String derelictSP = ifcEqs.getString("iderelict", "0");
        derelict.setText(derelictSP);
        String spaceSP = ifcEqs.getString("ispace", "0");
        space.setText(spaceSP);
        String tidySP = ifcEqs.getString("itidy", "0");
        tidy.setText(tidySP);
    }

    public void itree0(View v) {
        SharedPreferences ifcEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView trees = (TextView) findViewById(R.id.itrees);
        int treess = Integer.parseInt(trees.getText().toString());
        treess = treess - 1;
        String treesString = Integer.toString(treess);
        trees.setText(treesString);
        ifcEqs.edit().putString("itrees", treesString).apply();
    }

    public void itree1(View v) {
        SharedPreferences ifcEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView trees = (TextView) findViewById(R.id.itrees);
        int treess = Integer.parseInt(trees.getText().toString());
        treess = treess + 1;
        String treesString = Integer.toString(treess);
        trees.setText(treesString);
        ifcEqs.edit().putString("itrees", treesString).apply();
    }

    public void iair0(View v) {
        SharedPreferences ifcEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView air = (TextView) findViewById(R.id.iair);
        int airs = Integer.parseInt(air.getText().toString());
        airs = airs - 1;
        String airString = Integer.toString(airs);
        air.setText(airString);
        ifcEqs.edit().putString("iair", airString).apply();
    }

    public void iair1(View v) {
        SharedPreferences ifcEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView air = (TextView) findViewById(R.id.iair);
        int airs = Integer.parseInt(air.getText().toString());
        airs = airs + 1;
        String airString = Integer.toString(airs);
        air.setText(airString);
        ifcEqs.edit().putString("iair", airString).apply();
    }

    public void inoise0(View v) {
        SharedPreferences ifcEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView noise = (TextView) findViewById(R.id.inoise);
        int noises = Integer.parseInt(noise.getText().toString());
        noises = noises - 1;
        String noiseString = Integer.toString(noises);
        noise.setText(noiseString);
        ifcEqs.edit().putString("inoise", noiseString).apply();
    }

    public void inoise1(View v) {
        SharedPreferences ifcEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView noise = (TextView) findViewById(R.id.inoise);
        int noises = Integer.parseInt(noise.getText().toString());
        noises = noises + 1;
        String noiseString = Integer.toString(noises);
        noise.setText(noiseString);
        ifcEqs.edit().putString("inoise", noiseString).apply();
    }

    public void iderelict0(View v) {
        SharedPreferences ifcEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView derelict = (TextView) findViewById(R.id.iderelict);
        int derelicts = Integer.parseInt(derelict.getText().toString());
        derelicts = derelicts - 1;
        String derelictString = Integer.toString(derelicts);
        derelict.setText(derelictString);
        ifcEqs.edit().putString("iderelict", derelictString).apply();
    }

    public void iderelict1(View v) {
        SharedPreferences ifcEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView derelict = (TextView) findViewById(R.id.iderelict);
        int derelicts = Integer.parseInt(derelict.getText().toString());
        derelicts = derelicts + 1;
        String derelictString = Integer.toString(derelicts);
        derelict.setText(derelictString);
        ifcEqs.edit().putString("iderelict", derelictString).apply();
    }

    public void itidy0(View v) {
        SharedPreferences ifcEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView tidy = (TextView) findViewById(R.id.itidy);
        int tidys = Integer.parseInt(tidy.getText().toString());
        tidys = tidys - 1;
        String tidyString = Integer.toString(tidys);
        tidy.setText(tidyString);
        ifcEqs.edit().putString("itidy", tidyString).apply();
    }

    public void itidy1(View v) {
        SharedPreferences ifcEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView tidy = (TextView) findViewById(R.id.itidy);
        int tidys = Integer.parseInt(tidy.getText().toString());
        tidys = tidys + 1;
        String tidyString = Integer.toString(tidys);
        tidy.setText(tidyString);
        ifcEqs.edit().putString("itidy", tidyString).apply();
    }

    public void ispace0(View v) {
        SharedPreferences ifcEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView space = (TextView) findViewById(R.id.ispace);
        int spaces = Integer.parseInt(space.getText().toString());
        spaces = spaces - 1;
        String spaceString = Integer.toString(spaces);
        space.setText(spaceString);
        ifcEqs.edit().putString("ispace", spaceString).apply();
    }

    public void ispace1(View v) {
        SharedPreferences ifcEqs = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView space = (TextView) findViewById(R.id.ispace);
        int spaces = Integer.parseInt(space.getText().toString());
        spaces = spaces + 1;
        String spaceString = Integer.toString(spaces);
        space.setText(spaceString);
        ifcEqs.edit().putString("ispace", spaceString).apply();
    }

}
