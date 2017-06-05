package com.example.gowtham.img_flipper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    EditText ed1, ed2;
    Button startImg, stopImg, previousImg, nextImg, check,  flowersButton;

    int images[] = {R.drawable.apple, R.drawable.orange, R.drawable.banana, R.drawable.cherries, R.drawable.greenapple};
    String fruits[] = {"Apple", "Orange", "Banana", "Cherries", "Greenapple"};
    String getName;
    HashMap<Integer, String> img = new HashMap();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        for (int i = 0; i < images.length; i++) {
            setFlipperImage(images[i]);
        }
     //HashMap
        img.put(0, fruits[0]);
        img.put(1, fruits[1]);
        img.put(2, fruits[2]);
        img.put(3, fruits[3]);
        img.put(4, fruits[4]);

        startImg = (Button) findViewById(R.id.startImg);
        stopImg = (Button) findViewById(R.id.stopImg);
        nextImg = (Button) findViewById(R.id.nextImg);
        previousImg = (Button) findViewById(R.id.previousImg);
        check = (Button) findViewById(R.id.check);
        flowersButton = (Button) findViewById(R.id.flowersButton);

        startImg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                viewFlipper.startFlipping();
            }
        });
        stopImg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                viewFlipper.stopFlipping();

            }
        });
        previousImg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                viewFlipper.showPrevious();
            }
        });
        nextImg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                viewFlipper.showNext();
            }
        });

        flowersButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                Intent flower = new Intent(getApplicationContext(), SubActivity.class);
//            startActivity(flower);
                startActivity(new Intent(getApplicationContext(),SubActivity.class));
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final int currentIndex = viewFlipper.getDisplayedChild();
                Toast.makeText(MainActivity.this, "Checking current Index"+currentIndex, Toast.LENGTH_SHORT).show();
                getName = img.get(currentIndex);
                String fruitName = ed1.getText().toString();
                    if (fruitName.equals(getName)) {
                        Toast.makeText(getApplicationContext(), "Correct!! good" + currentIndex, Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong!" + currentIndex, Toast.LENGTH_LONG).show();
                    }

                            }
        });

    }

    private void setFlipperImage(int image) {
        ImageView img = new ImageView(getApplicationContext());
        img.setBackgroundResource(image);
        viewFlipper.addView(img);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(1000);
    }

}





