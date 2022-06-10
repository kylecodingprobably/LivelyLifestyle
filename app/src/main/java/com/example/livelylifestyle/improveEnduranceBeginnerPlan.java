package com.example.livelylifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class improveEnduranceBeginnerPlan extends AppCompatActivity {

    /**
     * Upon creation of activity,
     * sets layout and runs buttons
     * @param savedInstanceState
     * savedInstanceState – savedInstanceState is the state the app is in and is required for onCreate()
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_improve_endurance_beginner_plan);

        configureMenuButton();
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