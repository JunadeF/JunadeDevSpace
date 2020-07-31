package com.campcodes.junadedevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuScreen extends AppCompatActivity {

    TextView toptitle;
    Button home,cal,about,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        toptitle=findViewById(R.id.toptitle);

        home=findViewById(R.id.home);
        cal=findViewById(R.id.Calculation);
        about=findViewById(R.id.About);
        profile=findViewById(R.id.profile);

        toptitle.setText("Dear "+getIntent().getStringExtra("name"));

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MenuScreen.this,Calculation.class);
                startActivity(i);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MenuScreen.this,About.class);
                startActivity(i);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MenuScreen.this,MyProfile.class);
                startActivity(i);
            }
        });

    }
}