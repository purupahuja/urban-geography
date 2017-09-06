package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class PeakPed extends AppCompatActivity {

    TextView text1;
    private static final String FORMAT = "%02d:%02d:%02d";
    int seconds , minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peak_ped);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView mten = (TextView) findViewById(R.id.mten);
        TextView mtwenty = (TextView) findViewById(R.id.mtwenty);
        TextView mthirty = (TextView) findViewById(R.id.mthirty);
        TextView mforty = (TextView) findViewById(R.id.mforty);
        TextView mfifty = (TextView) findViewById(R.id.mfifty);
        TextView msixty = (TextView) findViewById(R.id.msixty);
        TextView mplus = (TextView) findViewById(R.id.mplus);
        TextView ften = (TextView) findViewById(R.id.ften);
        TextView ftwenty = (TextView) findViewById(R.id.ftwenty);
        TextView fthirty = (TextView) findViewById(R.id.fthirty);
        TextView fforty = (TextView) findViewById(R.id.fforty);
        TextView ffifty = (TextView) findViewById(R.id.ffifty);
        TextView fsixty = (TextView) findViewById(R.id.fsixty);
        TextView fplus = (TextView) findViewById(R.id.fplus);

        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);

        String mtenSP = peakPed.getString("mten", "0");
        mten.setText(mtenSP);
        String mtwentySP = peakPed.getString("mtwenty", "0");
        mtwenty.setText(mtwentySP);
        String mthirtySP = peakPed.getString("mthirty", "0");
        mthirty.setText(mthirtySP);
        String mfortySP = peakPed.getString("mforty", "0");
        mforty.setText(mfortySP);
        String mfiftySP = peakPed.getString("mfifty", "0");
        mfifty.setText(mfiftySP);
        String msixtySP = peakPed.getString("msixty", "0");
        msixty.setText(msixtySP);
        String mplusSP = peakPed.getString("mplus", "0");
        mplus.setText(mplusSP);

        String ftenSP = peakPed.getString("ften", "0");
        ften.setText(ftenSP);
        String ftwentySP = peakPed.getString("ftwenty", "0");
        ftwenty.setText(ftwentySP);
        String fthirtySP = peakPed.getString("fthirty", "0");
        fthirty.setText(fthirtySP);
        String ffortySP = peakPed.getString("fforty", "0");
        fforty.setText(ffortySP);
        String ffiftySP = peakPed.getString("ffifty", "0");
        ffifty.setText(ffiftySP);
        String fsixtySP = peakPed.getString("fsixty", "0");
        fsixty.setText(fsixtySP);
        String fplusSP = peakPed.getString("fplus", "0");
        fplus.setText(fplusSP);

    }

    public void timer(View v) {
        text1=(TextView)findViewById(R.id.peakPedTimer);
        new CountDownTimer(300000, 1000) { // adjust the milli seconds here
            public void onTick(long millisUntilFinished) {text1.setText(""+String.format(FORMAT, TimeUnit.MILLISECONDS.toHours(millisUntilFinished), TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)), TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));}
            public void onFinish() {
                text1.setText("Time's Up");
            }
        }.start();
    }

    public void mten0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView car = (TextView) findViewById(R.id.mten);
        int cars = Integer.parseInt(car.getText().toString());
        cars = cars - 1;
        String carString = Integer.toString(cars);
        car.setText(carString);
        peakPed.edit().putString("mten", carString).apply();
    }

    public void mten1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mten = (TextView) findViewById(R.id.mten);
        int mtens = Integer.parseInt(mten.getText().toString());
        mtens = mtens + 1;
        String mtenString = Integer.toString(mtens);
        mten.setText(mtenString);
        peakPed.edit().putString("mten", mtenString).apply();
    }

    public void ften0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ften = (TextView) findViewById(R.id.ften);
        int ftens = Integer.parseInt(ften.getText().toString());
        ftens = ftens - 1;
        String ftenString = Integer.toString(ftens);
        ften.setText(ftenString);
        peakPed.edit().putString("ften", ftenString).apply();
    }

    public void ften1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ften = (TextView) findViewById(R.id.ften);
        int ftens = Integer.parseInt(ften.getText().toString());
        ftens = ftens + 1;
        String ftenString = Integer.toString(ftens);
        ften.setText(ftenString);
        peakPed.edit().putString("ften", ftenString).apply();
    }

    public void mtwenty0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mtwenty = (TextView) findViewById(R.id.mtwenty);
        int mtwentys = Integer.parseInt(mtwenty.getText().toString());
        mtwentys = mtwentys - 1;
        String mtwentyString = Integer.toString(mtwentys);
        mtwenty.setText(mtwentyString);
        peakPed.edit().putString("mtwenty", mtwentyString).apply();
    }

    public void mtwenty1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mtwenty = (TextView) findViewById(R.id.mtwenty);
        int mtwentys = Integer.parseInt(mtwenty.getText().toString());
        mtwentys = mtwentys + 1;
        String mtwentyString = Integer.toString(mtwentys);
        mtwenty.setText(mtwentyString);
        peakPed.edit().putString("mtwenty", mtwentyString).apply();
    }

    public void ftwenty0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ftwenty = (TextView) findViewById(R.id.ftwenty);
        int ftwentys = Integer.parseInt(ftwenty.getText().toString());
        ftwentys = ftwentys - 1;
        String ftwentyString = Integer.toString(ftwentys);
        ftwenty.setText(ftwentyString);
        peakPed.edit().putString("ftwenty", ftwentyString).apply();
    }

    public void ftwenty1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ftwenty = (TextView) findViewById(R.id.ftwenty);
        int ftwentys = Integer.parseInt(ftwenty.getText().toString());
        ftwentys = ftwentys + 1;
        String ftwentyString = Integer.toString(ftwentys);
        ftwenty.setText(ftwentyString);
        peakPed.edit().putString("ftwenty", ftwentyString).apply();
    }

    public void mthirty0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mthirty = (TextView) findViewById(R.id.mthirty);
        int mthirtys = Integer.parseInt(mthirty.getText().toString());
        mthirtys = mthirtys - 1;
        String mthirtyString = Integer.toString(mthirtys);
        mthirty.setText(mthirtyString);
        peakPed.edit().putString("mthirty", mthirtyString).apply();
    }

    public void mthirty1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mthirty = (TextView) findViewById(R.id.mthirty);
        int mthirtys = Integer.parseInt(mthirty.getText().toString());
        mthirtys = mthirtys + 1;
        String mthirtyString = Integer.toString(mthirtys);
        mthirty.setText(mthirtyString);
        peakPed.edit().putString("mthirty", mthirtyString).apply();
    }

    public void fthirty0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fthirty = (TextView) findViewById(R.id.fthirty);
        int fthirtys = Integer.parseInt(fthirty.getText().toString());
        fthirtys = fthirtys - 1;
        String fthirtyString = Integer.toString(fthirtys);
        fthirty.setText(fthirtyString);
        peakPed.edit().putString("fthirty", fthirtyString).apply();
    }

    public void fthirty1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fthirty = (TextView) findViewById(R.id.fthirty);
        int fthirtys = Integer.parseInt(fthirty.getText().toString());
        fthirtys = fthirtys + 1;
        String fthirtyString = Integer.toString(fthirtys);
        fthirty.setText(fthirtyString);
        peakPed.edit().putString("fthirty", fthirtyString).apply();
    }

    public void mforty0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mforty = (TextView) findViewById(R.id.mforty);
        int mfortys = Integer.parseInt(mforty.getText().toString());
        mfortys = mfortys - 1;
        String mfortyString = Integer.toString(mfortys);
        mforty.setText(mfortyString);
        peakPed.edit().putString("mforty", mfortyString).apply();
    }

    public void mforty1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mforty = (TextView) findViewById(R.id.mforty);
        int mfortys = Integer.parseInt(mforty.getText().toString());
        mfortys = mfortys + 1;
        String mfortyString = Integer.toString(mfortys);
        mforty.setText(mfortyString);
        peakPed.edit().putString("mforty", mfortyString).apply();
    }

    public void fforty0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fforty = (TextView) findViewById(R.id.fforty);
        int ffortys = Integer.parseInt(fforty.getText().toString());
        ffortys = ffortys - 1;
        String ffortyString = Integer.toString(ffortys);
        fforty.setText(ffortyString);
        peakPed.edit().putString("fforty", ffortyString).apply();
    }

    public void fforty1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fforty = (TextView) findViewById(R.id.fforty);
        int ffortys = Integer.parseInt(fforty.getText().toString());
        ffortys = ffortys + 1;
        String ffortyString = Integer.toString(ffortys);
        fforty.setText(ffortyString);
        peakPed.edit().putString("fforty", ffortyString).apply();
    }

    public void mfifty0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mfifty = (TextView) findViewById(R.id.mfifty);
        int mfiftys = Integer.parseInt(mfifty.getText().toString());
        mfiftys = mfiftys - 1;
        String mfiftyString = Integer.toString(mfiftys);
        mfifty.setText(mfiftyString);
        peakPed.edit().putString("mfifty", mfiftyString).apply();
    }

    public void mfifty1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mfifty = (TextView) findViewById(R.id.mfifty);
        int mfiftys = Integer.parseInt(mfifty.getText().toString());
        mfiftys = mfiftys + 1;
        String mfiftyString = Integer.toString(mfiftys);
        mfifty.setText(mfiftyString);
        peakPed.edit().putString("mfifty", mfiftyString).apply();
    }

    public void ffifty0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ffifty = (TextView) findViewById(R.id.ffifty);
        int ffiftys = Integer.parseInt(ffifty.getText().toString());
        ffiftys = ffiftys - 1;
        String ffiftyString = Integer.toString(ffiftys);
        ffifty.setText(ffiftyString);
        peakPed.edit().putString("ffifty", ffiftyString).apply();
    }

    public void ffifty1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ffifty = (TextView) findViewById(R.id.ffifty);
        int ffiftys = Integer.parseInt(ffifty.getText().toString());
        ffiftys = ffiftys + 1;
        String ffiftyString = Integer.toString(ffiftys);
        ffifty.setText(ffiftyString);
        peakPed.edit().putString("ffifty", ffiftyString).apply();
    }

    public void msixty0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView msixty = (TextView) findViewById(R.id.msixty);
        int msixtys = Integer.parseInt(msixty.getText().toString());
        msixtys = msixtys - 1;
        String msixtyString = Integer.toString(msixtys);
        msixty.setText(msixtyString);
        peakPed.edit().putString("msixty", msixtyString).apply();
    }

    public void msixty1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView msixty = (TextView) findViewById(R.id.msixty);
        int msixtys = Integer.parseInt(msixty.getText().toString());
        msixtys = msixtys + 1;
        String msixtyString = Integer.toString(msixtys);
        msixty.setText(msixtyString);
        peakPed.edit().putString("msixty", msixtyString).apply();
    }

    public void fsixty0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fsixty = (TextView) findViewById(R.id.fsixty);
        int fsixtys = Integer.parseInt(fsixty.getText().toString());
        fsixtys = fsixtys - 1;
        String fsixtyString = Integer.toString(fsixtys);
        fsixty.setText(fsixtyString);
        peakPed.edit().putString("fsixty", fsixtyString).apply();
    }

    public void fsixty1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fsixty = (TextView) findViewById(R.id.fsixty);
        int fsixtys = Integer.parseInt(fsixty.getText().toString());
        fsixtys = fsixtys + 1;
        String fsixtyString = Integer.toString(fsixtys);
        fsixty.setText(fsixtyString);
        peakPed.edit().putString("fsixty", fsixtyString).apply();
    }

    public void mplus0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mplus = (TextView) findViewById(R.id.mplus);
        int mpluss = Integer.parseInt(mplus.getText().toString());
        mpluss = mpluss - 1;
        String mplusString = Integer.toString(mpluss);
        mplus.setText(mplusString);
        peakPed.edit().putString("mplus", mplusString).apply();
    }

    public void mplus1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mplus = (TextView) findViewById(R.id.mplus);
        int mpluss = Integer.parseInt(mplus.getText().toString());
        mpluss = mpluss + 1;
        String mplusString = Integer.toString(mpluss);
        mplus.setText(mplusString);
        peakPed.edit().putString("mplus", mplusString).apply();
    }

    public void fplus0(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fplus = (TextView) findViewById(R.id.fplus);
        int fpluss = Integer.parseInt(fplus.getText().toString());
        fpluss = fpluss - 1;
        String fplusString = Integer.toString(fpluss);
        fplus.setText(fplusString);
        peakPed.edit().putString("fplus", fplusString).apply();
    }

    public void fplus1(View v) {
        SharedPreferences peakPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fplus = (TextView) findViewById(R.id.fplus);
        int fpluss = Integer.parseInt(fplus.getText().toString());
        fpluss = fpluss + 1;
        String fplusString = Integer.toString(fpluss);
        fplus.setText(fplusString);
        peakPed.edit().putString("fplus", fplusString).apply();
    }

}
