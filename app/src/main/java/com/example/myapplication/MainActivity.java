package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    int number = 2;
    TextView persons;
    TextView receipt;
    Button addButton;
    Button removeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persons = findViewById(R.id.persons);
        receipt = findViewById(R.id.receipt);
        receipt.setText(new StringBuilder().append("1 grote ui\n").append("2 rode paprika’s\n").append("2 eetlepels kruidenmix voor (chili con carne )\n").append("1 eetlepels olijfolie\n").append("500 gr rundergehakt\n").append("450 gr rode/bruine bonen\n").append("1 blik tomatenblokjes a 400 gr\n").append("1 klein blikje tomatenpuree\n").append("200 ml gezeefde tomaten\n").append("1 klein blikje mais a 150 gr\n").append("250 ml zure room\n").append("peterselie (fijngehakt)\n").append("300 gr rijst voor erbij").toString());

        addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number++;
            }
        });

        removeButton = (Button) findViewById(R.id.removeButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                number--;
            }
        });

    }



}