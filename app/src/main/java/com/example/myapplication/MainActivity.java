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
        persons.setText("aantal personen: $d", number);
        receipt = findViewById(R.id.receipt);
        receipt.setText("1 grote ui\n 2 rode paprika’s\n 2 eetlepels kruidenmix voor (chili con carne )\n 1 eetlepels olijfolie\n 500 gr rundergehakt\n 450 gr rode/bruine bonen\n 1 blik tomatenblokjes a 400 gr\n 1 klein blikje tomatenpuree\n 200 ml gezeefde tomaten\n 1 klein blikje mais a 150 gr\n 250 ml zure room\n peterselie (fijngehakt)\n 300 gr rijst voor erbij");

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