package com.example.calificaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView txtSignature;
    private ImageView imgSignature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txtSignature = findViewById(R.id.txt_signature);
        imgSignature = findViewById(R.id.img_signature);

        Bundle bundle = getIntent().getExtras();
        txtSignature.setText(bundle.getString("data"));

        imgSignature.setImageResource(bundle.getInt("img"));



    }
}
