package com.example.bmi;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Example {
    public void init(LinearLayout layout, Context context){
        TextView name=new TextView(context);
        name.setText("Name");

        EditText name_box= new EditText(context);

        Button btn= new Button(context);
        btn.setText("send");

        layout.addView(name);
        layout.addView(name_box);
        layout.addView(btn);

    }

   
}
