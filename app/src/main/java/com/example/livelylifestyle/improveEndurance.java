package com.example.livelylifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Plan to select the level on endurance for the user
 * Multiple levels
 * Matthew
 */
public class improveEndurance extends AppCompatActivity {

    /**
     * Upon creation of activity,
     * sets layout and runs buttons
     * @param savedInstanceState
     * savedInstanceState – savedInstanceState is the state the app is in and is required for onCreate()
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);

        configureBackButton();
        configureBeginnerPlanButton();
        configureIntermediatePlanButton();
        configureAdvancedPlanButton();
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

    //Beginner workout Plan for endurance button, if clicked writes "beginner" to your custom plan
    //is the final choice for the user's plan
    private void configureBeginnerPlanButton() {
        ImageButton BeginnerPlanButton = (ImageButton) findViewById(R.id.BeginnerPlanButton);
        BeginnerPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.appendToFile("beginner",getBaseContext());
                startActivity(new Intent(improveEndurance.this, homeScreen.class));
            }
        }
        );
    }

    //intermediate workout Plan for endurance button, if clicked writes "intermediate" to your custom plan
    //is the final choice for the user's plan
    private void configureIntermediatePlanButton() {
        ImageButton IntermediatePlanButton = (ImageButton) findViewById(R.id.IntermediatePlanButton);
        IntermediatePlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.appendToFile("intermediate",getBaseContext());
                startActivity(new Intent(improveEndurance.this, homeScreen.class));
            }
        }
        );
    }

    //Advanced workout Plan for endurance button, if clicked writes "advanced" to your custom plan
    //is the final choice for the user's plan
    private void configureAdvancedPlanButton() {
        ImageButton AdvancedPlanButton = (ImageButton) findViewById(R.id.AdvancedPlanButton);
        AdvancedPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.appendToFile("advanced",getBaseContext());
                startActivity(new Intent(improveEndurance.this, homeScreen.class));
            }
        }
        );
    }
}