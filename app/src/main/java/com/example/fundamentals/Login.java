package com.example.fundamentals;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

//hay que añadir dos mierdas en gradle Module (mirar ahi)
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView logo = findViewById(R.id.logo);

        Glide.with(this)
                .load(R.drawable.persona)
                .transition(DrawableTransitionOptions.withCrossFade(100))

//                .centerCrop()
//                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.fucsia_200)))
                .circleCrop()
                .into(logo);
    }
}