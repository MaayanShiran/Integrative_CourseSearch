package com.maayan.integrative_coursesearch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView courseInput;
    private AutoCompleteTextView yearInput;
    private AutoCompleteTextView semesterInput;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] courses = {"90901 חשבון דיפרנציאלי אינטגרלי1", "90905 אלגברה ליניארית", "90926 מתמטיקה בדידה", "10006 מבוא למדעי המחשב"};
        String[] semester = {"סמסטר א'", "סמסטר ב'"};
        String[] year = {"2020", "2021", "2022", "2023"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, courses);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, semester);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, year);

        courseInput = findViewById(R.id.menu_input);
        yearInput = findViewById(R.id.year_input);
        semesterInput = findViewById(R.id.semester_input);

        courseInput.setAdapter(adapter);
        yearInput.setAdapter(adapter2);
        semesterInput.setAdapter(adapter1);

        courseInput.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String completedText = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "You selected: " + completedText, Toast.LENGTH_SHORT).show();
            }
        });

        courseInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    courseInput.showDropDown();

            }
        });

        yearInput.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String completedText = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "You selected: " + completedText, Toast.LENGTH_SHORT).show();
            }
        });

        yearInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    yearInput.showDropDown();

            }
        });

        semesterInput.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String completedText = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "You selected: " + completedText, Toast.LENGTH_SHORT).show();
            }
        });

        semesterInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    semesterInput.showDropDown();


            }
        });

    }
}