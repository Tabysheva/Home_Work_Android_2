package com.example.home_work_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, multiply, division, percent, clear, equal, dot;
    TextView result;


    double num1, num2;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.button_one);
        two = findViewById(R.id.button_two);
        three = findViewById(R.id.button_three);
        four = findViewById(R.id.button_four);
        five = findViewById(R.id.button_five);
        six = findViewById(R.id.button_six);
        seven = findViewById(R.id.button_seven);
        eight = findViewById(R.id.button_eight);
        nine = findViewById(R.id.button_nine);
        zero = findViewById(R.id.button_zero);
        division = findViewById(R.id.button_dv);
        clear = findViewById(R.id.button_cl);
        dot = findViewById(R.id.button_point);
        equal = findViewById(R.id.button_eq);
        plus = findViewById(R.id.button_pl);
        minus = findViewById(R.id.button_mn);
        multiply = findViewById(R.id.button_ml);
        percent = findViewById(R.id.button_pr);

        result = findViewById(R.id.result);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_one:


                        result.append(one.getText());
                        break;
                    case R.id.button_two:
                        result.append(two.getText());
                        break;
                    case R.id.button_three:
                        result.append(three.getText());
                        break;
                    case R.id.button_four:
                        result.append(four.getText());
                        break;
                    case R.id.button_five:
                        result.append(five.getText());
                        break;
                    case R.id.button_six:
                        result.append(six.getText());
                        break;
                    case R.id.button_seven:
                        result.append(seven.getText());
                        break;
                    case R.id.button_eight:
                        result.append(eight.getText());
                        break;
                    case R.id.button_nine:
                        result.append(nine.getText());
                        break;
                    case R.id.button_zero:
                        result.append(zero.getText());
                        break;
                    case R.id.button_pl:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "+";

                        break;

                    case R.id.button_dv:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "/";
                        break;

                    case R.id.button_mn:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "-";

                        break;

                    case R.id.button_ml:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "*";

                        break;
                    case R.id.button_eq:
                        Log.d("TAG", "onClick: ");
                        num2 = Double.parseDouble(result.getText().toString());
                        if (operation == "+") {
                            result.setText(Double.toString(num1 + num2));
                        } else if (operation == "-") {
                            result.setText(Double.toString(num1 - num2));

                        } else if (operation == "*") {
                            result.setText(Double.toString(num1 * num2));

                        } else if (operation == "/") {
                            result.setText(Double.toString(num1 / num2));

                        } else if (operation == "%") {
                            result.setText(Double.toString((num1 / 100) * num2));

                        }
                        break;
                    case R.id.button_pr:
                        num1 = Double.parseDouble(result.getText().toString());
                        result.setText("");
                        operation = "%";
                    case R.id.button_cl:
                        result.setText("");
                }
            }
        };
        percent.setOnClickListener(listener);
        multiply.setOnClickListener(listener);
        minus.setOnClickListener(listener);
        plus.setOnClickListener(listener);
        equal.setOnClickListener(listener);
        one.setOnClickListener(listener);
        two.setOnClickListener(listener);
        three.setOnClickListener(listener);
        four.setOnClickListener(listener);
        five.setOnClickListener(listener);
        six.setOnClickListener(listener);
        seven.setOnClickListener(listener);
        eight.setOnClickListener(listener);
        nine.setOnClickListener(listener);
        zero.setOnClickListener(listener);
        division.setOnClickListener(listener);
        clear.setOnClickListener(listener);
    }
public void sendAnswer(){
    String abc = result.getText().toString();
    Intent intent = new Intent(this,SecondActivity.class);
    intent.putExtra("key", abc);
    startActivityForResult(intent,42);

}
    public void putResult() {
        String abc = result.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("key", abc);
        setResult(RESULT_OK);
        Log.d("abc", "putResult: "+abc);
        Log.d("ololo", "putResult: "+intent);
        finish();
    }

    public void openResult(View view) {
        sendAnswer();
    }
}
