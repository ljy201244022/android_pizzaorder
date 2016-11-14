package com.example.inhatc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String su1, su2;
    int result;
    TextView textResult;
    Button b1,b2,b3,b4;
    EditText editText1,editText2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("간단 계산기!");

        editText1=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        textResult=(TextView)findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su1=editText1.getText().toString();
                su2=editText2.getText().toString();

                result=Integer.parseInt(su1)+Integer.parseInt(su2);
                textResult.setText(Integer.toString(result));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su1=editText1.getText().toString();
                su2=editText2.getText().toString();

                result=Integer.parseInt(su1)-Integer.parseInt(su2);
                textResult.setText(Integer.toString(result));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su1=editText1.getText().toString();
                su2=editText2.getText().toString();

                result=Integer.parseInt(su1)*Integer.parseInt(su2);
                textResult.setText(Integer.toString(result));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su1=editText1.getText().toString();
                su2=editText2.getText().toString();

                result=Integer.parseInt(su1)/Integer.parseInt(su2);
                textResult.setText(Integer.toString(result));
            }
        });
    }
}

