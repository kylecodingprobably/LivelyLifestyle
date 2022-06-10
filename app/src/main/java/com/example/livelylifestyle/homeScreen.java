package com.example.livelylifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**Creates class for the home screen
 *includes all backgrounds and buttons
 */
public class homeScreen extends AppCompatActivity {

    /**
     * upon creation runs the functions that create the buttons
     * @param savedInstanceState
     * savedInstanceState – savedInstanceState is the state the app is in and is required for onCreate()
     * activities may return to this saved state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureWorkoutPlanButton();
        configureMealPlanButton();
        configureCreateAPlanButton();
        configureSettingsButton();
    }

    /**
     * Function to display the Workout Plan button
     * takes in the image and Listens for a click to open the workoutPlan activity
     */
    private void configureWorkoutPlanButton() {
        ImageButton WorkoutPlanButton = (ImageButton) findViewById(R.id.WorkoutPlanButton);
        WorkoutPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homeScreen.this, workoutPlan.class));
            }
        });
    }

    /**
     * Function to display the Meal Plan button
     * takes in the image and Listens for a click to open the mealPlan activity
     */
    private void configureMealPlanButton() {
        ImageButton MealPlanButton = (ImageButton) findViewById(R.id.MealPlanButton);
        MealPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homeScreen.this, mealPlan.class));
            }
        });
    }

    /**
     * Function to display the Create a Plan button
     * takes in the image and Listens for a click to open the createAPlan activity
     */
    private void configureCreateAPlanButton() {
        ImageButton CreateAPlanButton = (ImageButton) findViewById(R.id.CreateAPlanButton);
        CreateAPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homeScreen.this, createPlan.class));
            }
        });
    }

    /**
     * Function to display the Settings button
     * takes in the image and Listens for a click to open the settings activity
     */
    private void configureSettingsButton() {
        ImageButton SettingsButton = (ImageButton) findViewById(R.id.SettingsButton);
        SettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(homeScreen.this, settings.class));
            }
        });
    }
}

