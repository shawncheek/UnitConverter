package com.homework.unitconverter;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

public class ConvertLengthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_length);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Drawable background = getResources().getDrawable(R.drawable.rulers);
        background.setAlpha(50);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //populate spinners from array in string resource
        Spinner fromSpinner = findViewById(R.id.spinnerLengthFrom);
        Spinner toSpinner = findViewById(R.id.spinnerLengthTo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.lengthUnits, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);
        toSpinner.setSelection(1);

        //execute conversion on button click
        Button convertLength = findViewById(R.id.buttonDoLengthConversion);
        convertLength.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            convert(v);
        }});
    }

    public void convert(View v){
        //get selections from spinners and input box, validate units
        Spinner fromSpinner = findViewById(R.id.spinnerLengthFrom);
        Spinner toSpinner = findViewById(R.id.spinnerLengthTo);
        EditText inputText = findViewById(R.id.lengthInput);

        String fromString = fromSpinner.getSelectedItem().toString();
        String toString = toSpinner.getSelectedItem().toString();

        Unit fromUnit = Unit.verify(fromString);
        Unit toUnit = Unit.verify(toString);

        if(inputText.getText().toString().matches("")){
            TextView output = findViewById(R.id.textLengthConvertResult);
            String textOutput = "Please enter a value to convert.";
            output.setText(textOutput);
            output.setTextColor(Color.RED);
            output.setVisibility(View.VISIBLE);
        }
        else if(fromUnit == toUnit){
            TextView output = findViewById(R.id.textLengthConvertResult);
            String textOutput = "Please specify two different units to convert.";
            output.setText(textOutput);
            output.setTextColor(Color.RED);
            output.setVisibility(View.VISIBLE);
        }
        else {
            //convert and display result
            double input = Double.valueOf(inputText.getText().toString());
            LengthConverter converter = new LengthConverter(fromUnit, toUnit);
            double result = converter.convert(input);
            TextView output = findViewById(R.id.textLengthConvertResult);
            String textOutput = input + " " + fromString + " =\n" + String.format(Locale.ENGLISH, "%.2f", result) + " " + toString;
            output.setText(textOutput);
            output.setTextColor(Color.BLACK);
            output.setVisibility(View.VISIBLE);
        }
    }

}
