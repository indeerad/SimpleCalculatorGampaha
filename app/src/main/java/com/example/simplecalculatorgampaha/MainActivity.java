package com.example.simplecalculatorgampaha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtValue1;
    EditText txtValue2;
    TextView lblAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValue1 = findViewById(R.id.txtValue1);
        txtValue2 = findViewById(R.id.txtValue2);
        lblAnswer = findViewById(R.id.lblAsnwer);
    }

    public void calculate(View v){
        String value1 = txtValue1.getText().toString();
        String value2 = txtValue2.getText().toString();

        double v1 = Double.parseDouble(value1);
        double v2 = Double.parseDouble(value2);

        double ans = v1 + v2;

        lblAnswer.setText("Answer is: " + ans);
    }


}