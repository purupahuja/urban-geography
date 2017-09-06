package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SohoSurvey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soho_survey);
        TextView resident = (TextView) findViewById(R.id.soresident);
        TextView visitor = (TextView) findViewById(R.id.sovisitor);
        TextView shopping = (TextView) findViewById(R.id.soshopping);
        TextView live = (TextView) findViewById(R.id.solive);
        TextView work = (TextView) findViewById(R.id.sowork);
        TextView eating = (TextView) findViewById(R.id.soeating);
        TextView sightseeing = (TextView) findViewById(R.id.sosightseeing);
        TextView other = (TextView) findViewById(R.id.soother);
        TextView thirty = (TextView) findViewById(R.id.sothirty);
        TextView one = (TextView) findViewById(R.id.soone);
        TextView three = (TextView) findViewById(R.id.sothree);
        TextView plus = (TextView) findViewById(R.id.soplus);
        TextView walk = (TextView) findViewById(R.id.sowalk);
        TextView bike = (TextView) findViewById(R.id.sobike);
        TextView mtr = (TextView) findViewById(R.id.somtr);
        TextView scar = (TextView) findViewById(R.id.soscar);
        TextView tram = (TextView) findViewById(R.id.sotram);
        TextView sbus = (TextView) findViewById(R.id.sosbus);
        TextView residential = (TextView) findViewById(R.id.soresidential);
        TextView business = (TextView) findViewById(R.id.sotourism);
        TextView dining = (TextView) findViewById(R.id.sodining);
        TextView shopp = (TextView) findViewById(R.id.soshopp);
        TextView pub = (TextView) findViewById(R.id.sopub);
        TextView tourism = (TextView) findViewById(R.id.sotourism);

        SharedPreferences sohoSurvey = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);

        String residentSP = sohoSurvey.getString("soresidents", "0");
        resident.setText(residentSP);
        String visitorSP = sohoSurvey.getString("sovisitors", "0");
        visitor.setText(visitorSP);
        String shoppingSP = sohoSurvey.getString("soshoppings", "0");
        shopping.setText(shoppingSP);
        String liveSP = sohoSurvey.getString("solives", "0");
        live.setText(liveSP);
        String workSP = sohoSurvey.getString("soworks", "0");
        work.setText(workSP);
        String eatingSP = sohoSurvey.getString("soeatings", "0");
        eating.setText(eatingSP);
        String sightseeingSP = sohoSurvey.getString("sosightseeings", "0");
        sightseeing.setText(sightseeingSP);
        String otherSP = sohoSurvey.getString("soothers", "0");
        other.setText(otherSP);
        String thirtySP = sohoSurvey.getString("sothirtys", "0");
        thirty.setText(thirtySP);
        String oneSP = sohoSurvey.getString("soones", "0");
        one.setText(oneSP);
        String threeSP = sohoSurvey.getString("sothrees", "0");
        three.setText(threeSP);
        String plusSP = sohoSurvey.getString("sopluss", "0");
        plus.setText(plusSP);
        String walkSP = sohoSurvey.getString("sowalks", "0");
        walk.setText(walkSP);
        String bikeSP = sohoSurvey.getString("sobikes", "0");
        bike.setText(bikeSP);
        String mtrSP = sohoSurvey.getString("somtrs", "0");
        mtr.setText(mtrSP);
        String scarSP = sohoSurvey.getString("soscars", "0");
        scar.setText(scarSP);
        String tramSP = sohoSurvey.getString("sotrams", "0");
        tram.setText(tramSP);
        String sbusSP = sohoSurvey.getString("sosbuss", "0");
        sbus.setText(sbusSP);
        String residentialSP = sohoSurvey.getString("soresidentials", "0");
        residential.setText(residentialSP);
        String businessSP = sohoSurvey.getString("sobusinesss", "0");
        business.setText(businessSP);
        String diningSP = sohoSurvey.getString("sodinings", "0");
        dining.setText(diningSP);
        String shoppSP = sohoSurvey.getString("soshopps", "0");
        shopp.setText(shoppSP);
        String pubSP = sohoSurvey.getString("sopubs", "0");
        pub.setText(pubSP);
        String tourismSP = sohoSurvey.getString("sotourisms", "0");
        tourism.setText(tourismSP);

    }


    public void soresident0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soresident);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soresidents", carString).apply();
    }

    public void soresident1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soresident);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soresidents", carString).apply();
    }

    public void sovisitor0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sovisitor);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sovisitors", carString).apply();
    }

    public void sovisitor1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sovisitor);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sovisitors", carString).apply();
    }

    public void soshopping0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soshopping);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soshoppings", carString).apply();
    }

    public void soshopping1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soshopping);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soshoppings", carString).apply();
    }

    public void solive0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.solive);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("solives", carString).apply();
    }

    public void solive1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.solive);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("solives", carString).apply();
    }

    public void sowork0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sowork);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soworks", carString).apply();
    }

    public void sowork1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sowork);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soworks", carString).apply();
    }

    public void soeating0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soeating);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soeatings", carString).apply();
    }

    public void soeating1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soeating);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soeatings", carString).apply();
    }


    public void sosightseeing0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosightseeing);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sosightseeings", carString).apply();
    }

    public void sosightseeing1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosightseeing);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sosightseeings", carString).apply();
    }

    public void soother0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soother);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soothers", carString).apply();
    }

    public void soother1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soother);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soothers", carString).apply();
    }

    public void sothirty0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sothirty);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sothirtys", carString).apply();
    }

    public void sothirty1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sothirty);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sothirtys", carString).apply();
    }

    public void soone0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soone);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soones", carString).apply();
    }

    public void soone1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soone);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soones", carString).apply();
    }

    public void sothree0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sothree);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sothrees", carString).apply();
    }

    public void sothree1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sothree);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sothrees", carString).apply();
    }

    public void soplus0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soplus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sopluss", carString).apply();
    }

    public void soplus1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soplus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sopluss", carString).apply();
    }

    public void sowalk0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sowalk);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sowalks", carString).apply();
    }

    public void sowalk1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sowalk);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sowalks", carString).apply();
    }

    public void sobike0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sobike);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sobikes", carString).apply();
    }

    public void sobike1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sobike);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sobikes", carString).apply();
    }

    public void somtr0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.somtr);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("somtrs", carString).apply();
    }

    public void somtr1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.somtr);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("somtrs", carString).apply();
    }

    public void soscar0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soscar);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soscars", carString).apply();
    }

    public void soscar1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soscar);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soscars", carString).apply();
    }

    public void sotram0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sotram);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sotrams", carString).apply();
    }

    public void sotram1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sotram);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sotrams", carString).apply();
    }

    public void sosbus0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosbus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sosbuss", carString).apply();
    }

    public void sosbus1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosbus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sosbuss", carString).apply();
    }


    public void soresidential0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soresidential);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soresidentials", carString).apply();
    }

    public void soresidential1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soresidential);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soresidentials", carString).apply();
    }

    public void sobusiness0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sobusiness);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sobusinesss", carString).apply();
    }

    public void sobusiness1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sobusiness);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sobusinesss", carString).apply();
    }

    public void sodining0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sodining);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sodinings", carString).apply();
    }

    public void sodining1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sodining);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sodinings", carString).apply();
    }

    public void soshopp0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soshopp);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soshopps", carString).apply();
    }

    public void soshopp1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soshopp);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("soshopps", carString).apply();
    }

    public void sopub0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sopub);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sopubs", carString).apply();
    }

    public void sopub1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sopub);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sopubs", carString).apply();
    }

    public void sotourism0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sotourism);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sotourisms", carString).apply();
    }

    public void sotourism1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sotourism);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sotourisms", carString).apply();
    }


}
