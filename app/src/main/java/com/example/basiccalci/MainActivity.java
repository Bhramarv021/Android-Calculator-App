package com.example.basiccalci;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button num0;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button clr;
    private Button equal;
    private TextView result;
    private char operator;
    private int valueOne = 0;
    private int valueTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.button1);
        num2 = findViewById(R.id.button2);
        num3 = findViewById(R.id.button3);
        num4 = findViewById(R.id.button4);
        num5 = findViewById(R.id.button5);
        num6 = findViewById(R.id.button6);
        num7 = findViewById(R.id.button7);
        num8 = findViewById(R.id.button8);
        num9 = findViewById(R.id.button9);
        num0 = findViewById(R.id.button0);
        add = findViewById(R.id.buttonAdd);
        sub = findViewById(R.id.buttonSub);
        mul = findViewById(R.id.buttonMul);
        div = findViewById(R.id.buttonDiv);
        clr = findViewById(R.id.buttonClear);
        equal = findViewById(R.id.buttonEqual);
        result = findViewById(R.id.tvAns);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "9");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!result.getText().toString().equals(""))
                    result.setText(result.getText() + "0");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = '+';
                if (!result.getText().toString().equals("") && result.getText().toString() != null) {
                    valueOne = Integer.parseInt(result.getText().toString());
                    result.setText("+");
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = '-';
                if (!result.getText().toString().equals("") && result.getText().toString() != null) {
                    valueOne = Integer.parseInt(result.getText().toString());
                    result.setText("-");
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = '*';
                if (!result.getText().toString().equals("") && result.getText().toString() != null) {
                    valueOne = Integer.parseInt(result.getText().toString());
                    result.setText("*");
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = '/';
                if (!result.getText().toString().equals("") && result.getText().toString() != null) {
                    valueOne = Integer.parseInt(result.getText().toString());
                    result.setText("/");
                }
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText().toString() != null && !result.getText().toString().equals("")) {
                    result.setText(result.getText().toString().substring(0, result.getText().toString().length() - 1));
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!result.getText().toString().substring(1).equals("") && result.getText().toString() != null) {
                    valueTwo = Integer.parseInt(result.getText().toString().substring(1));
                }
                if (operator != '\0') {
                    int finalRes = calculateValue(valueOne, valueTwo, operator);
                    result.setText(finalRes + "");
                }
            }

            int calculateValue(int value1, int value2, char operator) {
                int result;
                switch (operator) {
                    case '+':
                        result = value1 + value2;
                        break;
                    case '-':
                        result = value1 - value2;
                        break;
                    case '*':
                        result = value1 * value2;
                        break;
                    case '/':
                        result = value1 / value2;
                        break;
                    default:
                        result = 0;
                        break;
                }
                return result;
            }

        });

    }

}
