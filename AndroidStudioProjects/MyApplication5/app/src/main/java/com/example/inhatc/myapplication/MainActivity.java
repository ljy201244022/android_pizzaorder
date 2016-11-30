package com.example.inhatc.myapplication;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.*;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3;
    CheckBox cb1;
    RadioGroup rbg;
    RadioButton rb1,rb2;
    LinearLayout l1,l2;
    ImageView img1;
    EditText et1,et2,et3;
    Button bt1;
    int imagenum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        cb1=(CheckBox)findViewById(R.id.checkBox);
        rbg=(RadioGroup)findViewById(R.id.rbg);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        l1=(LinearLayout)findViewById(R.id.l1);
        l2=(LinearLayout)findViewById(R.id.l2);
        img1=(ImageView)findViewById(R.id.imageView3);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        bt1=(Button)findViewById(R.id.button3);


        rbg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton) {
                    img1.setImageResource(R.drawable.pic);
                    imagenum = 0;
                }
                else if(checkedId == R.id.radioButton2) {
                    img1.setImageResource(R.drawable.so);
                    imagenum = 1;
                }
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int od = 0;
                double price = 0;
                String select = "";
                if(!et1.getText().toString().equals("")) {
                    int c = Integer.parseInt(et1.getText().toString());
                    od += c;
                    price += c * 16000;
                }
                if(!et2.getText().toString().equals("")) {
                    int c = Integer.parseInt(et2.getText().toString());
                    od += c;
                    price += c * 11000;
                }
                if(!et3.getText().toString().equals("")) {
                    int c = Integer.parseInt(et3.getText().toString());
                    od += c;
                    price += c * 4000;
                }

                if (cb1.isChecked()) {
                    price = price * 0.93;
                }
                if(imagenum == 0) {
                    select = "pickle choice!";
                }
                else {
                    select = "sauce choice!";
                }

                t1.setText(Integer.toString(od));
                t2.setText(Double.toString(price));
                t3.setText(select);

            }
        });
    }

}
