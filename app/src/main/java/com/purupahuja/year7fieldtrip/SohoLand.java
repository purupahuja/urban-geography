package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SohoLand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soho_land);

        TextView house = (TextView) findViewById(R.id.sohouse);
        TextView hotel = (TextView) findViewById(R.id.sohotel);
        TextView supermarket = (TextView) findViewById(R.id.sosupermarket);
        TextView constore = (TextView) findViewById(R.id.soconstore);
        TextView compstore = (TextView) findViewById(R.id.socompstore);
        TextView spec = (TextView) findViewById(R.id.sospec);
        TextView household = (TextView) findViewById(R.id.sohousehold);
        TextView sershop = (TextView) findViewById(R.id.sosershop);
        TextView charity = (TextView) findViewById(R.id.socharity);
        TextView bank = (TextView) findViewById(R.id.sobank);
        TextView estate = (TextView) findViewById(R.id.soestate);
        TextView solicitor = (TextView) findViewById(R.id.sosolicitor);
        TextView insurance = (TextView) findViewById(R.id.soinsurance);
        TextView health = (TextView) findViewById(R.id.sohealth);
        TextView factory = (TextView) findViewById(R.id.sofactory);
        TextView warehouse = (TextView) findViewById(R.id.sowarehouse);
        TextView utility = (TextView) findViewById(R.id.soutility);
        TextView buspark = (TextView) findViewById(R.id.sobuspark);
        TextView worship = (TextView) findViewById(R.id.soworship);
        TextView school = (TextView) findViewById(R.id.soschool);
        TextView tourist = (TextView) findViewById(R.id.sotourist);
        TextView toilet = (TextView) findViewById(R.id.sotoilet);
        TextView lib = (TextView) findViewById(R.id.solib);
        TextView fire = (TextView) findViewById(R.id.sofire);
        TextView govt = (TextView) findViewById(R.id.sogovt);
        TextView bus = (TextView) findViewById(R.id.sobus);
        TextView bar = (TextView) findViewById(R.id.sobar);
        TextView cafe = (TextView) findViewById(R.id.socafe);
        TextView cinema = (TextView) findViewById(R.id.socinema);
        TextView leisure = (TextView) findViewById(R.id.soleisure);
        TextView social = (TextView) findViewById(R.id.sosocial);
        TextView arcade = (TextView) findViewById(R.id.soarcade);
        TextView parking = (TextView) findViewById(R.id.soparking);
        TextView cemetary = (TextView) findViewById(R.id.socemetary);
        TextView park = (TextView) findViewById(R.id.sopark);
        TextView construction = (TextView) findViewById(R.id.soconstruction);
        TextView sport = (TextView) findViewById(R.id.sosport);
        TextView farm = (TextView) findViewById(R.id.sofarm);

        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);

        String houseSP = sohoLand.getString("housesso", "0");
        house.setText(houseSP);
        String hotelSP = sohoLand.getString("hotelsso", "0");
        hotel.setText(hotelSP);
        String supermarketSP = sohoLand.getString("supermarketsso", "0");
        supermarket.setText(supermarketSP);
        String constoreSP = sohoLand.getString("constoresso", "0");
        constore.setText(constoreSP);
        String compstoreSP = sohoLand.getString("compstoresso", "0");
        compstore.setText(compstoreSP);
        String specSP = sohoLand.getString("specsso", "0");
        spec.setText(specSP);
        String householdSP = sohoLand.getString("householdsso", "0");
        household.setText(householdSP);
        String sershopSP = sohoLand.getString("sershopsso", "0");
        sershop.setText(sershopSP);
        String charitySP = sohoLand.getString("charitysso", "0");
        charity.setText(charitySP);
        String bankSP = sohoLand.getString("banksso", "0");
        bank.setText(bankSP);
        String estateSP = sohoLand.getString("estatesso", "0");
        estate.setText(estateSP);
        String solicitorSP = sohoLand.getString("solicitorsso", "0");
        solicitor.setText(solicitorSP);
        String insuranceSP = sohoLand.getString("insurancesso", "0");
        insurance.setText(insuranceSP);
        String healthSP = sohoLand.getString("healthsso", "0");
        health.setText(healthSP);
        String factorySP = sohoLand.getString("factorysso", "0");
        factory.setText(factorySP);
        String warehouseSP = sohoLand.getString("warehousesso", "0");
        warehouse.setText(warehouseSP);
        String utilitySP = sohoLand.getString("utilitysso", "0");
        utility.setText(utilitySP);
        String busparkSP = sohoLand.getString("busparksso", "0");
        buspark.setText(busparkSP);
        String worshipSP = sohoLand.getString("worshipsso", "0");
        worship.setText(worshipSP);
        String schoolSP = sohoLand.getString("schoolsso", "0");
        school.setText(schoolSP);
        String touristSP = sohoLand.getString("touristsso", "0");
        tourist.setText(touristSP);
        String toiletSP = sohoLand.getString("toiletsso", "0");
        toilet.setText(toiletSP);
        String libSP = sohoLand.getString("libsso", "0");
        lib.setText(libSP);
        String fireSP = sohoLand.getString("firesso", "0");
        fire.setText(fireSP);
        String govtSP = sohoLand.getString("govtsso", "0");
        govt.setText(govtSP);
        String busSP = sohoLand.getString("bussso", "0");
        bus.setText(busSP);
        String barSP = sohoLand.getString("barsso", "0");
        bar.setText(barSP);
        String cafeSP = sohoLand.getString("cafesso", "0");
        cafe.setText(cafeSP);
        String cinemaSP = sohoLand.getString("cinemasso", "0");
        cinema.setText(cinemaSP);
        String leisureSP = sohoLand.getString("leisuresso", "0");
        leisure.setText(leisureSP);
        String socialSP = sohoLand.getString("socialsso", "0");
        social.setText(socialSP);
        String arcadeSP = sohoLand.getString("arcadesso", "0");
        arcade.setText(arcadeSP);
        String parkingSP = sohoLand.getString("parkingsso", "0");
        parking.setText(parkingSP);
        String cemetarySP = sohoLand.getString("cemetarysso", "0");
        cemetary.setText(cemetarySP);
        String parkSP = sohoLand.getString("parksso", "0");
        park.setText(parkSP);
        String constructionSP = sohoLand.getString("constructionsso", "0");
        construction.setText(constructionSP);
        String sportSP = sohoLand.getString("sportsso", "0");
        sport.setText(sportSP);
        String farmSP = sohoLand.getString("farmsso", "0");
        farm.setText(farmSP);
    }

    public void sohouse0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sohouse);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("housesso", carString).apply();
    }

    public void sohouse1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sohouse);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("housesso", carString).apply();
    }

    public void sohotel0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sohotel);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("hotelsso", carString).apply();
    }

    public void sohotel1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sohotel);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("hotelsso", carString).apply();
    }

    public void sosupermarket0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosupermarket);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("supermarketsso", carString).apply();
    }

    public void sosupermarket1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosupermarket);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("supermarketsso", carString).apply();
    }

    public void soconstore0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soconstore);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("constoresso", carString).apply();
    }

    public void soconstore1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soconstore);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("constoresso", carString).apply();
    }

    public void socompstore0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.socompstore);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("compstoresso", carString).apply();
    }

    public void socompstore1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.socompstore);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("compstoresso", carString).apply();
    }

    public void sospec0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sospec);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("specsso", carString).apply();
    }

    public void sospec1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sospec);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("specsso", carString).apply();
    }


    public void sohousehold0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sohousehold);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("householdsso", carString).apply();
    }

    public void sohousehold1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sohousehold);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("householdsso", carString).apply();
    }

    public void sosershop0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosershop);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sershopsso", carString).apply();
    }

    public void sosershop1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosershop);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sershopsso", carString).apply();
    }

    public void socharity0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.socharity);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("charitysso", carString).apply();
    }

    public void socharity1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.socharity);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("charitysso", carString).apply();
    }

    public void sobank0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sobank);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("banksso", carString).apply();
    }

    public void sobank1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sobank);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("banksso", carString).apply();
    }

    public void soestate0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soestate);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("estatesso", carString).apply();
    }

    public void soestate1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soestate);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("estatesso", carString).apply();
    }

    public void sosolicitor0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosolicitor);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("solicitorsso", carString).apply();
    }

    public void sosolicitor1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosolicitor);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("solicitorsso", carString).apply();
    }

    public void soinsurance0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soinsurance);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("insurancesso", carString).apply();
    }

    public void soinsurance1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soinsurance);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("insurancesso", carString).apply();
    }

    public void sohealth0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sohealth);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("healthsso", carString).apply();
    }

    public void sohealth1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sohealth);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("healthsso", carString).apply();
    }

    public void sofactory0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sofactory);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("factorysso", carString).apply();
    }

    public void sofactory1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sofactory);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("factorysso", carString).apply();
    }

    public void sowarehouse0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sowarehouse);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("warehousesso", carString).apply();
    }

    public void sowarehouse1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sowarehouse);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("warehousesso", carString).apply();
    }

    public void soutility0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soutility);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("utilitysso", carString).apply();
    }

    public void soutility1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soutility);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("utilitysso", carString).apply();
    }

    public void sobuspark0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sobuspark);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("busparksso", carString).apply();
    }

    public void sobuspark1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sobuspark);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("busparksso", carString).apply();
    }


    public void soworship0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soworship);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("worshipsso", carString).apply();
    }

    public void soworship1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soworship);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("worshipsso", carString).apply();
    }

    public void soschool0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soschool);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("schoolsso", carString).apply();
    }

    public void soschool1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soschool);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("schoolsso", carString).apply();
    }

    public void sotourist0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sotourist);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("touristsso", carString).apply();
    }

    public void sotourist1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sotourist);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("touristsso", carString).apply();
    }

    public void sotoilet0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sotoilet);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("toiletsso", carString).apply();
    }

    public void sotoilet1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sotoilet);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("toiletsso", carString).apply();
    }

    public void solib0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.solib);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("libsso", carString).apply();
    }

    public void solib1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.solib);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("libsso", carString).apply();
    }

    public void sofire0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sofire);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("firesso", carString).apply();
    }

    public void sofire1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sofire);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("firesso", carString).apply();
    }

    public void sogovt0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sogovt);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("govtsso", carString).apply();
    }

    public void sogovt1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sogovt);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("govtsso", carString).apply();
    }

    public void sobus0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sobus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("bussso", carString).apply();
    }

    public void sobus1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sobus);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("bussso", carString).apply();
    }

    public void sobar0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sobar);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("barsso", carString).apply();
    }

    public void sobar1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sobar);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("barsso", carString).apply();
    }

    public void socafe0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.socafe);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("cafesso", carString).apply();
    }

    public void socafe1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.socafe);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("cafesso", carString).apply();
    }

    public void socinema0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.socinema);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("cinemasso", carString).apply();
    }

    public void socinema1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.socinema);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("cinemasso", carString).apply();
    }

    public void soleisure0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soleisure);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("leisureso", carString).apply();
    }

    public void soleisure1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soleisure);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("leisuresso", carString).apply();
    }

    public void sosocial0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosocial);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("socialsso", carString).apply();
    }

    public void sosocial1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosocial);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("socialsso", carString).apply();
    }

    public void soarcade0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soarcade);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("arcadesso", carString).apply();
    }

    public void soarcade1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soarcade);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("arcadesso", carString).apply();
    }


    public void soparking0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soparking);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("parkingsso", carString).apply();
    }

    public void soparking1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soparking);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("parkingsso", carString).apply();
    }

    public void socemetary0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.socemetary);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("cemetarysso", carString).apply();
    }

    public void socemetary1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.socemetary);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("cemetarysso", carString).apply();
    }

    public void sopark0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sopark);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("parksso", carString).apply();
    }

    public void sopark1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sopark);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("parksso", carString).apply();
    }

    public void soconstruction0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soconstruction);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("constructionsso", carString).apply();
    }

    public void soconstruction1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.soconstruction);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("constructionsso", carString).apply();
    }

    public void sosport0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosport);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sportsso", carString).apply();
    }

    public void sosport1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sosport);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("sportsso", carString).apply();
    }

    public void sofarm0(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sofarm);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses - 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("farmsso", carString).apply();
    }

    public void sofarm1(View v) {
        SharedPreferences sohoLand = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView house = (TextView) findViewById(R.id.sofarm);
        int houses = Integer.parseInt(house.getText().toString());
        houses = houses + 1;
        String carString = Integer.toString(houses);
        house.setText(carString);
        sohoLand.edit().putString("farmsso", carString).apply();
    }

}