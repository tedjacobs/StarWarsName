package com.example.starwarsname;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class StarWarsNameActivity extends AppCompatActivity {
    private NameBook nameBook = new NameBook();
    private ScreenBackgroundColor screenBackgroundColor = new ScreenBackgroundColor();
    // Declare View variables
    private TextView nameTextView;
    private Button showNameButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign the Views from the layout file to the corresponding variables
        nameTextView = (TextView) findViewById(R.id.nameTextView);
        showNameButton = (Button) findViewById(R.id.nameButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameBook.getName();

                // Update the screen with a new name
                nameTextView.setText(name);

                int color = screenBackgroundColor.getColor();
                relativeLayout.setBackgroundColor(color);
            }
        };
        showNameButton.setOnClickListener(listener);
    }
}
