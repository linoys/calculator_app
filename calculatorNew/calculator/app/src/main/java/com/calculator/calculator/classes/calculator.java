package com.calculator.calculator.classes;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.calculator.calculator.fregments.SimpleCalc;

/**
 * Created by Liana on 03/11/2017.
 */

public class calculator {
    private TextView text;
    private String str  , str2 , sign, result ;
    private double  num1 , num2 ;

    public calculator (TextView text) {
        this.text = text ;
        str = "" ;
    }

    public void onClick(View v){
        Button btn = (Button)v;
        str+=btn.getText().toString();
        text.setText(str);
        num2=Double.parseDouble(str);


    }
     public  void onSign (View v){
        Button btn = (Button)v;
        sign = btn.getText().toString();
        str="";
        text.setText(sign);
        num1=num2;

    }

    public void result (View v){

        if (sign.equals("+")){
            result=num1+num2 + "" ;
        }else if (sign.equals("-")){
            result=num1-num2 + "" ;
        } if (sign.equals("*")){
            result=num1*num2 + "" ;
        }else if (sign.equals("/")){
            result=num1/num2 + "" ;
        } if (sign.equals("^")){
            result=Math.pow(num1 , num2)+ "" ;
        }else if (sign.equals("%")){
            result=num1*(num2/100) + "" ;}
        else {
            text.setText("error");
        }

        text.setText(result);

    }


    public void delete (View v){
        text.setText("");
        str="";
        num2=0;
        num1=0;
        result="";
    }



    }


