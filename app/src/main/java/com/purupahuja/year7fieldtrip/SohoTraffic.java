package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class SohoTraffic extends AppCompatActivity {

    TextView text1;
    private static final String FORMAT = "%02d:%02d:%02d";
    int seconds , minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // creates onCreate method which takes the saved state of screen as a parameter
        setContentView(R.layout.activity_soho_traffic); // calls the XML layout file for the SohoTraffic page
        TextView van = (TextView) findViewById(R.id.sovan); // creates variable for TextView for showing number of vans in SoHo
        TextView bus = (TextView) findViewById(R.id.sobus); // creates variable for TextView for showing number of buses in SoHo
        TextView taxi = (TextView) findViewById(R.id.sotaxi); // creates variable for TextView for showing number of taxis in SoHo
        TextView car = (TextView) findViewById(R.id.socar); // creates variable for TextView for showing number of cars in SoHo
        TextView bic = (TextView) findViewById(R.id.sobic); // creates variable for TextView for showing number of bicycles in SoHo
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE); // declares variable to access SharedPreferences
        String carSP = sohoTraffic.getString("socars", "0"); // gets value for number of cars at SoHo from SharedPreferences
        car.setText(carSP); // sets the text of the car tally's TextView to the SharedPreferences value
        String bicSP = sohoTraffic.getString("sobics", "0"); // gets value for number of bicycles at SoHo from SharedPreferences
        bic.setText(bicSP);// sets the text of the bicycle tally's TextView to the SharedPreferences value
        String vanSP = sohoTraffic.getString("sovans", "0"); // gets value for number of vans at SoHo from SharedPreferences
        van.setText(vanSP);// sets the text of the van tally's TextView to the SharedPreferences value
        String busSP = sohoTraffic.getString("sobuses", "0"); // gets value for number of buses at SoHo from SharedPreferences
        bus.setText(busSP);// sets the text of the bus tally's TextView to the SharedPreferences value
        String taxiSP = sohoTraffic.getString("sotaxis", "0"); // gets value for number of taxis at SoHo from SharedPreferences
        taxi.setText(taxiSP);// sets the text of the taxi tally's TextView to the SharedPreferences value
    }

    public void timer(View v) {
        text1=(TextView)findViewById(R.id.sohoTimer);
        new CountDownTimer(300000, 1000) { // adjust the milli seconds here
            public void onTick(long millisUntilFinished) {text1.setText(""+String.format(FORMAT, TimeUnit.MILLISECONDS.toHours(millisUntilFinished), TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)), TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));}
            public void onFinish() {
                text1.setText("Time's Up");
            }
        }.start();
    }

    public void socar0(View v) {
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView car = (TextView) findViewById(R.id.socar);
        int cars = Integer.parseInt(car.getText().toString());
        cars = cars - 1;
        String carString = Integer.toString(cars);
        car.setText(carString);
        sohoTraffic.edit().putString("socars", carString).apply();
    }

    public void socar1(View v) {
        TextView car = (TextView) findViewById(R.id.socar); // creates variable for car tally's TextView
        int cars = Integer.parseInt(car.getText().toString()); // integer variable which gets String text from the TextView and converts to integer
        cars = cars + 1; // increases the value of 'cars' by 1
        String carString = Integer.toString(cars); // converts 'cars' integer to String
        car.setText(carString); // sets the value of the TextView to the increased one
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE); // declares variable to access SharedPreferences
        sohoTraffic.edit().putString("socars", carString).apply(); // updates value in SharedPreferences
    }

    public void sobic0(View v) {
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView bic = (TextView) findViewById(R.id.sobic);
        int bics = Integer.parseInt(bic.getText().toString());
        bics = bics - 1;
        String bicString = Integer.toString(bics);
        bic.setText(bicString);
        sohoTraffic.edit().putString("sobics", bicString).apply();
        Log.i("Bikes at SoHo", bicString);
    }

    public void sobic1(View v) {
        TextView bic = (TextView) findViewById(R.id.sobic);
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        int bics = Integer.parseInt(bic.getText().toString());
        bics = bics + 1;
        String bicString = Integer.toString(bics);
        bic.setText(bicString);
        sohoTraffic.edit().putString("sobics", bicString).apply();
        Log.i("Bikes at SoHo", bicString);
    }

    public void sovan0(View v) {
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView van = (TextView) findViewById(R.id.sovan);
        int vans = Integer.parseInt(van.getText().toString());
        vans = vans - 1;
        String vanString = Integer.toString(vans);
        van.setText(vanString);
        sohoTraffic.edit().putString("sovans", vanString).apply();
        Log.i("Vans at SoHo", vanString);
    }

    public void sovan1(View v) {
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView van = (TextView) findViewById(R.id.sovan);
        int vans = Integer.parseInt(van.getText().toString());
        vans = vans + 1;
        String vanString = Integer.toString(vans);
        van.setText(vanString);
        sohoTraffic.edit().putString("sovans", vanString).apply();
        Log.i("Vans at SoHo", vanString);
    }

    public void sobus0(View v) {
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView bus = (TextView) findViewById(R.id.sobus);
        int buses = Integer.parseInt(bus.getText().toString());
        buses = buses - 1;
        String busString = Integer.toString(buses);
        bus.setText(busString);
        sohoTraffic.edit().putString("sobuses", busString).apply();
    }

    public void sobus1(View v) {
        TextView bus = (TextView) findViewById(R.id.sobus);
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        int buses = Integer.parseInt(bus.getText().toString());
        buses = buses + 1;
        String busString = Integer.toString(buses);
        bus.setText(busString);
        sohoTraffic.edit().putString("sobuses", busString).apply();
    }

    public void sotaxi0(View v) {
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView taxi = (TextView) findViewById(R.id.sotaxi);
        int taxis = Integer.parseInt(taxi.getText().toString());
        taxis = taxis - 1;
        String taxiString = Integer.toString(taxis);
        taxi.setText(taxiString);
        sohoTraffic.edit().putString("sotaxis", taxiString).apply();
    }

    public void sotaxi1(View v) {
        TextView taxi = (TextView) findViewById(R.id.sotaxi);
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        int taxis = Integer.parseInt(taxi.getText().toString());
        taxis = taxis + 1;
        String taxiString = Integer.toString(taxis);
        taxi.setText(taxiString);
        sohoTraffic.edit().putString("sotaxis", taxiString).apply();
    }

}