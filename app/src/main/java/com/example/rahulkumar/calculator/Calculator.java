package com.example.rahulkumar.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class Calculator extends AppCompatActivity {

    TextView result;
    EditText crunchifyEditText;
    float mVal1, mVal2;
    Button btn_Clear, btn_Percentage, btn_Divider, btn_Multiply, btn_Addition, btn_Subtract, btn_Equal;
    Button zero, one, two, three, four, five, six, seven, eight, nine, decimal;
    boolean add, subtract, divide, multiply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_result);
        btn_Clear = (Button)findViewById(R.id.btn_Clear);
        btn_Percentage = (Button)findViewById(R.id.btn_Percentage);
        btn_Divider = (Button)findViewById(R.id.btn_Divider);
        btn_Multiply = (Button)findViewById(R.id.btn_Multiply);
        btn_Addition = (Button)findViewById(R.id.btn_Multiply);
        btn_Subtract = (Button)findViewById(R.id.btn_Subtract);
        btn_Equal = (Button)findViewById(R.id.btn_Equal);
        zero = (Button)findViewById(R.id.zero);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        decimal = (Button)findViewById(R.id.decimal);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + ".");
            }
        });

        btn_Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mVal1 = Float.parseFloat(crunchifyEditText.getText() + "");
                    add = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        btn_Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVal1 = Float.parseFloat(crunchifyEditText.getText() + "");
                subtract = true;
                crunchifyEditText.setText(null);
            }
        });

        btn_Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVal1 = Float.parseFloat(crunchifyEditText.getText() + "");
                subtract = true;
                crunchifyEditText.setText(null);
            }
        });

        btn_Divider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVal1 = Float.parseFloat(crunchifyEditText.getText() + "");
                subtract = true;
                crunchifyEditText.setText(null);
            }
        });

        btn_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVal2 = Float.parseFloat(crunchifyEditText.getText() + "");

                if (add == true) {
                    crunchifyEditText.setText(mVal1 + mVal2 + "");
                    add = false;
                }

                if (subtract == true) {
                    crunchifyEditText.setText(mVal1 - mVal2 + "");
                    subtract = false;
                }

                if (multiply == true) {
                    crunchifyEditText.setText(mVal1 * mVal2 + "");
                    multiply = false;
                }

                if (divide == true) {
                    crunchifyEditText.setText(mVal1 / mVal2 + "");
                    divide = false;
                }
            }
        });

    }
}
