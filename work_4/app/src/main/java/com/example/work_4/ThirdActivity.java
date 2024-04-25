package com.example.work_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    String first_name, last_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);


        Intent intent = getIntent();

        FirstLastNameSender first_last_name = (FirstLastNameSender) intent.getSerializableExtra("names");
        if(first_last_name != null && first_last_name.first_name != null && first_last_name.last_name != null){
            first_name = (first_last_name.first_name);
            last_name = (first_last_name.last_name);
        }

        Button third_activity = findViewById(R.id.OK);
        third_activity.setOnClickListener(this::ReturnToTwo);
    }

    public void ReturnToTwo(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("timeInfo", new SubjectSender(
                ((EditText)findViewById(R.id.day)).getText().toString(),
                ((EditText)findViewById(R.id.time)).getText().toString(),
                ((EditText)findViewById(R.id.comment)).getText().toString()
        ));
        intent.putExtra("names", new FirstLastNameSender(
                first_name,
                last_name
        ));
        startActivity(intent);
    }
}
