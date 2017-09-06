package com.purupahuja.year7fieldtrip;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
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

import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import static android.R.attr.path;

public class MainActivity extends AppCompatActivity {

    private static Button peakButton;
    private static Button sohoButton;
    private static Button ifcButton;
    private static Button tutorialButton;
    Button writeExcelButton, readExcelButton;
    static String TAG = "ExcelLog";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peakAction();
        sohoAction();
        ifcAction();

        EditText team1 = (EditText) findViewById(R.id.team1);
        EditText team2 = (EditText) findViewById(R.id.team2);
        EditText team3 = (EditText) findViewById(R.id.team3);

        SharedPreferences main = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);

        String carSP = main.getString("team1", "");
        team1.setText(carSP);
        String bicSP = main.getString("team2", "");
        team2.setText(bicSP);
        String vanSP = main.getString("team3", "");
        team3.setText(vanSP);
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void peakAction() {
        peakButton = (Button) findViewById(R.id.peakButton);
        peakButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent peakIntent = new Intent("com.purupahuja.year7fieldtrip.Peak");
                        startActivity(peakIntent);
                    }
                }
        );
    }

    public void sohoAction() {
        sohoButton = (Button) findViewById(R.id.sohoButton);
        sohoButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent sohoIntent = new Intent("com.purupahuja.year7fieldtrip.Soho");
                        startActivity(sohoIntent);
                    }
                }
        );
    }

    public void ifcAction() {
        ifcButton = (Button) findViewById(R.id.ifcButton);
        ifcButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent ifcIntent = new Intent("com.purupahuja.year7fieldtrip.Ifc");
                        startActivity(ifcIntent);
                    }
                }
        );
    }

//    public void tutorial() {// onclick method for tutorial button
//        tutorialButton = (Button) findViewById(R.id.tutButton);// creates variable for button
//        ifcButton.setOnClickListener(// waits for click
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) { // when clicked, do the following
//                        Intent tutIntent = new Intent("com.purupahuja.year7fieldtrip.Tutorial"); // creates intent for going to tutorial page
//                        startActivity(tutIntent); // go to tutorial page
//                    }
//                }
//        );
//    }

    public void names(View v) { // creates a public method called 'names' which is activated when the 'Save' button is clicked
        SharedPreferences main = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE); // allows access the application's SharedPreferences
        EditText team1 = (EditText) findViewById(R.id.team1); // declaring an EditText variable for the first team member's text field
        EditText team2 = (EditText) findViewById(R.id.team2); // declaring an EditText variable for the second team member's text field
        EditText team3 = (EditText) findViewById(R.id.team3); // declaring an EditText variable for the third team member's text field
        String member1 = team1.getText().toString(); // gets the text from the first EditText field and stores the String in a variable
        String member2 = team2.getText().toString(); // gets the text from the second EditText field and stores the String in a variable
        String member3 = team3.getText().toString(); // gets the text from the third EditText field and stores the String in a variable

        if (member1.trim().length() == 0 || member2.trim().length() == 0 || member3.trim().length() == 0) { // if statement to check if the length of any (||) of three EditText fields is zero
            Toast.makeText(getApplicationContext(), "Please enter all the team members' names before continuing.", Toast.LENGTH_LONG).show(); // creates a Toast error message for 'long' length of time
        }
        else {
            main.edit().putString("team1", member1).apply(); // puts the corresponding value of the "team1" key to the String variable of the first member's name from the corresponding EditText field
            main.edit().putString("team2", member2).apply();// puts the corresponding value of the "team2" key to the String variable of the second member's name from the corresponding EditText field
            main.edit().putString("team3", member3).apply();// puts the corresponding value of the "team3" key to the String variable of the third member's name from the corresponding EditText field
            Toast.makeText(getApplicationContext(), "Click on a location and continue.", Toast.LENGTH_SHORT).show(); // creates a Toast instruction message for 'short' length of time
        }
    }



    public void resetData(View v) {
        //create SharedPreferences variable
        SharedPreferences main = getSharedPreferences("com.purupahuja.year7fieldtrip", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = main.edit(); // creates editor variable to edit SHaredPreferences
        EditText team1 = (EditText) findViewById(R.id.team1); // declaring an EditText variable for the first team member's text field
        EditText team2 = (EditText) findViewById(R.id.team2); // declaring an EditText variable for the second team member's text field
        EditText team3 = (EditText) findViewById(R.id.team3); // declaring an EditText variable for the third team member's text field
        team1.setText("");
        team2.setText("");
        team3.setText("");
        editor.clear(); // clears all saved data in SharedPreferences
        editor.commit(); // confirms the above edit (clearing data)
    }

    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
