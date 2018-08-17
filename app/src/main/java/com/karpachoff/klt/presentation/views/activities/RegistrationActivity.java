package com.karpachoff.klt.presentation.views.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;
import android.widget.Toast;

import com.karpachoff.klt.R;

public class RegistrationActivity extends AppCompatActivity {

    ImageButton addPhotoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        addPhotoBtn = findViewById(R.id.addPhotoBtn);
        addPhotoBtn.setOnClickListener(v -> Toast.makeText(this, "it's work", Toast.LENGTH_SHORT).show());
    }
}
