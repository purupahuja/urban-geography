package com.purupahuja.year7fieldtrip;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class PeakTraffic extends AppCompatActivity {


    TextView timerText;
    // creates private static final String to be used for formatting the time left
    private static final String FORMAT = "%02d:%02d:%02d";


    int seconds , minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peak_traffic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView van = (TextView) findViewById(R.id.van);
        TextView bus = (TextView) findViewById(R.id.bus);
        TextView taxi = (TextView) findViewById(R.id.taxi);
        TextView car = (TextView) findViewById(R.id.car);
        TextView bic = (TextView) findViewById(R.id.bic);

        SharedPreferences peakTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        String carSP = peakTraffic.getString("cars", "0");
        car.setText(carSP);
        String bicSP = peakTraffic.getString("bics", "0");
        bic.setText(bicSP);
        String vanSP = peakTraffic.getString("vans", "0");
        van.setText(vanSP);
        String busSP = peakTraffic.getString("buses", "0");
        bus.setText(busSP);
        String taxiSP = peakTraffic.getString("taxis", "0");
        taxi.setText(taxiSP);
    }

    public void timer(View v) {
        timerText=(TextView)findViewById(R.id.peakTimer); // declares variable for timer TextView
        new CountDownTimer(300000, 1000){ // creates a new timer for 300,000 milliseconds (5 minutes) and decrements every 1,000 milliseconds (1 second)
            public void onTick(long millisUntilFinished) { // creates new  method which takes a long variable (number of milliseconds left) as its parameter
                // sets the text of the TextView in the format of the 'FORMAT' variable created earlier
                timerText.setText(""+String.format(FORMAT, TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished), // converts milliseconds left to finish into minutes
                        // converts milliseconds left into seconds and removes the above number of minutes (after converting to seconds) from the original number of seconds
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)),
                        // removes the above number of seconds (after converting to milliseconds) from the original number of milliseconds
                        TimeUnit.MILLISECONDS.toMillis(millisUntilFinished) - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished))));
            }
            public void onFinish() {// creates method for what happens when the timer is finished
                timerText.setText("Time's Up"); // change text of TextView to "Time's Up"
            }
        }.start(); // start the timer when button is clicked
    }

    public void car0(View v) {
        SharedPreferences peakTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView car = (TextView) findViewById(R.id.car);
        int cars = Integer.parseInt(car.getText().toString());
        cars = cars - 1;
        String carString = Integer.toString(cars);
        car.setText(carString);
        peakTraffic.edit().putString("cars", carString).apply();
        Log.i("number of cars at peak", carString);
    }

    public void car1(View v) {
        TextView car = (TextView) findViewById(R.id.car);
        SharedPreferences peakTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        int cars = Integer.parseInt(car.getText().toString());
        cars = cars + 1;
        String carString = Integer.toString(cars);
        car.setText(carString);
        peakTraffic.edit().putString("cars", carString).apply();
        Log.i("number of cars at peak", carString);
    }

    public void bic0(View v) {
        SharedPreferences peakTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView bic = (TextView) findViewById(R.id.bic);
        int bics = Integer.parseInt(bic.getText().toString());
        bics = bics - 1;
        String bicString = Integer.toString(bics);
        bic.setText(bicString);
        peakTraffic.edit().putString("bics", bicString).apply();
    }

    public void bic1(View v) {
        TextView bic = (TextView) findViewById(R.id.bic);
        SharedPreferences peakTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        int bics = Integer.parseInt(bic.getText().toString());
        bics = bics + 1;
        String bicString = Integer.toString(bics);
        bic.setText(bicString);
        peakTraffic.edit().putString("bics", bicString).apply();
    }

    public void van0(View v) {
        SharedPreferences peakTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView van = (TextView) findViewById(R.id.van);
        int vans = Integer.parseInt(van.getText().toString());
        vans = vans - 1;
        String vanString = Integer.toString(vans);
        van.setText(vanString);
        peakTraffic.edit().putString("vans", vanString).apply();
    }

    public void van1(View v) {
        SharedPreferences peakTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView van = (TextView) findViewById(R.id.van);
        int vans = Integer.parseInt(van.getText().toString());
        vans = vans + 1;
        String vanString = Integer.toString(vans);
        van.setText(vanString);
        peakTraffic.edit().putString("vans", vanString).apply();
    }

    public void bus0(View v) {
        SharedPreferences peakTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView bus = (TextView) findViewById(R.id.bus);
        int buses = Integer.parseInt(bus.getText().toString());
        buses = buses - 1;
        String busString = Integer.toString(buses);
        bus.setText(busString);
        peakTraffic.edit().putString("buses", busString).apply();
    }

    public void bus1(View v) {
        TextView bus = (TextView) findViewById(R.id.bus);
        SharedPreferences peakTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        int buses = Integer.parseInt(bus.getText().toString());
        buses = buses + 1;
        String busString = Integer.toString(buses);
        bus.setText(busString);
        peakTraffic.edit().putString("buses", busString).apply();
    }

    public void taxi0(View v) {
        SharedPreferences peakTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView taxi = (TextView) findViewById(R.id.taxi);
        int taxis = Integer.parseInt(taxi.getText().toString());
        taxis = taxis - 1;
        String taxiString = Integer.toString(taxis);
        taxi.setText(taxiString);
        peakTraffic.edit().putString("taxis", taxiString).apply();
    }

    public void taxi1(View v) {
        TextView taxi = (TextView) findViewById(R.id.taxi);
        SharedPreferences peakTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        int taxis = Integer.parseInt(taxi.getText().toString());
        taxis = taxis + 1;
        String taxiString = Integer.toString(taxis);
        taxi.setText(taxiString);
        peakTraffic.edit().putString("taxis", taxiString).apply();
    }



}