package com.example.dawid.animator_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category_name extends AppCompatActivity {

    private Button easy, medium, hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_name);

        easy = (Button) findViewById(R.id.easy);
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EasyMode();
            }
        });
        medium = (Button) findViewById(R.id.medium);
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediumMode();
            }
        });
        hard = (Button) findViewById(R.id.hard);
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HardMode();
            }
        });
        EasyMode();
    }

    protected  void ButtonCreate(int buttonCount)
    {

    }


    protected void EasyMode()
    {
        easy.setPressed(true);
        medium.setPressed(false);
        hard.setPressed(false);
    }

    protected void MediumMode()
    {
        easy.setPressed(false);
        medium.setPressed(true);
        hard.setPressed(false);
    }

    protected void HardMode()
    {
        easy.setPressed(false);
        medium.setPressed(false);
        hard.setPressed(true);
    }
}
