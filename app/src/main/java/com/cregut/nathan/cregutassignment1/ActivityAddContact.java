package com.cregut.nathan.cregutassignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityAddContact extends AppCompatActivity {

    private Button listButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        listButton = findViewById(R.id.button4);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListScreen();
            }
        });
    }

    public void openListScreen() {
        Intent intent = new Intent(this, ActivityList.class);
        startActivity(intent);
    }
}
