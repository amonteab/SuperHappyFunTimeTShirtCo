package com.example.aaronmonteabaro.tshirtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static com.example.aaronmonteabaro.tshirtapp.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void comingSoon(android.view.View view)
    {
        Toast.makeText(getApplicationContext(), "The function coming soon!", Toast.LENGTH_SHORT).show();
    }
}
