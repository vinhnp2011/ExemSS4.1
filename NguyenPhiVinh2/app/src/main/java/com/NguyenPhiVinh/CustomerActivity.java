package com.NguyenPhiVinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CustomerActivity extends AppCompatActivity {
// Button btnAdd,btnSearch;
// EditText edUsername,edEmail,edPhone;
// RadioButton rbMale,rbFemale;
// RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
//        edUsername = findViewById(R.id.edUsername);
//        edEmail = findViewById(R.id.edEmail);
//        edPhone = findViewById(R.id.edPhone);
//        btnAdd = findViewById(R.id.btnAdd);
//        btnSearch = findViewById(R.id.btnSearch);
//        rgGender = findViewById(R.id.rgGender);
//        rbMale = findViewById(R.id.rbMale);
//        rbFemale = findViewById(R.id.rbFemale);
//        btnAdd.setOnClickListener(this);
//        btnSearch.setOnClickListener(this);
    }
//
//    @Override
//    public void onClick(View v) {
//        if (v == btnAdd) {
//            onRegister();
//        }
//    }
//
//    private void onRegister() {
//        if (edUsername.getText().toString().isEmpty()) {
//            Toast.makeText(this,"Please enter Customer Name", Toast.LENGTH_LONG).show();
//            return;
//        }
//
//        if (edEmail.getText().toString().isEmpty()) {
//            Toast.makeText(this,"Please enter Email Address", Toast.LENGTH_LONG).show();
//            return;
//        }
//
//        if (edPhone.getText().toString().isEmpty()) {
//            Toast.makeText(this,"Please enter Phone Number", Toast.LENGTH_LONG).show();
//            return;
//        }
//
//        if (rgGender.getCheckedRadioButtonId() == -1){
//            Toast.makeText(this,"Please select Gender", Toast.LENGTH_LONG).show();
//            return;
//        }
//        else{
//            insert();
//        }
//    }
//    private void goSearch(){
//        Intent intent = new Intent(this,SearchActivity.class);
//        startActivity(intent);
//    }
}