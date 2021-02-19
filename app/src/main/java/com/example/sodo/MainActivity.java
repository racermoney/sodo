package com.example.sodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_register,btn_tele,btn_yt,btn_promotion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_register = findViewById(R.id.btn_register);
        btn_tele = findViewById(R.id.btn_tele);
        btn_promotion = findViewById(R.id.btn_promotion);
        btn_yt = findViewById(R.id.btn_youtube);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.sodo13.com/?inviteCode=27646182"));
                startActivity(intent);

               /* Intent intent = new Intent(MainActivity.this,Register.class);
                startActivity(intent);
                finish();
                System.exit(0);*/
            }
        });

        btn_tele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Register.class);
                startActivity(intent);
                /*Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://t.me/sodo13game"));
                startActivity(intent);*/
            }
        });

        btn_promotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Promotion.class);
                startActivity(intent);
            }
        });

        btn_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Youtube.class);
                startActivity(intent);
            }
        });
    }
}