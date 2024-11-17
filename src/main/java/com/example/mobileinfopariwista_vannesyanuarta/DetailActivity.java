package com.example.mobileinfopariwista_vannesyanuarta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView titleTextView, locationTextView, descriptionTextView, openingHoursTextView, openingDaysTextView, additionalTextView;
    private Button backButton;  // Menambahkan button untuk kembali

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.imageView);
        titleTextView = findViewById(R.id.titleTextView);
        locationTextView = findViewById(R.id.locationTextView);
        descriptionTextView = findViewById(R.id.descriptionTextView);
        openingHoursTextView = findViewById(R.id.openingHoursTextView);
        openingDaysTextView = findViewById(R.id.openingDaysTextView);
        additionalTextView = findViewById(R.id.additionalTextView);
        backButton = findViewById(R.id.backButton);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int imageRes = extras.getInt("imageRes");
            String title = extras.getString("title");
            String location = extras.getString("location");
            String description = extras.getString("description");
            String openingHours = extras.getString("openingHours");
            String openingDays = extras.getString("openingDays");
            String additionalText = extras.getString("additionalText");

            imageView.setImageResource(imageRes);
            titleTextView.setText(title);
            locationTextView.setText(location);
            descriptionTextView.setText(description);
            openingHoursTextView.setText(openingHours);
            openingDaysTextView.setText(openingDays);
            additionalTextView.setText(additionalText);
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(DetailActivity.this, "Kembali ke Beranda", Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
