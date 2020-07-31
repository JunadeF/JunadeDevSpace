package com.campcodes.junadedevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LauncherScreen extends AppCompatActivity {

    EditText name;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        name=findViewById(R.id.name);
        next=findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals(""))
                {
                    Toast.makeText(LauncherScreen.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                }
                else
                {

                    Intent i=new Intent(LauncherScreen.this,MenuScreen.class);
                    i.putExtra("name",name.getText().toString());
                    startActivity(i);
                }
            }
        });
    }
}