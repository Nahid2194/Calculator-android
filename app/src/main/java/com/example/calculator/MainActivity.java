package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 EditText firstNumberId ,secondNumberId;
 TextView resultTextView;
 int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumberId = findViewById(R.id.firstNumberId);
        secondNumberId = findViewById(R.id.secondNumberId);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void buttonFunction(View view) {
        int result;
        num1 = Integer.parseInt(firstNumberId.getText().toString());
        num2 =  Integer.parseInt(secondNumberId.getText().toString());
        if(view.getId()==R.id.plusButtonId){
             result = num1 + num2;
        }
        else if(view.getId()==R.id.minusButtonId){
             result = num1 - num2;
        }
        else if(view.getId()==R.id.divisionButtonId){
             result = num1 / num2;
        }
        else if(view.getId()==R.id.multiplyButtonId){
             result = num1 *num2;
        }
        resultTextView.setText("Result is "+result);
    }

//    public void divFunction(View view) {
//        num1 = Integer.parseInt(firstNumberId.getText().toString());
//        num2 =  Integer.parseInt(secondNumberId.getText().toString());
//        int result = num1 / num2;
//        resultTextView.setText("Result is "+result);
//    }
//
//    public void plusFunction(View view) {
//        num1 = Integer.parseInt(firstNumberId.getText().toString());
//        num2 =  Integer.parseInt(secondNumberId.getText().toString());
//        int result = num1 + num2;
//        resultTextView.setText("Result is "+result);
//    }
//
//    public void subFunction(View view) {
//        num1 = Integer.parseInt(firstNumberId.getText().toString());
//        num2 =  Integer.parseInt(secondNumberId.getText().toString());
//        int result = num1 - num2;
//        resultTextView.setText("Result is "+result);
//    }
//
//    public void mulFunction(View view) {
//        num1 = Integer.parseInt(firstNumberId.getText().toString());
//        num2 =  Integer.parseInt(secondNumberId.getText().toString());
//        int result = num1 * num2;
//        resultTextView.setText("Result is "+result);
//    }
}