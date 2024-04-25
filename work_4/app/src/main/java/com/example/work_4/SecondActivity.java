package com.example.work_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    String first_name, last_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView textViewFName = findViewById(R.id.second_activity_first_name);
        TextView textViewLName = findViewById(R.id.second_activity_last_name);

        Intent intent = getIntent();

        FirstLastNameSender names = (FirstLastNameSender) intent.getSerializableExtra("first_activity");
        if(names != null && names.first_name != null && names.last_name != null) {
            first_name = names.first_name;
            last_name = names.last_name;
            textViewFName.setText(names.first_name);
            textViewLName.setText(names.last_name);
            Log.i("first_activity", "first_activity");
        }

        SubjectSender timeSender = (SubjectSender) intent.getSerializableExtra("subjectInfo");
        if (timeSender != null) {
            ((TextView)findViewById(R.id.add_a_subject)).setText(timeSender.day + "\n" + timeSender.time + "\n" + timeSender.comment);
            showToast();
            Log.i("first_activity", "first_activity");
        }

        Button second_activity = findViewById(R.id.press_button_to_add_subject);
        second_activity.setOnClickListener(this::EnterData);
    }

    public void EnterData(View view){
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra("item", ((EditText)findViewById(R.id.add_a_subject)).getText().toString());
        intent.putExtra("first_activity", new FirstLastNameSender(first_name, last_name));
        startActivity(intent);
    }

    public void showToast() {
        String message = "Время занятия успешно передано!";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
