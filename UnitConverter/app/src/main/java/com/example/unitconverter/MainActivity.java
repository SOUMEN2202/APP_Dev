package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

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

        EditText editText = findViewById(R.id.edittext);
        Button button= findViewById(R.id.button);
        TextView textView= findViewById(R.id.textview1);
        TextView textview=  findViewById(R.id.textview2);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kilograms=editText.getText().toString();
                float kilos= Float.parseFloat(kilograms);

                float pound= (float) (kilos*2.20462);

                textview.setText(""+pound);
            }
        });

    }
}