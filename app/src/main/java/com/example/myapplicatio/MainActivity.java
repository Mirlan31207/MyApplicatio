package com.example.myapplicatio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtText1;
    EditText edtText2;
    Button button;
    TextView text;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtText1 = findViewById(R.id.lodin);
        edtText2 = findViewById(R.id.parol);
        button = findViewById(R.id.voiti);
        text = findViewById(R.id.pokazat);
        text1 = findViewById(R.id.poazat2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = edtText1.getText().toString();
                String txt1 = edtText2.getText().toString();
                text.setText(txt);
                text1.setText(txt1);

            }
        });
    }
}