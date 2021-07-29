package com.smirnovma.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private TextView textViewEquals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        textView = findViewById(R.id.textView);
        textViewEquals = findViewById(R.id.textViewEquals);

        initButtonClickListener();
    }

    private void initButtonClickListener() {

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button_point = findViewById(R.id.button_point);
        Button button_divide = findViewById(R.id.button_divide);
        Button button_multiply = findViewById(R.id.button_multiply);
        Button button_minus = findViewById(R.id.button_minus);
        Button button_plus = findViewById(R.id.button_plus);
        Button button_equals = findViewById(R.id.button_equals);
        Button button_back = findViewById(R.id.button_back);
        Button button_AC = findViewById(R.id.button_AC);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button_point.setOnClickListener(this);
        button_divide.setOnClickListener(this);
        button_multiply.setOnClickListener(this);
        button_minus.setOnClickListener(this);
        button_plus.setOnClickListener(this);
        button_equals.setOnClickListener(this);
        button_back.setOnClickListener(this);
        button_AC.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                textView.setText(textView.getText() + "0");
                break;
            case R.id.button1:
                textView.setText(textView.getText() + "1");
                break;
            case R.id.button2:
                textView.setText(textView.getText() + "2");
                break;
            case R.id.button3:
                textView.setText(textView.getText() + "3");
                break;
            case R.id.button4:
                textView.setText(textView.getText() + "4");
                break;
            case R.id.button5:
                textView.setText(textView.getText() + "5");
                break;
            case R.id.button6:
                textView.setText(textView.getText() + "6");
                break;
            case R.id.button7:
                textView.setText(textView.getText() + "7");
                break;
            case R.id.button8:
                textView.setText(textView.getText() + "8");
                break;
            case R.id.button9:
                textView.setText(textView.getText() + "9");
                break;
            case R.id.button_point:
                textView.setText(textView.getText() + ".");
                break;
            case R.id.button_divide:
                textView.setText(textView.getText() + "/");
                break;
            case R.id.button_multiply:
                textView.setText(textView.getText() + "*");
                break;
            case R.id.button_minus:
                textView.setText(textView.getText() + "-");
                break;
            case R.id.button_plus:
                textView.setText(textView.getText() + "+");
                break;
            case R.id.button_equals:
                textView.setText(textView.getText() + "=");
                break;
            case R.id.button_back:
                String str = String.valueOf(textView.getText());
                if (!str.equals("")) {
                    textView.setText(str.substring(0, str.length() - 1));
                }
                break;
            case R.id.button_AC:
                textView.setText("");
                break;
            default:
                break;

        }

    }
}