package com.homework.unitconverter;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PlayQuizActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_quiz);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //create quiz questions and answers
        Unit lenFrom = Unit.YARD;
        Unit lenTo = Unit.INCH;
        Unit volFrom = Unit.GALLON;
        Unit volTo = Unit.OUNCE;
        Unit tempFrom = Unit.CELSIUS;
        Unit tempTo = Unit.FAHRENHEIT;
        LengthConverter len = new LengthConverter(lenFrom, lenTo);
        VolumeConverter vol = new VolumeConverter(volFrom, volTo);
        TempConverter temp = new TempConverter(tempFrom, tempTo);
        final Double lenAns = Double.valueOf(len.getMultiplier());
        final Double volAns = Double.valueOf(vol.getMultiplier());
        final Double tempAns = Double.valueOf(temp.getMultiplier());
        Button q1 = findViewById(R.id.submitQ1);
        Button q2 = findViewById(R.id.submitQ2);
        Button q3 = findViewById(R.id.submitQ3);
        final EditText ans1 = findViewById(R.id.inputQ1);
        final EditText ans2 = findViewById(R.id.inputQ2);
        final EditText ans3 = findViewById(R.id.inputQ3);
        final TextView result1 = findViewById(R.id.answerQ1);
        final TextView result2 = findViewById(R.id.answerQ2);
        final TextView result3 = findViewById(R.id.answerQ3);

        //check answers
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input = Double.valueOf(ans1.getText().toString());
                if(input.equals(lenAns)){
                    String correct = "Correct!";
                    result1.setText(correct);
                    result1.setTextColor(Color.GREEN);
                    result1.setVisibility(View.VISIBLE);
                }
                else{
                    String incorrect = "The correct answer is " + lenAns;
                    result1.setText(incorrect);
                    result1.setTextColor(Color.RED);
                    result1.setVisibility(View.VISIBLE);
                }
            }
        });

        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input = Double.valueOf(ans2.getText().toString());
                if(input.equals(volAns)){
                    String correct = "Correct!";
                    result2.setText(correct);
                    result2.setTextColor(Color.GREEN);
                    result2.setVisibility(View.VISIBLE);
                }
                else{
                    String incorrect = "The correct answer is " + volAns;
                    result2.setText(incorrect);
                    result2.setTextColor(Color.RED);
                    result2.setVisibility(View.VISIBLE);
                }
            }
        });

        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input = Double.valueOf(ans3.getText().toString());
                if(input.equals(tempAns)){
                    String correct = "Correct!";
                    result3.setText(correct);
                    result3.setTextColor(Color.GREEN);
                    result3.setVisibility(View.VISIBLE);
                }
                else{
                    String incorrect = "The correct answer is " + tempAns;
                    result3.setText(incorrect);
                    result3.setTextColor(Color.RED);
                    result3.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.play_quiz, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_length) {
            Intent intent = new Intent(this, ConvertLengthActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_volume) {
            Intent intent = new Intent(this, ConvertVolumeActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_temperature) {
            Intent intent = new Intent(this, ConvertTempActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
