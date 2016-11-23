package com.example.inhatc.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv3, tv4;
    CheckBox cb1;
    RadioGroup rbg;
    RadioButton r1, r2, r3;
    Button b1;
    ImageView img;
    LinearLayout l1;
    Image dog, cat, rabbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv3=(TextView)findViewById(R.id.textView3);
        tv4=(TextView)findViewById(R.id.textView4);
        cb1=(CheckBox)findViewById(R.id.checkBox2);
        rbg=(RadioGroup)findViewById(R.id.rg);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        b1=(Button)findViewById(R.id.button);
        img=(ImageView)findViewById(R.id.imageView);
        l1=(LinearLayout)findViewById(R.id.l1);

        cb1.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    l1.setVisibility(View.VISIBLE);
                } else {
                    l1.setVisibility(View.INVISIBLE);
                }
            }

        });

        b1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1.isChecked()){
                    img.setImageResource(R.drawable.dog);
                }
                else if(r2.isChecked()){
                    img.setImageResource(R.drawable.cat);
                }

                else if(r3.isChecked()){
                    img.setImageResource(R.drawable.rabbit);
                }
            }
        });



    }
}
