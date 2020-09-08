package com.example.balzhanovakursovaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import Database.UserDao;
import Database.UserDatabase;
import Models.User;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button btnRegister;
    private EditText etLogin;
    private EditText etPassword;
    private UserDatabase database;

    private UserDao userDao;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Проверка правильности ввода...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setProgress(0);

        database = Room.databaseBuilder(this, UserDatabase.class, "mydatabase.db")
                .allowMainThreadQueries()
                .build();

        userDao = database.getUserDao();

        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        etLogin = findViewById(R.id.etLogin);
        etPassword = findViewById(R.id.etPassword);

        TextView tvName = (TextView) findViewById(R.id.tvName);
        tvName.setText("Регистрация курсовых работ по qr-code");
        btnLogin.setText("Войти");
        btnRegister.setText("Регистрация");

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegistrActivity.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!emptyValidation()) {
                    progressDialog.show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            User user = userDao.getUser(etLogin.getText().toString(), etPassword.getText().toString());
                            if(user!=null){
                                Intent i = new Intent (LoginActivity.this, Groups_Activity.class);
                                i.putExtra("User", user);
                                startActivity(i);
                                finish();
                            }else {
                                Toast.makeText(LoginActivity.this, "Проверьте логин и пароль на правильность ввода", Toast.LENGTH_LONG).show();
                            }
                            progressDialog.dismiss();
                        }
                    }, 1000);
                    }else {
                    Toast.makeText(LoginActivity.this, "Заполните поля логин и пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean emptyValidation(){
        if (TextUtils.isEmpty(etLogin.getText().toString()) || TextUtils.isEmpty(etPassword.getText().toString())){
            return true;
        }else{
            return false;
        }
    }
}
