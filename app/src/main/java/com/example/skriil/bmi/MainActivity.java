package com.example.skriil.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn = (Button)this.findViewById(R.id.calculate);
        final EditText sizeInput = (EditText)this.findViewById(R.id.size);
        final EditText weightInput = (EditText)this.findViewById(R.id.weight);
        final TextView output = (TextView)this.findViewById(R.id.output);



        btn.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double size = Double.parseDouble(sizeInput.getText().toString());
                        double weight = Double.parseDouble(weightInput.getText().toString());

                        double bmi = size / weight;

                        output.setText(((Double)bmi).toString());
                    }
                }
        );
    }
}
