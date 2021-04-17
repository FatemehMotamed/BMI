package com.example.bmi;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BMI {
    protected Button btn;
    protected EditText age;
    protected EditText weight;
    protected EditText height;
    protected TextView opt_text;
    protected TextView txt_result;
    protected TextView stutus;
    protected String result;
    public Float height_meter;
    public Float weight_float;
    public  Integer optiml_bmi;
    public  Float person_bmi;


    public void init(LinearLayout layout, Context context){

        btn=new Button(context);
        weight= new EditText(context);
        height=new EditText(context);
        age=new EditText(context);
        opt_text=new TextView(context);
        txt_result=new TextView(context);
        stutus=new TextView(context);

        btn.setText("Send");
        weight.setHint("Weight");
        height.setHint("height");
        age.setHint("age");

        layout.addView(weight);
        layout.addView(height);
        layout.addView(age);
        layout.addView(btn);
        layout.addView(opt_text);
        layout.addView(txt_result);
        layout.addView(stutus);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convert();
                calculate_optimal_bmi();

            }
        });



    }

    public void convert(){
        String height_temp=height.getText().toString();
        height_meter=Float.parseFloat(height_temp);
        height_meter=height_meter/100;
        String weight_temp=weight.getText().toString();
        weight_float=Float.parseFloat(weight_temp);

    }

    public Float calcute_person_bmi(){
        convert();
        person_bmi= weight_float / (height_meter*height_meter);
        return person_bmi;

    }

    public void calculate_optimal_bmi(){
        String age_str=age.getText().toString();
        int age=Integer.parseInt(age_str);
        if (age>=17 & age<=19){
            optiml_bmi=21;
        }
        else if(age>19 & age<=24){
            optiml_bmi=22;
        }
        else if(age>=24 & age<=34){
            optiml_bmi=23;
        }
        else if(age>=34 & age<=44){
            optiml_bmi=24;
        }
        else if(age>=44 & age<=54){
            optiml_bmi=25;
        }
        else if(age>=54 & age<=64){
            optiml_bmi=26;
        }
        else if(age>=64){
            optiml_bmi=27;
        }
    }






}
