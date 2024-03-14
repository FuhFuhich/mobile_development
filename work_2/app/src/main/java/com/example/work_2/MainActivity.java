package com.example.work_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: MainActivity");

        Button button = findViewById(R.id.buttonSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText fioEditText = findViewById(R.id.editTextFullName);
                String fio = fioEditText.getText().toString();

                EditText groupEditText = findViewById(R.id.editTextGroupNumber);
                String group = groupEditText.getText().toString();

                EditText ageEditText = findViewById(R.id.editTextAge);
                int age = Integer.parseInt(ageEditText.getText().toString());

                EditText gradeSpinner = findViewById(R.id.editTextGrade);
                String grade = gradeSpinner.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("fio", fio);
                intent.putExtra("group", group);
                intent.putExtra("age", age);
                intent.putExtra("grade", grade);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: MainActivity");
    }

    public void goToSecondActivity(View view) {
        startActivity(new Intent(MainActivity.this, SecondActivity.class));
    }
}
