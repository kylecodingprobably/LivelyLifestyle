package com.example.livelylifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class mealPlan extends AppCompatActivity {

    /**
     * Upon creation of activity,
     * sets layout and runs buttons
     * @param savedInstanceState
     * savedInstanceState – savedInstanceState is the state the app is in and is required for onCreate()
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        configureMenuButton();
        String plan = "";
        plan = myUtils.readFromFile(getBaseContext());
        if (plan.contains("muscle"))  {
            if (plan.contains("cleanBulk")) {finish(); startActivity(new Intent(mealPlan.this, gainMuscleCleanBulkPlan.class));;}
            else if (plan.contains("dirtyBulk")) {finish(); startActivity(new Intent(mealPlan.this, gainMuscleDirtyBulkPlan.class));;}
            else if (plan.contains("regular")) {finish(); startActivity(new Intent(mealPlan.this, gainMuscleRegularBulkPlan.class));;}
        }
        else if (plan.contains("weight")) {
            if (plan.contains("minor")) {finish(); startActivity(new Intent(mealPlan.this, loseWeightMinorPlan.class));;}
            else if (plan.contains("standard")) {finish(); startActivity(new Intent(mealPlan.this, loseWeightStandardPlan.class));;}
            else if (plan.contains("major")) {finish(); startActivity(new Intent(mealPlan.this, loseWeightMajorPlan.class));;}
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