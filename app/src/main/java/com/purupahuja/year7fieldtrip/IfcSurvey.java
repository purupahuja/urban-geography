package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IfcSurvey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifc_survey);
        TextView resident = (TextView) findViewById(R.id.iresident);
        TextView visitor = (TextView) findViewById(R.id.ivisitor);
        TextView shopping = (TextView) findViewById(R.id.ishopping);
        TextView live = (TextView) findViewById(R.id.ilive);
        TextView work = (TextView) findViewById(R.id.iwork);
        TextView eating = (TextView) findViewById(R.id.ieating);
        TextView sightseeing = (TextView) findViewById(R.id.isightseeing);
        TextView other = (TextView) findViewById(R.id.iother);
        TextView thirty = (TextView) findViewById(R.id.ithirty);
        TextView one = (TextView) findViewById(R.id.ione);
        TextView three = (TextView) findViewById(R.id.ithree);
        TextView plus = (TextView) findViewById(R.id.iplus);
        TextView walk = (TextView) findViewById(R.id.iwalk);
        TextView bike = (TextView) findViewById(R.id.ibike);
        TextView mtr = (TextView) findViewById(R.id.imtr);
        TextView scar = (TextView) findViewById(R.id.iscar);
        TextView tram = (TextView) findViewById(R.id.itram);
        TextView sbus = (TextView) findViewById(R.id.isbus);
        TextView residential = (TextView) findViewById(R.id.iresidential);
        TextView business = (TextView) findViewById(R.id.itourism);
        TextView dining = (TextView) findViewById(R.id.idining);
        TextView shopp = (TextView) findViewById(R.id.ishopp);
        TextView pub = (TextView) findViewById(R.id.ipub);
        TextView tourism = (TextView) findViewById(R.id.itourism);

        SharedPreferences ifcSurvey = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);

        String residentSP = ifcSurvey.getString("iresidents", "0");
        resident.setText(residentSP);
        String visitorSP = ifcSurvey.getString("ivisitors", "0");
        visitor.setText(visitorSP);
        String shoppingSP = ifcSurvey.getString("ishoppings", "0");
        shopping.setText(shoppingSP);
        String liveSP = ifcSurvey.getString("ilives", "0");
        live.setText(liveSP);
        String workSP = ifcSurvey.getString("iworks", "0");
        work.setText(workSP);
        String eatingSP = ifcSurvey.getString("ieatings", "0");
        eating.setText(eatingSP);
        String sightseeingSP = ifcSurvey.getString("isightseeings", "0");
        sightseeing.setText(sightseeingSP);
        String otherSP = ifcSurvey.getString("iothers", "0");
        other.setText(otherSP);
        String thirtySP = ifcSurvey.getString("ithirtys", "0");
        thirty.setText(thirtySP);
        String oneSP = ifcSurvey.getString("iones", "0");
        one.setText(oneSP);
        String threeSP = ifcSurvey.getString("ithrees", "0");
        three.setText(threeSP);
        String plusSP = ifcSurvey.getString("ipluss", "0");
        plus.setText(plusSP);
        String walkSP = ifcSurvey.getString("iwalks", "0");
        walk.setText(walkSP);
        String bikeSP = ifcSurvey.getString("ibikes", "0");
        bike.setText(bikeSP);
        String mtrSP = ifcSurvey.getString("imtrs", "0");
        mtr.setText(mtrSP);
        String scarSP = ifcSurvey.getString("iscars", "0");
        scar.setText(scarSP);
        String tramSP = ifcSurvey.getString("itrams", "0");
        tram.setText(tramSP);
        String sbusSP = ifcSurvey.getString("isbuss", "0");
        sbus.setText(sbusSP);
        String residentialSP = ifcSurvey.getString("iresidentials", "0");
        residential.setText(residentialSP);
        String businessSP = ifcSurvey.getString("ibusinesss", "0");
        business.setText(businessSP);
        String diningSP = ifcSurvey.getString("idinings", "0");
        dining.setText(diningSP);
        String shoppSP = ifcSurvey.getString("ishopps", "0");
        shopp.setText(shoppSP);
        String pubSP = ifcSurvey.getString("ipubs", "0");
        pub.setText(pubSP);
        String tourismSP = ifcSurvey.getString("itourisms", "0");
        tourism.setText(tourismSP);

    }


    public void iresident0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iresident);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iresidents", carString).apply();
    }

    public void iresident1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iresident);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iresidents", carString).apply();
    }

    public void ivisitor0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ivisitor);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ivisitors", carString).apply();
    }

    public void ivisitor1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ivisitor);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ivisitors", carString).apply();
    }

    public void ishopping0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ishopping);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ishoppings", carString).apply();
    }

    public void ishopping1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ishopping);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ishoppings", carString).apply();
    }

    public void ilive0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ilive);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ilives", carString).apply();
    }

    public void ilive1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ilive);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ilives", carString).apply();
    }

    public void iwork0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iwork);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iworks", carString).apply();
    }

    public void iwork1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iwork);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iworks", carString).apply();
    }

    public void ieating0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ieating);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ieatings", carString).apply();
    }

    public void ieating1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ieating);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ieatings", carString).apply();
    }


    public void isightseeing0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isightseeing);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isightseeings", carString).apply();
    }

    public void isightseeing1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isightseeing);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isightseeings", carString).apply();
    }

    public void iother0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iother);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iothers", carString).apply();
    }

    public void iother1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iother);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iothers", carString).apply();
    }

    public void ithirty0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ithirty);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ithirtys", carString).apply();
    }

    public void ithirty1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ithirty);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ithirtys", carString).apply();
    }

    public void ione0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ione);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iones", carString).apply();
    }

    public void ione1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ione);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iones", carString).apply();
    }

    public void ithree0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ithree);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ithrees", carString).apply();
    }

    public void ithree1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ithree);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ithrees", carString).apply();
    }

    public void iplus0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iplus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ipluss", carString).apply();
    }

    public void iplus1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iplus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ipluss", carString).apply();
    }

    public void iwalk0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iwalk);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iwalks", carString).apply();
    }

    public void iwalk1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iwalk);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iwalks", carString).apply();
    }

    public void ibike0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ibike);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ibikes", carString).apply();
    }

    public void ibike1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ibike);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ibikes", carString).apply();
    }

    public void imtr0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.imtr);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("imtrs", carString).apply();
    }

    public void imtr1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.imtr);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("imtrs", carString).apply();
    }

    public void iscar0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iscar);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iscars", carString).apply();
    }

    public void iscar1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iscar);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iscars", carString).apply();
    }

    public void itram0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.itram);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("itrams", carString).apply();
    }

    public void itram1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.itram);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("itrams", carString).apply();
    }

    public void isbus0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isbus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isbuss", carString).apply();
    }

    public void isbus1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isbus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isbuss", carString).apply();
    }


    public void iresidential0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iresidential);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iresidentials", carString).apply();
    }

    public void iresidential1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iresidential);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iresidentials", carString).apply();
    }

    public void ibusiness0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ibusiness);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ibusinesss", carString).apply();
    }

    public void ibusiness1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ibusiness);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ibusinesss", carString).apply();
    }

    public void idining0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.idining);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("idinings", carString).apply();
    }

    public void idining1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.idining);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("idinings", carString).apply();
    }

    public void ishopp0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ishopp);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ishopps", carString).apply();
    }

    public void ishopp1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ishopp);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ishopps", carString).apply();
    }

    public void ipub0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ipub);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ipubs", carString).apply();
    }

    public void ipub1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ipub);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ipubs", carString).apply();
    }

    public void itourism0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.itourism);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("itourisms", carString).apply();
    }

    public void itourism1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.itourism);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("itourisms", carString).apply();
    }


}
