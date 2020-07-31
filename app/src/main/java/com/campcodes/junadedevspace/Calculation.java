package com.campcodes.junadedevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculation extends AppCompatActivity {

    Button back,cal;
    EditText first,second;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        back=findViewById(R.id.back);
        cal=findViewById(R.id.cal);

        first=findViewById(R.id.first);
        second=findViewById(R.id.second);

        result=findViewById(R.id.result);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(first.getText().toString().equals(""))
                {
                    Toast.makeText(Calculation.this, "Please Enter first number", Toast.LENGTH_SHORT).show();
                }
                else if(second.getText().toString().equals(""))
                {
                    Toast.makeText(Calculation.this, "Please Enter second number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int firstvalue=Integer.valueOf(first.getText().toString());
                    int secondvalue=Integer.valueOf(second.getText().toString());

                    int firstfinal=firstvalue*firstvalue;
                    int secondfinal=secondvalue*secondvalue;

                    int sum=firstfinal+secondfinal;
                    result.setText("Result: "+sum);

                }
            }
        });
    }
}