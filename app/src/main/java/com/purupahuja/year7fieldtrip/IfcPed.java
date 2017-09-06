package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class IfcPed extends AppCompatActivity {

    TextView text1;
    private static final String FORMAT = "%02d:%02d:%02d";
    int seconds , minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifc_ped);
        TextView mten = (TextView) findViewById(R.id.imten);
        TextView mtwenty = (TextView) findViewById(R.id.imtwenty);
        TextView mthirty = (TextView) findViewById(R.id.imthirty);
        TextView mforty = (TextView) findViewById(R.id.imforty);
        TextView mfifty = (TextView) findViewById(R.id.imfifty);
        TextView msixty = (TextView) findViewById(R.id.imsixty);
        TextView mplus = (TextView) findViewById(R.id.implus);
        TextView ften = (TextView) findViewById(R.id.iften);
        TextView ftwenty = (TextView) findViewById(R.id.iftwenty);
        TextView fthirty = (TextView) findViewById(R.id.ifthirty);
        TextView fforty = (TextView) findViewById(R.id.ifforty);
        TextView ffifty = (TextView) findViewById(R.id.iffifty);
        TextView fsixty = (TextView) findViewById(R.id.ifsixty);
        TextView fplus = (TextView) findViewById(R.id.ifplus);

        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);

        String mtenSP = ifcPed.getString("imten", "0");
        mten.setText(mtenSP);
        String mtwentySP = ifcPed.getString("imtwenty", "0");
        mtwenty.setText(mtwentySP);
        String mthirtySP = ifcPed.getString("imthirty", "0");
        mthirty.setText(mthirtySP);
        String mfortySP = ifcPed.getString("imforty", "0");
        mforty.setText(mfortySP);
        String mfiftySP = ifcPed.getString("imfifty", "0");
        mfifty.setText(mfiftySP);
        String msixtySP = ifcPed.getString("imsixty", "0");
        msixty.setText(msixtySP);
        String mplusSP = ifcPed.getString("implus", "0");
        mplus.setText(mplusSP);

        String ftenSP = ifcPed.getString("iften", "0");
        ften.setText(ftenSP);
        String ftwentySP = ifcPed.getString("iftwenty", "0");
        ftwenty.setText(ftwentySP);
        String fthirtySP = ifcPed.getString("ifthirty", "0");
        fthirty.setText(fthirtySP);
        String ffortySP = ifcPed.getString("ifforty", "0");
        fforty.setText(ffortySP);
        String ffiftySP = ifcPed.getString("iffifty", "0");
        ffifty.setText(ffiftySP);
        String fsixtySP = ifcPed.getString("ifsixty", "0");
        fsixty.setText(fsixtySP);
        String fplusSP = ifcPed.getString("ifplus", "0");
        fplus.setText(fplusSP);

    }

    public void timer(View v) {
        text1=(TextView)findViewById(R.id.ifcPedTimer);
        new CountDownTimer(300000, 1000) { // adjust the milli seconds here
            public void onTick(long millisUntilFinished) {text1.setText(""+String.format(FORMAT, TimeUnit.MILLISECONDS.toHours(millisUntilFinished), TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)), TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));}
            public void onFinish() {
                text1.setText("Time's Up");
            }
        }.start();
    }

    public void imten0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView car = (TextView) findViewById(R.id.imten);
        int cars = Integer.parseInt(car.getText().toString());
        cars = cars - 1;
        String carString = Integer.toString(cars);
        car.setText(carString);
        ifcPed.edit().putString("imten", carString).apply();
    }

    public void imten1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mten = (TextView) findViewById(R.id.imten);
        int mtens = Integer.parseInt(mten.getText().toString());
        mtens = mtens + 1;
        String mtenString = Integer.toString(mtens);
        mten.setText(mtenString);
        ifcPed.edit().putString("imten", mtenString).apply();
    }

    public void iften0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ften = (TextView) findViewById(R.id.iften);
        int ftens = Integer.parseInt(ften.getText().toString());
        ftens = ftens - 1;
        String ftenString = Integer.toString(ftens);
        ften.setText(ftenString);
        ifcPed.edit().putString("iften", ftenString).apply();
    }

    public void iften1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ften = (TextView) findViewById(R.id.iften);
        int ftens = Integer.parseInt(ften.getText().toString());
        ftens = ftens + 1;
        String ftenString = Integer.toString(ftens);
        ften.setText(ftenString);
        ifcPed.edit().putString("iften", ftenString).apply();
    }

    public void imtwenty0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mtwenty = (TextView) findViewById(R.id.imtwenty);
        int mtwentys = Integer.parseInt(mtwenty.getText().toString());
        mtwentys = mtwentys - 1;
        String mtwentyString = Integer.toString(mtwentys);
        mtwenty.setText(mtwentyString);
        ifcPed.edit().putString("imtwenty", mtwentyString).apply();
    }

    public void imtwenty1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mtwenty = (TextView) findViewById(R.id.imtwenty);
        int mtwentys = Integer.parseInt(mtwenty.getText().toString());
        mtwentys = mtwentys + 1;
        String mtwentyString = Integer.toString(mtwentys);
        mtwenty.setText(mtwentyString);
        ifcPed.edit().putString("imtwenty", mtwentyString).apply();
    }

    public void iftwenty0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ftwenty = (TextView) findViewById(R.id.iftwenty);
        int ftwentys = Integer.parseInt(ftwenty.getText().toString());
        ftwentys = ftwentys - 1;
        String ftwentyString = Integer.toString(ftwentys);
        ftwenty.setText(ftwentyString);
        ifcPed.edit().putString("iftwenty", ftwentyString).apply();
    }

    public void iftwenty1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ftwenty = (TextView) findViewById(R.id.iftwenty);
        int ftwentys = Integer.parseInt(ftwenty.getText().toString());
        ftwentys = ftwentys + 1;
        String ftwentyString = Integer.toString(ftwentys);
        ftwenty.setText(ftwentyString);
        ifcPed.edit().putString("iftwenty", ftwentyString).apply();
    }

    public void imthirty0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mthirty = (TextView) findViewById(R.id.imthirty);
        int mthirtys = Integer.parseInt(mthirty.getText().toString());
        mthirtys = mthirtys - 1;
        String mthirtyString = Integer.toString(mthirtys);
        mthirty.setText(mthirtyString);
        ifcPed.edit().putString("imthirty", mthirtyString).apply();
    }

    public void imthirty1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mthirty = (TextView) findViewById(R.id.imthirty);
        int mthirtys = Integer.parseInt(mthirty.getText().toString());
        mthirtys = mthirtys + 1;
        String mthirtyString = Integer.toString(mthirtys);
        mthirty.setText(mthirtyString);
        ifcPed.edit().putString("imthirty", mthirtyString).apply();
    }

    public void ifthirty0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fthirty = (TextView) findViewById(R.id.ifthirty);
        int fthirtys = Integer.parseInt(fthirty.getText().toString());
        fthirtys = fthirtys - 1;
        String fthirtyString = Integer.toString(fthirtys);
        fthirty.setText(fthirtyString);
        ifcPed.edit().putString("ifthirty", fthirtyString).apply();
    }

    public void ifthirty1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fthirty = (TextView) findViewById(R.id.ifthirty);
        int fthirtys = Integer.parseInt(fthirty.getText().toString());
        fthirtys = fthirtys + 1;
        String fthirtyString = Integer.toString(fthirtys);
        fthirty.setText(fthirtyString);
        ifcPed.edit().putString("ifthirty", fthirtyString).apply();
    }

    public void imforty0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mforty = (TextView) findViewById(R.id.imforty);
        int mfortys = Integer.parseInt(mforty.getText().toString());
        mfortys = mfortys - 1;
        String mfortyString = Integer.toString(mfortys);
        mforty.setText(mfortyString);
        ifcPed.edit().putString("imforty", mfortyString).apply();
    }

    public void imforty1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mforty = (TextView) findViewById(R.id.imforty);
        int mfortys = Integer.parseInt(mforty.getText().toString());
        mfortys = mfortys + 1;
        String mfortyString = Integer.toString(mfortys);
        mforty.setText(mfortyString);
        ifcPed.edit().putString("imforty", mfortyString).apply();
    }

    public void ifforty0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fforty = (TextView) findViewById(R.id.ifforty);
        int ffortys = Integer.parseInt(fforty.getText().toString());
        ffortys = ffortys - 1;
        String ffortyString = Integer.toString(ffortys);
        fforty.setText(ffortyString);
        ifcPed.edit().putString("ifforty", ffortyString).apply();
    }

    public void ifforty1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fforty = (TextView) findViewById(R.id.ifforty);
        int ffortys = Integer.parseInt(fforty.getText().toString());
        ffortys = ffortys + 1;
        String ffortyString = Integer.toString(ffortys);
        fforty.setText(ffortyString);
        ifcPed.edit().putString("ifforty", ffortyString).apply();
    }

    public void imfifty0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mfifty = (TextView) findViewById(R.id.imfifty);
        int mfiftys = Integer.parseInt(mfifty.getText().toString());
        mfiftys = mfiftys - 1;
        String mfiftyString = Integer.toString(mfiftys);
        mfifty.setText(mfiftyString);
        ifcPed.edit().putString("imfifty", mfiftyString).apply();
    }

    public void imfifty1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mfifty = (TextView) findViewById(R.id.imfifty);
        int mfiftys = Integer.parseInt(mfifty.getText().toString());
        mfiftys = mfiftys + 1;
        String mfiftyString = Integer.toString(mfiftys);
        mfifty.setText(mfiftyString);
        ifcPed.edit().putString("imfifty", mfiftyString).apply();
    }

    public void iffifty0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ffifty = (TextView) findViewById(R.id.iffifty);
        int ffiftys = Integer.parseInt(ffifty.getText().toString());
        ffiftys = ffiftys - 1;
        String ffiftyString = Integer.toString(ffiftys);
        ffifty.setText(ffiftyString);
        ifcPed.edit().putString("iffifty", ffiftyString).apply();
    }

    public void iffifty1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ffifty = (TextView) findViewById(R.id.iffifty);
        int ffiftys = Integer.parseInt(ffifty.getText().toString());
        ffiftys = ffiftys + 1;
        String ffiftyString = Integer.toString(ffiftys);
        ffifty.setText(ffiftyString);
        ifcPed.edit().putString("iffifty", ffiftyString).apply();
    }

    public void imsixty0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView msixty = (TextView) findViewById(R.id.imsixty);
        int msixtys = Integer.parseInt(msixty.getText().toString());
        msixtys = msixtys - 1;
        String msixtyString = Integer.toString(msixtys);
        msixty.setText(msixtyString);
        ifcPed.edit().putString("imsixty", msixtyString).apply();
    }

    public void imsixty1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView msixty = (TextView) findViewById(R.id.imsixty);
        int msixtys = Integer.parseInt(msixty.getText().toString());
        msixtys = msixtys + 1;
        String msixtyString = Integer.toString(msixtys);
        msixty.setText(msixtyString);
        ifcPed.edit().putString("imsixty", msixtyString).apply();
    }

    public void ifsixty0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fsixty = (TextView) findViewById(R.id.ifsixty);
        int fsixtys = Integer.parseInt(fsixty.getText().toString());
        fsixtys = fsixtys - 1;
        String fsixtyString = Integer.toString(fsixtys);
        fsixty.setText(fsixtyString);
        ifcPed.edit().putString("ifsixty", fsixtyString).apply();
    }

    public void ifsixty1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fsixty = (TextView) findViewById(R.id.ifsixty);
        int fsixtys = Integer.parseInt(fsixty.getText().toString());
        fsixtys = fsixtys + 1;
        String fsixtyString = Integer.toString(fsixtys);
        fsixty.setText(fsixtyString);
        ifcPed.edit().putString("ifsixty", fsixtyString).apply();
    }

    public void implus0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mplus = (TextView) findViewById(R.id.implus);
        int mpluss = Integer.parseInt(mplus.getText().toString());
        mpluss = mpluss - 1;
        String mplusString = Integer.toString(mpluss);
        mplus.setText(mplusString);
        ifcPed.edit().putString("implus", mplusString).apply();
    }

    public void implus1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mplus = (TextView) findViewById(R.id.implus);
        int mpluss = Integer.parseInt(mplus.getText().toString());
        mpluss = mpluss + 1;
        String mplusString = Integer.toString(mpluss);
        mplus.setText(mplusString);
        ifcPed.edit().putString("implus", mplusString).apply();
    }

    public void ifplus0(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fplus = (TextView) findViewById(R.id.ifplus);
        int fpluss = Integer.parseInt(fplus.getText().toString());
        fpluss = fpluss - 1;
        String fplusString = Integer.toString(fpluss);
        fplus.setText(fplusString);
        ifcPed.edit().putString("ifplus", fplusString).apply();
    }

    public void ifplus1(View v) {
        SharedPreferences ifcPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fplus = (TextView) findViewById(R.id.ifplus);
        int fpluss = Integer.parseInt(fplus.getText().toString());
        fpluss = fpluss + 1;
        String fplusString = Integer.toString(fpluss);
        fplus.setText(fplusString);
        ifcPed.edit().putString("ifplus", fplusString).apply();
    }

}
