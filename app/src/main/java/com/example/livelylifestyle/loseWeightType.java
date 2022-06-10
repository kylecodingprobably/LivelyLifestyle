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

public class loseWeightType extends AppCompatActivity {

    /**
     * Upon creation of activity,
     * sets layout and runs buttons
     * @param savedInstanceState
     * savedInstanceState – savedInstanceState is the state the app is in and is required for onCreate()
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);

        configureBackButton();
        configureBeginnerPlanButtonThree();
        configureIntermediatePlanButtonThree();
        configureAdvancedPlanButtonThree();
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

    //Beginner workout Plan for losing weight button, if clicked writes "beginner" to your custom plan
    //is the final choice for the user's plan
    private void configureBeginnerPlanButtonThree() {
        ImageButton BeginnerPlanButtonThree = (ImageButton) findViewById(R.id.BeginnerPlanButtonThree);
        BeginnerPlanButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.appendToFile("beginner",getBaseContext());
                startActivity(new Intent(loseWeightType.this, homeScreen.class));
            }
        }
        );
    }
    //intermediate workout Plan for losing weight button, if clicked writes "intermediate" to your custom plan
    //is the final choice for the user's plan
    private void configureIntermediatePlanButtonThree() {
        ImageButton IntermediatePlanButtonThree = (ImageButton) findViewById(R.id.IntermediatePlanButtonThree);
        IntermediatePlanButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.appendToFile("intermediate",getBaseContext());
                startActivity(new Intent(loseWeightType.this, homeScreen.class));
            }
        }
        );
    }

    //Advanced workout Plan for losing weight button, if clicked writes "advanced" to your custom plan
    //is the final choice for the user's plan
    private void configureAdvancedPlanButtonThree() {
        ImageButton AdvancedPlanButtonThree = (ImageButton) findViewById(R.id.AdvancedPlanButtonThree);
        AdvancedPlanButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.appendToFile("advanced",getBaseContext());
                startActivity(new Intent(loseWeightType.this, homeScreen.class));
            }
        }
        );
    }
}