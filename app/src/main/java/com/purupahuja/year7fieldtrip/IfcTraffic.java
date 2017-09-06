package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import jxl.WorkbookSettings;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import static android.R.attr.path;

public class IfcTraffic extends AppCompatActivity {
    TextView text1;
    private static final String FORMAT = "%02d:%02d:%02d";
    int seconds , minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifc_traffic);
        TextView van = (TextView) findViewById(R.id.ivan);
        TextView bus = (TextView) findViewById(R.id.ibus);
        TextView taxi = (TextView) findViewById(R.id.itaxi);
        TextView car = (TextView) findViewById(R.id.icar);
        TextView bic = (TextView) findViewById(R.id.ibic);
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        String carSP = sohoTraffic.getString("icars", "0");
        car.setText(carSP);
        String bicSP = sohoTraffic.getString("ibics", "0");
        bic.setText(bicSP);
        String vanSP = sohoTraffic.getString("ivans", "0");
        van.setText(vanSP);
        String busSP = sohoTraffic.getString("ibuses", "0");
        bus.setText(busSP);
        String taxiSP = sohoTraffic.getString("itaxis", "0");
        taxi.setText(taxiSP);
    }

    public void timer(View v) {
        text1=(TextView)findViewById(R.id.textView1);
        new CountDownTimer(300000, 1000) { // adjust the milli seconds here
            public void onTick(long millisUntilFinished) {text1.setText(""+String.format(FORMAT, TimeUnit.MILLISECONDS.toHours(millisUntilFinished), TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)), TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));}
            public void onFinish() {
                text1.setText("Time's Up");
            }
        }.start();
    }

    public void icar0(View v) {
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView car = (TextView) findViewById(R.id.icar);
        int cars = Integer.parseInt(car.getText().toString());
        cars = cars - 1;
        String carString = Integer.toString(cars);
        car.setText(carString);
        sohoTraffic.edit().putString("icars", carString).apply();
    }

    public void icar1(View v) {
        TextView car = (TextView) findViewById(R.id.icar);
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        int cars = Integer.parseInt(car.getText().toString());
        cars = cars + 1;
        String carString = Integer.toString(cars);
        car.setText(carString);
        sohoTraffic.edit().putString("icars", carString).apply();
    }

    public void ibic0(View v) {
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView bic = (TextView) findViewById(R.id.ibic);
        int bics = Integer.parseInt(bic.getText().toString());
        bics = bics - 1;
        String bicString = Integer.toString(bics);
        bic.setText(bicString);
        sohoTraffic.edit().putString("ibics", bicString).apply();
    }

    public void ibic1(View v) {
        TextView bic = (TextView) findViewById(R.id.ibic);
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        int bics = Integer.parseInt(bic.getText().toString());
        bics = bics + 1;
        String bicString = Integer.toString(bics);
        bic.setText(bicString);
        sohoTraffic.edit().putString("ibics", bicString).apply();
    }

    public void ivan0(View v) {
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView van = (TextView) findViewById(R.id.ivan);
        int vans = Integer.parseInt(van.getText().toString());
        vans = vans - 1;
        String vanString = Integer.toString(vans);
        van.setText(vanString);
        sohoTraffic.edit().putString("ivans", vanString).apply();
    }

    public void ivan1(View v) {
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView van = (TextView) findViewById(R.id.ivan);
        int vans = Integer.parseInt(van.getText().toString());
        vans = vans + 1;
        String vanString = Integer.toString(vans);
        van.setText(vanString);
        sohoTraffic.edit().putString("ivans", vanString).apply();
    }

    public void ibus0(View v) {
        TextView bus = (TextView) findViewById(R.id.ibus);
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        int buses = Integer.parseInt(bus.getText().toString());
        buses = buses - 1;
        String busString = Integer.toString(buses);
        bus.setText(busString);
        sohoTraffic.edit().putString("ibuses", busString).apply();
    }
    public void ibus1(View v) {
        TextView bus = (TextView) findViewById(R.id.ibus);
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        int buses = Integer.parseInt(bus.getText().toString());
        buses = buses + 1;
        String busString = Integer.toString(buses);
        bus.setText(busString);
        sohoTraffic.edit().putString("ibuses", busString).apply();
    }

    public void itaxi0(View v) {
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        TextView taxi = (TextView) findViewById(R.id.itaxi);
        int taxis = Integer.parseInt(taxi.getText().toString());
        taxis = taxis - 1;
        String taxiString = Integer.toString(taxis);
        taxi.setText(taxiString);
        sohoTraffic.edit().putString("itaxis", taxiString).apply();
    }

    public void itaxi1(View v) {
        TextView taxi = (TextView) findViewById(R.id.itaxi);
        SharedPreferences sohoTraffic = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        int taxis = Integer.parseInt(taxi.getText().toString());
        taxis = taxis + 1;
        String taxiString = Integer.toString(taxis);
        taxi.setText(taxiString);
        sohoTraffic.edit().putString("itaxis", taxiString).apply();
    }
}