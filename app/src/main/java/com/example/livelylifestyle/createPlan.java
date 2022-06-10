package com.example.livelylifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * the class which creates a new plan for the user
 * lets the user select a workout type and level of workout
 * saved in the app's local files accessible by:
 * View -> Tool Windows -> Device File Explorer -> data -> data -> com.example.livelylifestyle -> files -> plan.txt
 * Code by Matthew
 */
public class createPlan extends AppCompatActivity {

    /**
     * Upon creation of activity,
     * sets layout and runs buttons
     * @param savedInstanceState
     * savedInstanceState – savedInstanceState is the state the app is in and is required for onCreate()
     * activities may return to this saved state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        configureMenuButton();
        configureGainMuscleButton();
        configureLoseWeightButton();
        configureImproveEnduranceButton();
    }

    //Dislpay Menu button, if clicked finishes activity (returns to menu)
    private void configureMenuButton() {
        ImageButton MenuButton = (ImageButton) findViewById(R.id.MenuButton);
        MenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { finish(); }
        });
    }

    //Gain Muscle button, if clicked writes "muscle" to your custom plan
    //continues for further detail on plan
    private void configureGainMuscleButton() {
        ImageButton GainMuscleButton = (ImageButton) findViewById(R.id.GainMuscleButton);
        GainMuscleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.writeToFile("muscle",getBaseContext());
                startActivity(new Intent(createPlan.this, gainMuscle.class));
            }
        });
    }

    //Weight Loss button, if clicked writes "weight" to your custom plan
    //continues for further detail on plan
    private void configureLoseWeightButton() {
        ImageButton LoseWeightButton = (ImageButton) findViewById(R.id.LoseWeightButton);
        LoseWeightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.writeToFile("weight",getBaseContext());
                startActivity(new Intent(createPlan.this, loseWeight.class));
            }
        }
        );
    }

    //improveEndurance button, if clicked writes "endurance" to your custom plan
    //continues for further detail on plan
    private void configureImproveEnduranceButton() {
        ImageButton ImproveEnduranceButton = (ImageButton) findViewById(R.id.ImproveEnduranceButton);
        ImproveEnduranceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUtils.writeToFile("endurance",getBaseContext());
                startActivity(new Intent(createPlan.this, improveEndurance.class));
            }
        }
        );
    }
}