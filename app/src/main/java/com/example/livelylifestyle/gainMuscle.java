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

public class gainMuscle extends AppCompatActivity {

    /**
     * Upon creation of activity,
     * sets layout and runs buttons
     * @param savedInstanceState
     * savedInstanceState – savedInstanceState is the state the app is in and is required for onCreate()
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        configureBackButton();
        configureRegularPlanButton();
        configureCleanBulkPlanButton();
        configureDirtyBulkPlanButton();
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
        });
    }

    //Regular meal Plan for gaining muscle button, if clicked writes "regular" to your custom plan
    //continues for further detail on plan
    private void configureRegularPlanButton() {
        ImageButton RegularPlanButton = (ImageButton) findViewById(R.id.RegularPlanButton);
        RegularPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.appendToFile("regular",getBaseContext());
                startActivity(new Intent(gainMuscle.this, gainMuscleType.class));
            }
        });
    }

    //Clean Bulk meal Plan for gaining muscle button, if clicked writes "cleanBulk" to your custom plan
    //continues for further detail on plan
    private void configureCleanBulkPlanButton() {
        ImageButton CleanBulkPlanButton = (ImageButton) findViewById(R.id.CleanBulkPlanButton);
        CleanBulkPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.appendToFile("cleanBulk",getBaseContext());
                startActivity(new Intent(gainMuscle.this, gainMuscleType.class));
            }
        });
    }

    //Dirty Bulk meal Plan for gaining muscle button, if clicked writes "dirtyBulk" to your custom plan
    //continues for further detail on plan
    private void configureDirtyBulkPlanButton() {
        ImageButton DirtyBulkPlanButton = (ImageButton) findViewById(R.id.DirtyBulkPlanButton);
        DirtyBulkPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.appendToFile("dirtyBulk",getBaseContext());
                startActivity(new Intent(gainMuscle.this, gainMuscleType.class));
            }
        });
    }
}