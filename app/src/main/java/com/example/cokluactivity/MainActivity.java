package com.example.cokluactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cokluactivity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void digerActivity(View view){
        String adiSoyadi = binding.editTextTextAdiSoyadi.getText().toString();
        String telefonNo = binding.editTextTelefon.getText().toString();
        Intent intent = new Intent(MainActivity.this,BilgiActivity.class);
        intent.putExtra("adiSoyadiKey",adiSoyadi);
        intent.putExtra("telefonNoKey",telefonNo);
        startActivity(intent);
    }
}