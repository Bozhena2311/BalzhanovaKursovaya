package com.example.balzhanovakursovaya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvDescript = (TextView) findViewById(R.id.tvDescript);
        tvDescript.setText("Добро пожаловать в приложение \n\"РЕГИСТРАЦИЯ КУРСОВЫХ РАБОТ ПО QR-CODE\", " +
                "которое разработала студентка группы ПИ1722 Бальжанова Божена");

        Button btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setText("Старт");

    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.btnStart:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
        }
    }


}
