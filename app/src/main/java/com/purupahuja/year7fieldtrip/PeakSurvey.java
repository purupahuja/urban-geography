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

public class PeakSurvey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstancthree) {
        super.onCreate(savedInstancthree);
        setContentView(R.layout.activity_peak_survey);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView resident = (TextView) findViewById(R.id.resident);
        TextView visitor = (TextView) findViewById(R.id.visitor);
        TextView shopping = (TextView) findViewById(R.id.shopping);
        TextView live = (TextView) findViewById(R.id.live);
        TextView work = (TextView) findViewById(R.id.work);
        TextView eating = (TextView) findViewById(R.id.eating);
        TextView sightseeing = (TextView) findViewById(R.id.sightseeing);
        TextView other = (TextView) findViewById(R.id.other);
        TextView thirty = (TextView) findViewById(R.id.thirty);
        TextView one = (TextView) findViewById(R.id.one);
        TextView three = (TextView) findViewById(R.id.three);
        TextView plus = (TextView) findViewById(R.id.plus);
        TextView walk = (TextView) findViewById(R.id.walk);
        TextView bike = (TextView) findViewById(R.id.bike);
        TextView mtr = (TextView) findViewById(R.id.mtr);
        TextView scar = (TextView) findViewById(R.id.scar);
        TextView tram = (TextView) findViewById(R.id.tram);
        TextView sbus = (TextView) findViewById(R.id.sbus);
        TextView residential = (TextView) findViewById(R.id.residential);
        TextView business = (TextView) findViewById(R.id.tourism);
        TextView dining = (TextView) findViewById(R.id.dining);
        TextView shopp = (TextView) findViewById(R.id.shopp);
        TextView pub = (TextView) findViewById(R.id.pub);
        TextView tourism = (TextView) findViewById(R.id.tourism);

        SharedPreferences peakSurvey = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);

        String residentSP = peakSurvey.getString("residents", "0");
        resident.setText(residentSP);
        String visitorSP = peakSurvey.getString("visitors", "0");
        visitor.setText(visitorSP);
        String shoppingSP = peakSurvey.getString("shoppings", "0");
        shopping.setText(shoppingSP);
        String liveSP = peakSurvey.getString("lives", "0");
        live.setText(liveSP);
        String workSP = peakSurvey.getString("works", "0");
        work.setText(workSP);
        String eatingSP = peakSurvey.getString("eatings", "0");
        eating.setText(eatingSP);
        String sightseeingSP = peakSurvey.getString("sightseeings", "0");
        sightseeing.setText(sightseeingSP);
        String otherSP = peakSurvey.getString("others", "0");
        other.setText(otherSP);
        String thirtySP = peakSurvey.getString("thirtys", "0");
        thirty.setText(thirtySP);
        String oneSP = peakSurvey.getString("ones", "0");
        one.setText(oneSP);
        String threeSP = peakSurvey.getString("threes", "0");
        three.setText(threeSP);
        String plusSP = peakSurvey.getString("pluss", "0");
        plus.setText(plusSP);
        String walkSP = peakSurvey.getString("walks", "0");
        walk.setText(walkSP);
        String bikeSP = peakSurvey.getString("bikes", "0");
        bike.setText(bikeSP);
        String mtrSP = peakSurvey.getString("mtrs", "0");
        mtr.setText(mtrSP);
        String scarSP = peakSurvey.getString("scars", "0");
        scar.setText(scarSP);
        String tramSP = peakSurvey.getString("trams", "0");
        tram.setText(tramSP);
        String sbusSP = peakSurvey.getString("sbuss", "0");
        sbus.setText(sbusSP);
        String residentialSP = peakSurvey.getString("residentials", "0");
        residential.setText(residentialSP);
        String businessSP = peakSurvey.getString("businesss", "0");
        business.setText(businessSP);
        String diningSP = peakSurvey.getString("dinings", "0");
        dining.setText(diningSP);
        String shoppSP = peakSurvey.getString("shopps", "0");
        shopp.setText(shoppSP);
        String pubSP = peakSurvey.getString("pubs", "0");
        pub.setText(pubSP);
        String tourismSP = peakSurvey.getString("tourisms", "0");
        tourism.setText(tourismSP);

    }


    public void resident0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.resident);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("residents", carString).apply();
    }

    public void resident1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.resident);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("residents", carString).apply();
    }

    public void visitor0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.visitor);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("visitors", carString).apply();
    }

    public void visitor1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.visitor);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("visitors", carString).apply();
    }

    public void shopping0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.shopping);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("shoppings", carString).apply();
    }

    public void shopping1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.shopping);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("shoppings", carString).apply();
    }

    public void live0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.live);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("lives", carString).apply();
    }

    public void live1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.live);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("lives", carString).apply();
    }

    public void work0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.work);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("works", carString).apply();
    }

    public void work1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.work);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("works", carString).apply();
    }

    public void eating0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.eating);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("eatings", carString).apply();
    }

    public void eating1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.eating);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("eatings", carString).apply();
    }


    public void sightseeing0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sightseeing);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("sightseeings", carString).apply();
    }

    public void sightseeing1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sightseeing);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("sightseeings", carString).apply();
    }

    public void other0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.other);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("others", carString).apply();
    }

    public void other1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.other);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("others", carString).apply();
    }

    public void thirty0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.thirty);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("thirtys", carString).apply();
    }

    public void thirty1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.thirty);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("thirtys", carString).apply();
    }

    public void one0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.one);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("ones", carString).apply();
    }

    public void one1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.one);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("ones", carString).apply();
    }

    public void three0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.three);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("threes", carString).apply();
    }

    public void three1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.three);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("threes", carString).apply();
    }

    public void plus0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.plus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("pluss", carString).apply();
    }

    public void plus1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.plus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("pluss", carString).apply();
    }

    public void walk0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.walk);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("walks", carString).apply();
    }

    public void walk1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.walk);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("walks", carString).apply();
    }

    public void bike0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.bike);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("bikes", carString).apply();
    }

    public void bike1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.bike);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("bikes", carString).apply();
    }

    public void mtr0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.mtr);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("mtrs", carString).apply();
    }

    public void mtr1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.mtr);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("mtrs", carString).apply();
    }

    public void scar0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.scar);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("scars", carString).apply();
    }

    public void scar1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.scar);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("scars", carString).apply();
    }

    public void tram0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.tram);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("trams", carString).apply();
    }

    public void tram1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.tram);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("trams", carString).apply();
    }

    public void sbus0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sbus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("sbuss", carString).apply();
    }

    public void sbus1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sbus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("sbuss", carString).apply();
    }


    public void residential0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.residential);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("residentials", carString).apply();
    }

    public void residential1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.residential);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("residentials", carString).apply();
    }

    public void business0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.business);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("businesss", carString).apply();
    }

    public void business1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.business);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("businesss", carString).apply();
    }

    public void dining0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.dining);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("dinings", carString).apply();
    }

    public void dining1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.dining);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("dinings", carString).apply();
    }

    public void shopp0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.shopp);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("shopps", carString).apply();
    }

    public void shopp1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.shopp);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("shopps", carString).apply();
    }

    public void pub0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.pub);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("pubs", carString).apply();
    }

    public void pub1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.pub);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("pubs", carString).apply();
    }

    public void tourism0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.tourism);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("tourisms", carString).apply();
    }

    public void tourism1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.tourism);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("tourisms", carString).apply();
    }


}
