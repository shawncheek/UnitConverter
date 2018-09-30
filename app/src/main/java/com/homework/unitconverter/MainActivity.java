package com.homework.unitconverter;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLength = findViewById(R.id.buttonConvertLength);
        buttonLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConvertLength();
            }
        });

        Button buttonVolume = findViewById(R.id.buttonConvertVolume);
        buttonVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConvertVolume();
            }
        });

        Button buttonTemp = findViewById(R.id.buttonConvertTemp);
        buttonTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConvertTemp();
            }
        });

        Button buttonQuiz = findViewById(R.id.buttonPlayQuiz);
        buttonQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuiz();
            }
        });

        FloatingActionButton helpButton = findViewById(R.id.floatingActionButton);
        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayHelp();
            }
        });
    }

    public void openConvertLength(){
        Intent intent = new Intent(this, ConvertLengthActivity.class);
        startActivity(intent);
    }

    public void openConvertVolume(){
        Intent intent = new Intent(this, ConvertVolumeActivity.class);
        startActivity(intent);
    }

    public void openConvertTemp(){
        Intent intent = new Intent(this, ConvertTempActivity.class);
        startActivity(intent);
    }

    public void openQuiz(){
        Intent intent = new Intent(this, PlayQuizActivity.class);
        startActivity(intent);
    }

    public void displayHelp(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setCancelable(true);
        builder.setTitle("Help");
        builder.setMessage("Welcome to the Unit Converter!\n" +
                "\n" + "Select \"Convert Length\" to convert between US and Metric units of measurement for length.\n" +
                "\n" + "Select \"Convert Volume\"  to convert between US and Metric units of measurement for volume.\n" +
                "\n" + "Select \"Convert Temperature\" to convert between Fahrenheit, Celsius, and Kelvin.\n" +
                "\n" + "Select \"Play Quiz\" to test your knowledge of conversion factors.");

        builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
