package com.example.bmi;

import android.content.Context;
import android.widget.LinearLayout;

public class CustomLayout extends LinearLayout {
    public CustomLayout(Context context) {
        super(context);
        this.setOrientation(VERTICAL);

//        Array main=new Array();
//        main.init(this,context);
        BMI main=new BMI();
        main.init(this,context);


    }
}

