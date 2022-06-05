package com.example.unitell;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editTextNumber;
    private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editTextNumber = findViewById(R.id.editTextNumber);
        textView4 = findViewById(R.id.textView4);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Conversion Successful", Toast.LENGTH_SHORT).show();
//                String s = editTextNumber.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pounds = 2.205 * kg;
//                textView4.setText("The corresponding pound value of input is " + pounds);
//            }
//        });
    }
        public void conversion(View view){
            Toast.makeText(MainActivity.this, "Conversion Successful", Toast.LENGTH_SHORT).show();
            String s = editTextNumber.getText().toString();
            int kg = Integer.parseInt(s);
            double pounds = 2.205 * kg;
            textView4.setText("The corresponding pound value of input is " + pounds);
        }

}