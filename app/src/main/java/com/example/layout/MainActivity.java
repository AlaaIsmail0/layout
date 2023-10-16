package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtHobbies;
    private Button btnSave;
    private EditText edtHobbies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHobbies = findViewById(R.id.txtHobbies);
        btnSave = findViewById(R.id.btnSave);
        edtHobbies = findViewById(R.id.edtHobbies);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edtHobbies.getText().toString();
                if(!str.isEmpty()){
                    txtHobbies.setText(str);
                    txtHobbies.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}