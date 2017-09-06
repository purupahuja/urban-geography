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

public class PeakLand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peak_land);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView house = (TextView) findViewById(R.id.house);
        TextView hotel = (TextView) findViewById(R.id.hotel);
        TextView supermarket = (TextView) findViewById(R.id.supermarket);
        TextView constore = (TextView) findViewById(R.id.constore);
        TextView compstore = (TextView) findViewById(R.id.compstore);
        TextView spec = (TextView) findViewById(R.id.spec);
        TextView household = (TextView) findViewById(R.id.household);
        TextView sershop = (TextView) findViewById(R.id.sershop);
        TextView charity = (TextView) findViewById(R.id.charity);
        TextView bank = (TextView) findViewById(R.id.bank);
        TextView estate = (TextView) findViewById(R.id.estate);
        TextView solicitor = (TextView) findViewById(R.id.solicitor);
        TextView insurance = (TextView) findViewById(R.id.insurance);
        TextView health = (TextView) findViewById(R.id.health);
        TextView factory = (TextView) findViewById(R.id.factory);
        TextView warehouse = (TextView) findViewById(R.id.warehouse);
        TextView utility = (TextView) findViewById(R.id.utility);
        TextView buspark = (TextView) findViewById(R.id.buspark);
        TextView worship = (TextView) findViewById(R.id.worship);
        TextView school = (TextView) findViewById(R.id.school);
        TextView tourist = (TextView) findViewById(R.id.tourist);
        TextView toilet = (TextView) findViewById(R.id.toilet);
        TextView lib = (TextView) findViewById(R.id.lib);
        TextView fire = (TextView) findViewById(R.id.fire);
        TextView govt = (TextView) findViewById(R.id.govt);
        TextView bus = (TextView) findViewById(R.id.bus);
        TextView bar = (TextView) findViewById(R.id.bar);
        TextView cafe = (TextView) findViewById(R.id.cafe);
        TextView cinema = (TextView) findViewById(R.id.cinema);
        TextView leisure = (TextView) findViewById(R.id.leisure);
        TextView social = (TextView) findViewById(R.id.social);
        TextView arcade = (TextView) findViewById(R.id.arcade);
        TextView parking = (TextView) findViewById(R.id.parking);
        TextView cemetary = (TextView) findViewById(R.id.cemetary);
        TextView park = (TextView) findViewById(R.id.park);
        TextView construction = (TextView) findViewById(R.id.construction);
        TextView sport = (TextView) findViewById(R.id.sport);
        TextView farm = (TextView) findViewById(R.id.farm);

        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);

        String houseSP = peakLand.getString("houses", "0");
        house.setText(houseSP);
        String hotelSP = peakLand.getString("hotels", "0");
        hotel.setText(hotelSP);
        String supermarketSP = peakLand.getString("supermarkets", "0");
        supermarket.setText(supermarketSP);
        String constoreSP = peakLand.getString("constores", "0");
        constore.setText(constoreSP);
        String compstoreSP = peakLand.getString("compstores", "0");
        compstore.setText(compstoreSP);
        String specSP = peakLand.getString("specs", "0");
        spec.setText(specSP);
        String householdSP = peakLand.getString("households", "0");
        household.setText(householdSP);
        String sershopSP = peakLand.getString("sershops", "0");
        sershop.setText(sershopSP);
        String charitySP = peakLand.getString("charitys", "0");
        charity.setText(charitySP);
        String bankSP = peakLand.getString("banks", "0");
        bank.setText(bankSP);
        String estateSP = peakLand.getString("estates", "0");
        estate.setText(estateSP);
        String solicitorSP = peakLand.getString("solicitors", "0");
        solicitor.setText(solicitorSP);
        String insuranceSP = peakLand.getString("insurances", "0");
        insurance.setText(insuranceSP);
        String healthSP = peakLand.getString("healths", "0");
        health.setText(healthSP);
        String factorySP = peakLand.getString("factorys", "0");
        factory.setText(factorySP);
        String warehouseSP = peakLand.getString("warehouses", "0");
        warehouse.setText(warehouseSP);
        String utilitySP = peakLand.getString("utilitys", "0");
        utility.setText(utilitySP);
        String busparkSP = peakLand.getString("busparks", "0");
        buspark.setText(busparkSP);
        String worshipSP = peakLand.getString("worships", "0");
        worship.setText(worshipSP);
        String schoolSP = peakLand.getString("schools", "0");
        school.setText(schoolSP);
        String touristSP = peakLand.getString("tourists", "0");
        tourist.setText(touristSP);
        String toiletSP = peakLand.getString("toilets", "0");
        toilet.setText(toiletSP);
        String libSP = peakLand.getString("libs", "0");
        lib.setText(libSP);
        String fireSP = peakLand.getString("fires", "0");
        fire.setText(fireSP);
        String govtSP = peakLand.getString("govts", "0");
        govt.setText(govtSP);
        String busSP = peakLand.getString("buss", "0");
        bus.setText(busSP);
        String barSP = peakLand.getString("bars", "0");
        bar.setText(barSP);
        String cafeSP = peakLand.getString("cafes", "0");
        cafe.setText(cafeSP);
        String cinemaSP = peakLand.getString("cinemas", "0");
        cinema.setText(cinemaSP);
        String leisureSP = peakLand.getString("leisures", "0");
        leisure.setText(leisureSP);
        String socialSP = peakLand.getString("socials", "0");
        social.setText(socialSP);
        String arcadeSP = peakLand.getString("arcades", "0");
        arcade.setText(arcadeSP);
        String parkingSP = peakLand.getString("parkings", "0");
        parking.setText(parkingSP);
        String cemetarySP = peakLand.getString("cemetarys", "0");
        cemetary.setText(cemetarySP);
        String parkSP = peakLand.getString("parks", "0");
        park.setText(parkSP);
        String constructionSP = peakLand.getString("constructions", "0");
        construction.setText(constructionSP);
        String sportSP = peakLand.getString("sports", "0");
        sport.setText(sportSP);
        String farmSP = peakLand.getString("farms", "0");
        farm.setText(farmSP);
    }

    public void house0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.house);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("houses", carString).apply();
    }

    public void house1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.house);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("houses", carString).apply();
    }

    public void hotel0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.hotel);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("hotels", carString).apply();
    }

    public void hotel1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.hotel);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("hotels", carString).apply();
    }

    public void supermarket0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.supermarket);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("supermarkets", carString).apply();
    }

    public void supermarket1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.supermarket);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("supermarkets", carString).apply();
    }

    public void constore0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.constore);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("constores", carString).apply();
    }

    public void constore1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.constore);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("constores", carString).apply();
    }

    public void compstore0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.compstore);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("compstores", carString).apply();
    }

    public void compstore1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.compstore);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("compstores", carString).apply();
    }

    public void spec0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.spec);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("specs", carString).apply();
    }

    public void spec1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.spec);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("specs", carString).apply();
    }


    public void household0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.household);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("households", carString).apply();
    }

    public void household1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.household);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("households", carString).apply();
    }

    public void sershop0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sershop);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("sershops", carString).apply();
    }

    public void sershop1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sershop);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("sershops", carString).apply();
    }

    public void charity0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.charity);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("charitys", carString).apply();
    }

    public void charity1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.charity);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("charitys", carString).apply();
    }

    public void bank0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.bank);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("banks", carString).apply();
    }

    public void bank1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.bank);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("banks", carString).apply();
    }

    public void estate0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.estate);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("estates", carString).apply();
    }

    public void estate1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.estate);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("estates", carString).apply();
    }

    public void solicitor0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.solicitor);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("solicitors", carString).apply();
    }

    public void solicitor1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.solicitor);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("solicitors", carString).apply();
    }

    public void insurance0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.insurance);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("insurances", carString).apply();
    }

    public void insurance1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.insurance);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("insurances", carString).apply();
    }

    public void health0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.health);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("healths", carString).apply();
    }

    public void health1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.health);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("healths", carString).apply();
    }

    public void factory0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.factory);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("factorys", carString).apply();
    }

    public void factory1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.factory);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("factorys", carString).apply();
    }

    public void warehouse0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.warehouse);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("warehouses", carString).apply();
    }

    public void warehouse1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.warehouse);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("warehouses", carString).apply();
    }

    public void utility0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.utility);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("utilitys", carString).apply();
    }

    public void utility1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.utility);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("utilitys", carString).apply();
    }

    public void buspark0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.buspark);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("busparks", carString).apply();
    }

    public void buspark1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.buspark);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("busparks", carString).apply();
    }


    public void worship0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.worship);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("worships", carString).apply();
    }

    public void worship1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.worship);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("worships", carString).apply();
    }

    public void school0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.school);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("schools", carString).apply();
    }

    public void school1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.school);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("schools", carString).apply();
    }

    public void tourist0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.tourist);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("tourists", carString).apply();
    }

    public void tourist1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.tourist);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("tourists", carString).apply();
    }

    public void toilet0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.toilet);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("toilets", carString).apply();
    }

    public void toilet1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.toilet);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("toilets", carString).apply();
    }

    public void lib0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.lib);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("libs", carString).apply();
    }

    public void lib1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.lib);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("libs", carString).apply();
    }

    public void fire0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.fire);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("fires", carString).apply();
    }

    public void fire1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.fire);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("fires", carString).apply();
    }

    public void govt0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.govt);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("govts", carString).apply();
    }

    public void govt1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.govt);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("govts", carString).apply();
    }

    public void bus0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.bus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("buss", carString).apply();
    }

    public void bus1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.bus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("buss", carString).apply();
    }

    public void bar0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.bar);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("bars", carString).apply();
    }

    public void bar1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.bar);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("bars", carString).apply();
    }

    public void cafe0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.cafe);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("cafes", carString).apply();
    }

    public void cafe1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.cafe);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("cafes", carString).apply();
    }

    public void cinema0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.cinema);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("cinemas", carString).apply();
    }

    public void cinema1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.cinema);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("cinemas", carString).apply();
    }

    public void leisure0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.leisure);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("leisure", carString).apply();
    }

    public void leisure1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.leisure);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("leisures", carString).apply();
    }

    public void social0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.social);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("socials", carString).apply();
    }

    public void social1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.social);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("socials", carString).apply();
    }

    public void arcade0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.arcade);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("arcades", carString).apply();
    }

    public void arcade1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.arcade);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("arcades", carString).apply();
    }


    public void parking0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.parking);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("parkings", carString).apply();
    }

    public void parking1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.parking);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("parkings", carString).apply();
    }

    public void cemetary0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.cemetary);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("cemetarys", carString).apply();
    }

    public void cemetary1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.cemetary);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("cemetarys", carString).apply();
    }

    public void park0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.park);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("parks", carString).apply();
    }

    public void park1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.park);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("parks", carString).apply();
    }

    public void construction0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.construction);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("constructions", carString).apply();
    }

    public void construction1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.construction);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("constructions", carString).apply();
    }

    public void sport0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sport);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("sports", carString).apply();
    }

    public void sport1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sport);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("sports", carString).apply();
    }

    public void farm0(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.farm);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("farms", carString).apply();
    }

    public void farm1(View v) {
        SharedPreferences peakLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.farm);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        peakLand.edit().putString("farms", carString).apply();
    }

}