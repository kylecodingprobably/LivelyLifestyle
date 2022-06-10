package com.example.livelylifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class workoutPlan extends AppCompatActivity {

    /**
     * Upon creation of activity,
     * sets layout and runs buttons
     * @param savedInstanceState
     * savedInstanceState – savedInstanceState is the state the app is in and is required for onCreate()
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        configureMenuButton();
        String plan = "";
        plan = myUtils.readFromFile(getBaseContext());
        System.out.print(plan);
        if (plan.contains("muscle"))  {
            if (plan.contains("beginner")) {finish(); startActivity(new Intent(workoutPlan.this, gainMuscleBeginnerPlan.class));;}
            else if (plan.contains("intermediate")) {finish(); startActivity(new Intent(workoutPlan.this, gainMuscleIntermediatePlan.class));;}
            else if (plan.contains("advanced")) {finish(); startActivity(new Intent(workoutPlan.this, gainMuscleAdvancedPlan.class));;}
        }
        else if (plan.contains("weight")) {
            if (plan.contains("beginner")) {finish(); startActivity(new Intent(workoutPlan.this, loseweightBeginnerPlan.class));;}
            else if (plan.contains("intermediate")) {finish(); startActivity(new Intent(workoutPlan.this, loseWeightIntermediatePlan.class));;}
            else if (plan.contains("advanced")) {finish(); startActivity(new Intent(workoutPlan.this, loseWeightAdvancedPlan.class));;}
        }
        else if (plan.contains("endurance")) {
            if (plan.contains("beginner")) {finish(); startActivity(new Intent(workoutPlan.this, improveEnduranceBeginnerPlan.class));;}
            else if (plan.contains("intermediate")) {finish(); startActivity(new Intent(workoutPlan.this, improveEnduranceIntermediatePlan.class));;}
            else if (plan.contains("advanced")) {finish(); startActivity(new Intent(workoutPlan.this, improveEnduranceAdvancedPlan.class));;}
        }
    }

    /**
     * Ends the activity if clicked (sends the user back to menu)
     */
    private void configureMenuButton() {
        ImageButton MenuButton = (ImageButton) findViewById(R.id.MenuButton);
        MenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { finish(); }
        }
        );
    }
}