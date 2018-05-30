package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click;
        click=(Button)findViewById(R.id.button_123);
        final ImageView ball=(ImageView)findViewById(R.id.imageView_ball1);
        final int[] ball_Array={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random generator=new Random();
                int num=generator.nextInt(5);

                ball.setImageResource(ball_Array[num]);
            }
        });
    }
}
