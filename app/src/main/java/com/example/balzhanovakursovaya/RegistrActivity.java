package com.example.balzhanovakursovaya;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import Database.UserDao;
import Database.UserDatabase;
import Models.User;

public class RegistrActivity extends AppCompatActivity {

    private EditText etName;
    private EditText etLogin;
    private EditText etPassword;

    private Button btnCancel;
    private Button btnRegister;

    private ProgressDialog progressDialog;
    private UserDao userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr);

        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Регистрация...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setProgress(0);

        etName = findViewById(R.id.etName);
        etLogin = findViewById(R.id.etLogin);
        etPassword = findViewById(R.id.etPassword);

        btnCancel = findViewById(R.id.btnCancel);
        btnRegister =findViewById(R.id.btnRegister);
        btnCancel.setText("Отмена");
        btnRegister.setText("Регистрация");

        userDao = Room.databaseBuilder(this, UserDatabase.class, "mydatabase.db")
                .allowMainThreadQueries()
                .build()
                .getUserDao();

        btnCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RegistrActivity.this, LoginActivity.class));
                finish();
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isEmpty()) {

                    progressDialog.show();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            User user = new User(etName.getText().toString(), etLogin.getText().toString(), etPassword.getText().toString());
                            userDao.insert(user);
                            progressDialog.dismiss();
                            startActivity(new Intent(RegistrActivity.this, LoginActivity.class));
                        }
                    }, 1000);
                }else {
                    Toast.makeText(RegistrActivity.this, "Заполните пустые поля", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isEmpty(){
        if (TextUtils.isEmpty(etName.getText().toString()) ||
        TextUtils.isEmpty(etLogin.getText().toString()) ||
        TextUtils.isEmpty(etPassword.getText().toString())
        ) {
            return true;
        }else{
            return false;
        }
    }
}
