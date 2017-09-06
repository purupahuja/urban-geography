package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IfcLand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifc_land);
        TextView house = (TextView) findViewById(R.id.ihouse);
        TextView hotel = (TextView) findViewById(R.id.ihotel);
        TextView supermarket = (TextView) findViewById(R.id.isupermarket);
        TextView constore = (TextView) findViewById(R.id.iconstore);
        TextView compstore = (TextView) findViewById(R.id.icompstore);
        TextView spec = (TextView) findViewById(R.id.ispec);
        TextView household = (TextView) findViewById(R.id.ihousehold);
        TextView sershop = (TextView) findViewById(R.id.isershop);
        TextView charity = (TextView) findViewById(R.id.icharity);
        TextView bank = (TextView) findViewById(R.id.ibank);
        TextView estate = (TextView) findViewById(R.id.iestate);
        TextView solicitor = (TextView) findViewById(R.id.isolicitor);
        TextView insurance = (TextView) findViewById(R.id.iinsurance);
        TextView health = (TextView) findViewById(R.id.ihealth);
        TextView factory = (TextView) findViewById(R.id.ifactory);
        TextView warehouse = (TextView) findViewById(R.id.iwarehouse);
        TextView utility = (TextView) findViewById(R.id.iutility);
        TextView buspark = (TextView) findViewById(R.id.ibuspark);
        TextView worship = (TextView) findViewById(R.id.iworship);
        TextView school = (TextView) findViewById(R.id.ischool);
        TextView tourist = (TextView) findViewById(R.id.itourist);
        TextView toilet = (TextView) findViewById(R.id.itoilet);
        TextView lib = (TextView) findViewById(R.id.ilib);
        TextView fire = (TextView) findViewById(R.id.ifire);
        TextView govt = (TextView) findViewById(R.id.igovt);
        TextView bus = (TextView) findViewById(R.id.ibus);
        TextView bar = (TextView) findViewById(R.id.ibar);
        TextView cafe = (TextView) findViewById(R.id.icafe);
        TextView cinema = (TextView) findViewById(R.id.icinema);
        TextView leisure = (TextView) findViewById(R.id.ileisure);
        TextView social = (TextView) findViewById(R.id.isocial);
        TextView arcade = (TextView) findViewById(R.id.iarcade);
        TextView parking = (TextView) findViewById(R.id.iparking);
        TextView cemetary = (TextView) findViewById(R.id.icemetary);
        TextView park = (TextView) findViewById(R.id.ipark);
        TextView construction = (TextView) findViewById(R.id.iconstruction);
        TextView sport = (TextView) findViewById(R.id.isport);
        TextView farm = (TextView) findViewById(R.id.ifarm);

        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);

        String houseSP = ifcLand.getString("ihouses", "0");
        house.setText(houseSP);
        String hotelSP = ifcLand.getString("ihotels", "0");
        hotel.setText(hotelSP);
        String supermarketSP = ifcLand.getString("isupermarkets", "0");
        supermarket.setText(supermarketSP);
        String constoreSP = ifcLand.getString("iconstores", "0");
        constore.setText(constoreSP);
        String compstoreSP = ifcLand.getString("icompstores", "0");
        compstore.setText(compstoreSP);
        String specSP = ifcLand.getString("ispecs", "0");
        spec.setText(specSP);
        String householdSP = ifcLand.getString("ihouseholds", "0");
        household.setText(householdSP);
        String sershopSP = ifcLand.getString("isershops", "0");
        sershop.setText(sershopSP);
        String charitySP = ifcLand.getString("icharitys", "0");
        charity.setText(charitySP);
        String bankSP = ifcLand.getString("ibanks", "0");
        bank.setText(bankSP);
        String estateSP = ifcLand.getString("iestates", "0");
        estate.setText(estateSP);
        String solicitorSP = ifcLand.getString("isolicitors", "0");
        solicitor.setText(solicitorSP);
        String insuranceSP = ifcLand.getString("iinsurances", "0");
        insurance.setText(insuranceSP);
        String healthSP = ifcLand.getString("ihealths", "0");
        health.setText(healthSP);
        String factorySP = ifcLand.getString("ifactorys", "0");
        factory.setText(factorySP);
        String warehouseSP = ifcLand.getString("iwarehouses", "0");
        warehouse.setText(warehouseSP);
        String utilitySP = ifcLand.getString("iutilitys", "0");
        utility.setText(utilitySP);
        String busparkSP = ifcLand.getString("ibusparks", "0");
        buspark.setText(busparkSP);
        String worshipSP = ifcLand.getString("iworships", "0");
        worship.setText(worshipSP);
        String schoolSP = ifcLand.getString("ischools", "0");
        school.setText(schoolSP);
        String touristSP = ifcLand.getString("itourists", "0");
        tourist.setText(touristSP);
        String toiletSP = ifcLand.getString("itoilets", "0");
        toilet.setText(toiletSP);
        String libSP = ifcLand.getString("ilibs", "0");
        lib.setText(libSP);
        String fireSP = ifcLand.getString("ifires", "0");
        fire.setText(fireSP);
        String govtSP = ifcLand.getString("igovts", "0");
        govt.setText(govtSP);
        String busSP = ifcLand.getString("ibuss", "0");
        bus.setText(busSP);
        String barSP = ifcLand.getString("ibars", "0");
        bar.setText(barSP);
        String cafeSP = ifcLand.getString("icafes", "0");
        cafe.setText(cafeSP);
        String cinemaSP = ifcLand.getString("icinemas", "0");
        cinema.setText(cinemaSP);
        String leisureSP = ifcLand.getString("ileisures", "0");
        leisure.setText(leisureSP);
        String socialSP = ifcLand.getString("isocials", "0");
        social.setText(socialSP);
        String arcadeSP = ifcLand.getString("iarcades", "0");
        arcade.setText(arcadeSP);
        String parkingSP = ifcLand.getString("iparkings", "0");
        parking.setText(parkingSP);
        String cemetarySP = ifcLand.getString("icemetarys", "0");
        cemetary.setText(cemetarySP);
        String parkSP = ifcLand.getString("iparks", "0");
        park.setText(parkSP);
        String constructionSP = ifcLand.getString("iconstructions", "0");
        construction.setText(constructionSP);
        String sportSP = ifcLand.getString("isports", "0");
        sport.setText(sportSP);
        String farmSP = ifcLand.getString("ifarms", "0");
        farm.setText(farmSP);
    }

    public void ihouse0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ihouse);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ihouses", carString).apply();
    }

    public void ihouse1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ihouse);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ihouses", carString).apply();
    }

    public void ihotel0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ihotel);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ihotels", carString).apply();
    }

    public void ihotel1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ihotel);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ihotels", carString).apply();
    }

    public void isupermarket0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isupermarket);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isupermarkets", carString).apply();
    }

    public void isupermarket1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isupermarket);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isupermarkets", carString).apply();
    }

    public void iconstore0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iconstore);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iconstores", carString).apply();
    }

    public void iconstore1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iconstore);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iconstores", carString).apply();
    }

    public void icompstore0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.icompstore);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("icompstores", carString).apply();
    }

    public void icompstore1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.icompstore);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("icompstores", carString).apply();
    }

    public void ispec0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ispec);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ispecs", carString).apply();
    }

    public void ispec1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ispec);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ispecs", carString).apply();
    }


    public void ihousehold0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ihousehold);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ihouseholds", carString).apply();
    }

    public void ihousehold1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ihousehold);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ihouseholds", carString).apply();
    }

    public void isershop0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isershop);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isershops", carString).apply();
    }

    public void isershop1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isershop);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isershops", carString).apply();
    }

    public void icharity0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.icharity);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("icharitys", carString).apply();
    }

    public void icharity1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.icharity);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("icharitys", carString).apply();
    }

    public void ibank0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ibank);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ibanks", carString).apply();
    }

    public void ibank1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ibank);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ibanks", carString).apply();
    }

    public void iestate0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iestate);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iestates", carString).apply();
    }

    public void iestate1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iestate);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iestates", carString).apply();
    }

    public void isolicitor0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isolicitor);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isolicitors", carString).apply();
    }

    public void isolicitor1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isolicitor);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isolicitors", carString).apply();
    }

    public void iinsurance0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iinsurance);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iinsurances", carString).apply();
    }

    public void iinsurance1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iinsurance);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iinsurances", carString).apply();
    }

    public void ihealth0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ihealth);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ihealths", carString).apply();
    }

    public void ihealth1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ihealth);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ihealths", carString).apply();
    }

    public void ifactory0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ifactory);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ifactorys", carString).apply();
    }

    public void ifactory1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ifactory);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ifactorys", carString).apply();
    }

    public void iwarehouse0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iwarehouse);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iwarehouses", carString).apply();
    }

    public void iwarehouse1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iwarehouse);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iwarehouses", carString).apply();
    }

    public void iutility0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iutility);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iutilitys", carString).apply();
    }

    public void iutility1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iutility);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iutilitys", carString).apply();
    }

    public void ibuspark0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ibuspark);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ibusparks", carString).apply();
    }

    public void ibuspark1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ibuspark);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ibusparks", carString).apply();
    }


    public void iworship0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iworship);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iworships", carString).apply();
    }

    public void iworship1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iworship);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iworships", carString).apply();
    }

    public void ischool0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ischool);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ischools", carString).apply();
    }

    public void ischool1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ischool);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ischools", carString).apply();
    }

    public void itourist0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.itourist);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("itourists", carString).apply();
    }

    public void itourist1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.itourist);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("itourists", carString).apply();
    }

    public void itoilet0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.itoilet);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("itoilets", carString).apply();
    }

    public void itoilet1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ischool);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("itoilets", carString).apply();
    }

    public void ilib0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ilib);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ilibs", carString).apply();
    }

    public void ilib1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ilib);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ilibs", carString).apply();
    }

    public void ifire0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ifire);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ifires", carString).apply();
    }

    public void ifire1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ifire);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ifires", carString).apply();
    }

    public void igovt0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.igovt);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("igovts", carString).apply();
    }

    public void igovt1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.igovt);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("igovts", carString).apply();
    }

    public void ibus0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ibus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ibuss", carString).apply();
    }

    public void ibus1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ibus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ibuss", carString).apply();
    }

    public void ibar0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ibar);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ibars", carString).apply();
    }

    public void ibar1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ibar);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ibars", carString).apply();
    }

    public void icafe0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.icafe);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ihealths", carString).apply();
    }

    public void icafe1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ihealth);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("icafes", carString).apply();
    }

    public void icinema0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.icinema);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("icinemas", carString).apply();
    }

    public void icinema1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.icinema);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("icinemas", carString).apply();
    }

    public void ileisure0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ileisure);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ileisure", carString).apply();
    }

    public void ileisure1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ileisure);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ileisures", carString).apply();
    }

    public void isocial0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isocial);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isocials", carString).apply();
    }

    public void isocial1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isocial);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isocials", carString).apply();
    }

    public void iarcade0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iarcade);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iarcades", carString).apply();
    }

    public void iarcade1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iarcade);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iarcades", carString).apply();
    }


    public void iparking0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iparking);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iparkings", carString).apply();
    }

    public void iparking1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iparking);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iparkings", carString).apply();
    }

    public void icemetary0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.icemetary);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("icemetarys", carString).apply();
    }

    public void icemetary1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.icemetary);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("icemetarys", carString).apply();
    }

    public void ipark0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ipark);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iparks", carString).apply();
    }

    public void ipark1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ipark);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iparks", carString).apply();
    }

    public void iconstruction0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iconstruction);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iconstructions", carString).apply();
    }

    public void iconstruction1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.iconstruction);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("iconstructions", carString).apply();
    }

    public void isport0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isport);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isports", carString).apply();
    }

    public void isport1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.isport);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("isports", carString).apply();
    }

    public void ifarm0(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ifarm);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ifarms", carString).apply();
    }

    public void ifarm1(View v) {
        SharedPreferences ifcLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.ifarm);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        ifcLand.edit().putString("ifarms", carString).apply();
    }

}