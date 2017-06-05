package com.example.gowtham.img_flipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SubActivity extends AppCompatActivity {

    ImageView imageView;
    Button appleButton, bananaButton, orangeButton, cherriesButton, greenappleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        imageView = (ImageView) findViewById(R.id.imageView);
        appleButton = (Button) findViewById(R.id.appleButton);
        bananaButton = (Button) findViewById(R.id.bananaButton);
        orangeButton = (Button) findViewById(R.id.orangeButton);
        cherriesButton = (Button) findViewById(R.id.cherriesButton);
        greenappleButton = (Button) findViewById(R.id.greenappleButton);

        appleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setBackgroundResource(R.drawable.apple);
            }
        });
        bananaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setBackgroundResource(R.drawable.banana);
            }
        });
        orangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setBackgroundResource(R.drawable.orange);
            }
        });
        cherriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setBackgroundResource(R.drawable.cherries);
            }
        });
        greenappleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setBackgroundResource(R.drawable.greenapple);
            }
        });
    }

}
