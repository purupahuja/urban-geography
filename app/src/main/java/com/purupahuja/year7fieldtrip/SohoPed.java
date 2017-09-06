package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class SohoPed extends AppCompatActivity {

    TextView text1;
    private static final String FORMAT = "%02d:%02d:%02d";
    int seconds , minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soho_ped);
        TextView mten = (TextView) findViewById(R.id.somten);
        TextView mtwenty = (TextView) findViewById(R.id.somtwenty);
        TextView mthirty = (TextView) findViewById(R.id.somthirty);
        TextView mforty = (TextView) findViewById(R.id.somforty);
        TextView mfifty = (TextView) findViewById(R.id.somfifty);
        TextView msixty = (TextView) findViewById(R.id.somsixty);
        TextView mplus = (TextView) findViewById(R.id.somplus);
        TextView ften = (TextView) findViewById(R.id.soften);
        TextView ftwenty = (TextView) findViewById(R.id.softwenty);
        TextView fthirty = (TextView) findViewById(R.id.softhirty);
        TextView fforty = (TextView) findViewById(R.id.sofforty);
        TextView ffifty = (TextView) findViewById(R.id.soffifty);
        TextView fsixty = (TextView) findViewById(R.id.sofsixty);
        TextView fplus = (TextView) findViewById(R.id.sofplus);

        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);

        String mtenSP = sohoPed.getString("somten", "0");
        mten.setText(mtenSP);
        String mtwentySP = sohoPed.getString("somtwenty", "0");
        mtwenty.setText(mtwentySP);
        String mthirtySP = sohoPed.getString("somthirty", "0");
        mthirty.setText(mthirtySP);
        String mfortySP = sohoPed.getString("somforty", "0");
        mforty.setText(mfortySP);
        String mfiftySP = sohoPed.getString("somfifty", "0");
        mfifty.setText(mfiftySP);
        String msixtySP = sohoPed.getString("somsixty", "0");
        msixty.setText(msixtySP);
        String mplusSP = sohoPed.getString("somplus", "0");
        mplus.setText(mplusSP);

        String ftenSP = sohoPed.getString("soften", "0");
        ften.setText(ftenSP);
        String ftwentySP = sohoPed.getString("softwenty", "0");
        ftwenty.setText(ftwentySP);
        String fthirtySP = sohoPed.getString("softhirty", "0");
        fthirty.setText(fthirtySP);
        String ffortySP = sohoPed.getString("sofforty", "0");
        fforty.setText(ffortySP);
        String ffiftySP = sohoPed.getString("soffifty", "0");
        ffifty.setText(ffiftySP);
        String fsixtySP = sohoPed.getString("sofsixty", "0");
        fsixty.setText(fsixtySP);
        String fplusSP = sohoPed.getString("sofplus", "0");
        fplus.setText(fplusSP);

    }

    public void timer(View v) {
        text1=(TextView)findViewById(R.id.sohoPedTimer);
        new CountDownTimer(300000, 1000) { // adjust the milli seconds here
            public void onTick(long millisUntilFinished) {text1.setText(""+String.format(FORMAT, TimeUnit.MILLISECONDS.toHours(millisUntilFinished), TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)), TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));}
            public void onFinish() {
                text1.setText("Time's Up");
            }
        }.start();
    }

    public void somten0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView car = (TextView) findViewById(R.id.somten);
        int cars = Integer.parseInt(car.getText().toString());
        cars = cars - 1;
        String carString = Integer.toString(cars);
        car.setText(carString);
        sohoPed.edit().putString("somten", carString).apply();
    }

    public void somten1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mten = (TextView) findViewById(R.id.somten);
        int mtens = Integer.parseInt(mten.getText().toString());
        mtens = mtens + 1;
        String mtenString = Integer.toString(mtens);
        mten.setText(mtenString);
        sohoPed.edit().putString("somten", mtenString).apply();
    }

    public void soften0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ften = (TextView) findViewById(R.id.soften);
        int ftens = Integer.parseInt(ften.getText().toString());
        ftens = ftens - 1;
        String ftenString = Integer.toString(ftens);
        ften.setText(ftenString);
        sohoPed.edit().putString("soften", ftenString).apply();
    }

    public void soften1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ften = (TextView) findViewById(R.id.soften);
        int ftens = Integer.parseInt(ften.getText().toString());
        ftens = ftens + 1;
        String ftenString = Integer.toString(ftens);
        ften.setText(ftenString);
        sohoPed.edit().putString("soften", ftenString).apply();
    }

    public void somtwenty0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mtwenty = (TextView) findViewById(R.id.somtwenty);
        int mtwentys = Integer.parseInt(mtwenty.getText().toString());
        mtwentys = mtwentys - 1;
        String mtwentyString = Integer.toString(mtwentys);
        mtwenty.setText(mtwentyString);
        sohoPed.edit().putString("somtwenty", mtwentyString).apply();
    }

    public void somtwenty1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mtwenty = (TextView) findViewById(R.id.somtwenty);
        int mtwentys = Integer.parseInt(mtwenty.getText().toString());
        mtwentys = mtwentys + 1;
        String mtwentyString = Integer.toString(mtwentys);
        mtwenty.setText(mtwentyString);
        sohoPed.edit().putString("somtwenty", mtwentyString).apply();
    }

    public void softwenty0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ftwenty = (TextView) findViewById(R.id.softwenty);
        int ftwentys = Integer.parseInt(ftwenty.getText().toString());
        ftwentys = ftwentys - 1;
        String ftwentyString = Integer.toString(ftwentys);
        ftwenty.setText(ftwentyString);
        sohoPed.edit().putString("softwenty", ftwentyString).apply();
    }

    public void softwenty1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ftwenty = (TextView) findViewById(R.id.softwenty);
        int ftwentys = Integer.parseInt(ftwenty.getText().toString());
        ftwentys = ftwentys + 1;
        String ftwentyString = Integer.toString(ftwentys);
        ftwenty.setText(ftwentyString);
        sohoPed.edit().putString("softwenty", ftwentyString).apply();
    }

    public void somthirty0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mthirty = (TextView) findViewById(R.id.somthirty);
        int mthirtys = Integer.parseInt(mthirty.getText().toString());
        mthirtys = mthirtys - 1;
        String mthirtyString = Integer.toString(mthirtys);
        mthirty.setText(mthirtyString);
        sohoPed.edit().putString("somthirty", mthirtyString).apply();
    }

    public void somthirty1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mthirty = (TextView) findViewById(R.id.somthirty);
        int mthirtys = Integer.parseInt(mthirty.getText().toString());
        mthirtys = mthirtys + 1;
        String mthirtyString = Integer.toString(mthirtys);
        mthirty.setText(mthirtyString);
        sohoPed.edit().putString("somthirty", mthirtyString).apply();
    }

    public void softhirty0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fthirty = (TextView) findViewById(R.id.softhirty);
        int fthirtys = Integer.parseInt(fthirty.getText().toString());
        fthirtys = fthirtys - 1;
        String fthirtyString = Integer.toString(fthirtys);
        fthirty.setText(fthirtyString);
        sohoPed.edit().putString("softhirty", fthirtyString).apply();
    }

    public void softhirty1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fthirty = (TextView) findViewById(R.id.softhirty);
        int fthirtys = Integer.parseInt(fthirty.getText().toString());
        fthirtys = fthirtys + 1;
        String fthirtyString = Integer.toString(fthirtys);
        fthirty.setText(fthirtyString);
        sohoPed.edit().putString("softhirty", fthirtyString).apply();
    }

    public void somforty0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mforty = (TextView) findViewById(R.id.somforty);
        int mfortys = Integer.parseInt(mforty.getText().toString());
        mfortys = mfortys - 1;
        String mfortyString = Integer.toString(mfortys);
        mforty.setText(mfortyString);
        sohoPed.edit().putString("somforty", mfortyString).apply();
    }

    public void somforty1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mforty = (TextView) findViewById(R.id.somforty);
        int mfortys = Integer.parseInt(mforty.getText().toString());
        mfortys = mfortys + 1;
        String mfortyString = Integer.toString(mfortys);
        mforty.setText(mfortyString);
        sohoPed.edit().putString("somforty", mfortyString).apply();
    }

    public void sofforty0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fforty = (TextView) findViewById(R.id.sofforty);
        int ffortys = Integer.parseInt(fforty.getText().toString());
        ffortys = ffortys - 1;
        String ffortyString = Integer.toString(ffortys);
        fforty.setText(ffortyString);
        sohoPed.edit().putString("sofforty", ffortyString).apply();
    }

    public void sofforty1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fforty = (TextView) findViewById(R.id.sofforty);
        int ffortys = Integer.parseInt(fforty.getText().toString());
        ffortys = ffortys + 1;
        String ffortyString = Integer.toString(ffortys);
        fforty.setText(ffortyString);
        sohoPed.edit().putString("sofforty", ffortyString).apply();
    }

    public void somfifty0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mfifty = (TextView) findViewById(R.id.somfifty);
        int mfiftys = Integer.parseInt(mfifty.getText().toString());
        mfiftys = mfiftys - 1;
        String mfiftyString = Integer.toString(mfiftys);
        mfifty.setText(mfiftyString);
        sohoPed.edit().putString("somfifty", mfiftyString).apply();
    }

    public void somfifty1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mfifty = (TextView) findViewById(R.id.somfifty);
        int mfiftys = Integer.parseInt(mfifty.getText().toString());
        mfiftys = mfiftys + 1;
        String mfiftyString = Integer.toString(mfiftys);
        mfifty.setText(mfiftyString);
        sohoPed.edit().putString("somfifty", mfiftyString).apply();
    }

    public void soffifty0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ffifty = (TextView) findViewById(R.id.soffifty);
        int ffiftys = Integer.parseInt(ffifty.getText().toString());
        ffiftys = ffiftys - 1;
        String ffiftyString = Integer.toString(ffiftys);
        ffifty.setText(ffiftyString);
        sohoPed.edit().putString("soffifty", ffiftyString).apply();
    }

    public void soffifty1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView ffifty = (TextView) findViewById(R.id.soffifty);
        int ffiftys = Integer.parseInt(ffifty.getText().toString());
        ffiftys = ffiftys + 1;
        String ffiftyString = Integer.toString(ffiftys);
        ffifty.setText(ffiftyString);
        sohoPed.edit().putString("soffifty", ffiftyString).apply();
    }

    public void somsixty0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView msixty = (TextView) findViewById(R.id.somsixty);
        int msixtys = Integer.parseInt(msixty.getText().toString());
        msixtys = msixtys - 1;
        String msixtyString = Integer.toString(msixtys);
        msixty.setText(msixtyString);
        sohoPed.edit().putString("somsixty", msixtyString).apply();
    }

    public void somsixty1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView msixty = (TextView) findViewById(R.id.somsixty);
        int msixtys = Integer.parseInt(msixty.getText().toString());
        msixtys = msixtys + 1;
        String msixtyString = Integer.toString(msixtys);
        msixty.setText(msixtyString);
        sohoPed.edit().putString("somsixty", msixtyString).apply();
    }

    public void sofsixty0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fsixty = (TextView) findViewById(R.id.sofsixty);
        int fsixtys = Integer.parseInt(fsixty.getText().toString());
        fsixtys = fsixtys - 1;
        String fsixtyString = Integer.toString(fsixtys);
        fsixty.setText(fsixtyString);
        sohoPed.edit().putString("sofsixty", fsixtyString).apply();
    }

    public void sofsixty1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fsixty = (TextView) findViewById(R.id.sofsixty);
        int fsixtys = Integer.parseInt(fsixty.getText().toString());
        fsixtys = fsixtys + 1;
        String fsixtyString = Integer.toString(fsixtys);
        fsixty.setText(fsixtyString);
        sohoPed.edit().putString("sofsixty", fsixtyString).apply();
    }

    public void somplus0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mplus = (TextView) findViewById(R.id.somplus);
        int mpluss = Integer.parseInt(mplus.getText().toString());
        mpluss = mpluss - 1;
        String mplusString = Integer.toString(mpluss);
        mplus.setText(mplusString);
        sohoPed.edit().putString("somplus", mplusString).apply();
    }

    public void somplus1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView mplus = (TextView) findViewById(R.id.somplus);
        int mpluss = Integer.parseInt(mplus.getText().toString());
        mpluss = mpluss + 1;
        String mplusString = Integer.toString(mpluss);
        mplus.setText(mplusString);
        sohoPed.edit().putString("somplus", mplusString).apply();
    }

    public void sofplus0(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fplus = (TextView) findViewById(R.id.sofplus);
        int fpluss = Integer.parseInt(fplus.getText().toString());
        fpluss = fpluss - 1;
        String fplusString = Integer.toString(fpluss);
        fplus.setText(fplusString);
        sohoPed.edit().putString("sofplus", fplusString).apply();
    }

    public void sofplus1(View v) {
        SharedPreferences sohoPed = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView fplus = (TextView) findViewById(R.id.sofplus);
        int fpluss = Integer.parseInt(fplus.getText().toString());
        fpluss = fpluss + 1;
        String fplusString = Integer.toString(fpluss);
        fplus.setText(fplusString);
        sohoPed.edit().putString("sofplus", fplusString).apply();
    }

}
