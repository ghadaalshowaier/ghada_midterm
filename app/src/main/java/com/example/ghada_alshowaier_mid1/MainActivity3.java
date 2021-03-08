package com.example.ghada_alshowaier_mid1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity3 extends AppCompatActivity {

    TextView result;
    RadioButton female;
    RadioButton student;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button done = (Button) findViewById(R.id.button4);
        name = (EditText) findViewById(R.id.editTextTextPersonName);
        result = ((TextView)findViewById(R.id.textView4));
        female = (RadioButton) findViewById(R.id.radioButton);
        student = (RadioButton) findViewById(R.id.radioButton3);
        Button date = (Button) findViewById(R.id.button3);


        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(MainActivity3.this, d, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        Button go2act3 = (Button) findViewById(R.id.button6);
        go2act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this, MainActivity4.class));
            }
        });


    }

    Calendar c = Calendar.getInstance();
    DateFormat ddd = DateFormat.getDateInstance();

    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

            c.set(Calendar.YEAR, year);
            c.set(Calendar.MONTH, month);
            c.set(Calendar.DAY_OF_MONTH, dayOfMonth);

//            result.setText("Your reservation is on " +fmtDate.format(c.getTime()));

            if(student.isChecked()){
                if(female.isChecked()){
                    result.setText("Hi Ms " + name.getText() + " You are "+ ddd.format(c.getTime()) +" years old ");
                }
                else {
                    result.setText("Hi Mr " + name.getText() + " You are " + ddd.format(c.getTime()) + " years old ");
                }

            }
            else{
                result.setText("Hi prof " + name.getText() + " You are "+ ddd.format(c.getTime()) +" years old ");
            }


        }
    };
}