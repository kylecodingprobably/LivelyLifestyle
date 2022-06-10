package com.example.livelylifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class loseWeight extends AppCompatActivity {

    /**
     * Upon creation of activity,
     * sets layout and runs buttons
     * @param savedInstanceState
     * savedInstanceState – savedInstanceState is the state the app is in and is required for onCreate()
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

        configureBackButton();
        configureMinorPlanButton();
        configureStandardPlanButton();
        configureMajorPlanButton();
    }

    /**
     * Ends the activity if clicked (sends the user back)
     */
    private void configureBackButton() {
        ImageButton BackButton = (ImageButton) findViewById(R.id.BackButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        }
        );
    }

    //Minor meal Plan for lose weight button, if clicked writes "minor" to your custom plan
    //is the final choice for the user's plan
    private void configureMinorPlanButton() {
        ImageButton MinorPlanButton = (ImageButton) findViewById(R.id.MinorPlanButton);
        MinorPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.appendToFile("minor",getBaseContext());
                startActivity(new Intent(loseWeight.this, loseWeightType.class));
            }
        }
        );
    }

    //standard meal Plan for lose weight button, if clicked writes "standard" to your custom plan
    //is the final choice for the user's plan
    private void configureStandardPlanButton() {
        ImageButton StandardPlanButton = (ImageButton) findViewById(R.id.StandardPlanButton);
        StandardPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.appendToFile("standard",getBaseContext());
                startActivity(new Intent(loseWeight.this, loseWeightType.class));
            }
        }
        );
    }

    //Major meal Plan for lose weight button, if clicked writes "major" to your custom plan
    //is the final choice for the user's plan
    private void configureMajorPlanButton() {
        ImageButton MajorPlanButton = (ImageButton) findViewById(R.id.MajorPlanButton);
        MajorPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.appendToFile("major",getBaseContext());
                startActivity(new Intent(loseWeight.this, loseWeightType.class));
            }
        }
        );
    }
}