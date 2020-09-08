package com.example.balzhanovakursovaya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static android.widget.Toast.makeText;


public class Vedomost extends AppCompatActivity implements View.OnClickListener {

    public static String ok1;


    public TextView tvNameST1,  tvDateReg1, tvNameST2,  tvDateReg2, tvNameST3,  tvDateReg3,
            tvNameST4,  tvDateReg4,tvNameST5,  tvDateReg5, tvNDisc, tvNGroup,
            tvNameST6,  tvDateReg6, tvNameST7,  tvDateReg7, tvNameST8,  tvDateReg8,
            tvNameST9,  tvDateReg9, tvNameST10,  tvDateReg10;

    public CheckBox ckReg1, ckReg2, ckReg3, ckReg4, ckReg5, ckReg6, ckReg7, ckReg8, ckReg9, ckReg10;

    public Button btnScan;

    public int index;

    public String[] arrayfio;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedomost);

        tvNameST1 = findViewById(R.id.tvNameST1);
        ckReg1 = findViewById(R.id.ckReg1);
        tvDateReg1 = findViewById(R.id.tvDateReg1);

        tvNameST2 = findViewById(R.id.tvNameST2);
        ckReg2 = findViewById(R.id.ckReg2);
        tvDateReg2 = findViewById(R.id.tvDateReg2);

        tvNameST3 = findViewById(R.id.tvNameST3);
        ckReg3 = findViewById(R.id.ckReg3);
        tvDateReg3 = findViewById(R.id.tvDateReg3);

        tvNameST4 = findViewById(R.id.tvNameST4);
        ckReg4 = findViewById(R.id.ckReg4);
        tvDateReg4 = findViewById(R.id.tvDateReg4);

        tvNameST5 = findViewById(R.id.tvNameST5);
        ckReg5 = findViewById(R.id.ckReg5);
        tvDateReg5 = findViewById(R.id.tvDateReg5);

        tvNameST6 = findViewById(R.id.tvNameST6);
        ckReg6 = findViewById(R.id.ckReg6);
        tvDateReg6 = findViewById(R.id.tvDateReg6);

        tvNameST7 = findViewById(R.id.tvNameST7);
        ckReg7 = findViewById(R.id.ckReg7);
        tvDateReg7 = findViewById(R.id.tvDateReg7);

        tvNameST8 = findViewById(R.id.tvNameST8);
        ckReg8 = findViewById(R.id.ckReg8);
        tvDateReg8 = findViewById(R.id.tvDateReg8);

        tvNameST9 = findViewById(R.id.tvNameST9);
        ckReg9 = findViewById(R.id.ckReg9);
        tvDateReg9 = findViewById(R.id.tvDateReg9);

        tvNameST10 = findViewById(R.id.tvNameST10);
        ckReg10 = findViewById(R.id.ckReg10);
        tvDateReg10 = findViewById(R.id.tvDateReg10);

        tvNDisc = findViewById(R.id.tvNDisc);
        tvNGroup = findViewById(R.id.tvNGroup);

        btnScan = findViewById(R.id.btnScan);

        Intent intent = getIntent();

        String nameDisc = intent.getStringExtra("NameDisc");
        String nameGroup = intent.getStringExtra("NameGroup");

        tvNDisc.setText(nameDisc);
        tvNGroup.setText(nameGroup);

        String[] PI1901 = intent.getStringArrayExtra("PI1901");
        String[] PI1902 = intent.getStringArrayExtra("PI1902");
        String[] PI1903 = intent.getStringArrayExtra("PI1903");
        String[] IT1941 = intent.getStringArrayExtra("IT1941");
        String[] BI1901 = intent.getStringArrayExtra("BI1901");
        String[] BI1701 = intent.getStringArrayExtra("BI1701");

        if (PI1901 != null) {
            tvNameST1.setText(PI1901[0]);
            tvNameST2.setText(PI1901[1]);
            tvNameST3.setText(PI1901[2]);
            tvNameST4.setText(PI1901[3]);
            tvNameST5.setText(PI1901[4]);
            tvNameST6.setText(PI1901[5]);
            tvNameST7.setText(PI1901[6]);
            tvNameST8.setText(PI1901[7]);
            tvNameST9.setText(PI1901[8]);
            tvNameST10.setText(PI1901[9]);
        }


        if (PI1902 != null) {
            tvNameST1.setText(PI1902[0]);
            tvNameST2.setText(PI1902[1]);
            tvNameST3.setText(PI1902[2]);
            tvNameST4.setText(PI1902[3]);
            tvNameST5.setText(PI1902[4]);
            tvNameST6.setText(PI1902[5]);
            tvNameST7.setText(PI1902[6]);
            tvNameST8.setText(PI1902[7]);
            tvNameST9.setText(PI1902[8]);
            tvNameST10.setText(PI1902[9]);
        }

        if (PI1903 != null) {
            tvNameST1.setText(PI1903[0]);
            tvNameST2.setText(PI1903[1]);
            tvNameST3.setText(PI1903[2]);
            tvNameST4.setText(PI1903[3]);
            tvNameST5.setText(PI1903[4]);
            tvNameST6.setText(PI1903[5]);
            tvNameST7.setText(PI1903[6]);
            tvNameST8.setText(PI1903[7]);
            tvNameST9.setText(PI1903[8]);
            tvNameST10.setText(PI1903[9]);
        }

        if (IT1941 != null) {
            tvNameST1.setText(IT1941[0]);
            tvNameST2.setText(IT1941[1]);
            tvNameST3.setText(IT1941[2]);
            tvNameST4.setText(IT1941[3]);
            tvNameST5.setText(IT1941[4]);
            tvNameST6.setText(IT1941[5]);
            tvNameST7.setText(IT1941[6]);
            tvNameST8.setText(IT1941[7]);
            tvNameST9.setText(IT1941[8]);
            tvNameST10.setText(IT1941[9]);
        }

        if (BI1901 != null) {
            tvNameST1.setText(BI1901[0]);
            tvNameST2.setText(BI1901[1]);
            tvNameST3.setText(BI1901[2]);
            tvNameST4.setText(BI1901[3]);
            tvNameST5.setText(BI1901[4]);
            tvNameST6.setText(BI1901[5]);
            tvNameST7.setText(BI1901[6]);
            tvNameST8.setText(BI1901[7]);
            tvNameST9.setText(BI1901[8]);
            tvNameST10.setText(BI1901[9]);
        }

        if (BI1701 != null) {
            tvNameST1.setText(BI1701[0]);
            tvNameST2.setText(BI1701[1]);
            tvNameST3.setText(BI1701[2]);
            tvNameST4.setText(BI1701[3]);
            tvNameST5.setText(BI1701[4]);
            tvNameST6.setText(BI1701[5]);
            tvNameST7.setText(BI1701[6]);
            tvNameST8.setText(BI1701[7]);
            tvNameST9.setText(BI1701[8]);
            tvNameST10.setText(BI1701[9]);
        }

        //String scanresult = resultTextView.getText().toString();

        arrayfio = new String[]{
                tvNameST1.getText().toString(),
                tvNameST2.getText().toString(),
                tvNameST3.getText().toString(),
                tvNameST4.getText().toString(),
                tvNameST5.getText().toString(),
                tvNameST6.getText().toString(),
                tvNameST7.getText().toString(),
                tvNameST8.getText().toString(),
                tvNameST9.getText().toString(),
                tvNameST10.getText().toString(),
        };

        btnScan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, ScanCode.class);
        startActivityForResult(intent, 1);
    }

    @Override
    public void onActivityResult ( int requestCode, int resultCode, Intent data) {

        if (data != null) {
            String ok = data.getStringExtra("ok");
            for (int i = 0; i <= 9; i++) {
                if (arrayfio[i].equals(ok)) {
                    index = i;
                    makeText(this, arrayfio[index], Toast.LENGTH_SHORT).show();
                    continue;
                }
            }
        }
        switch (index) {
            case 0: {
                ckReg1.setChecked(true);
                String date = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).
                        format(new Date());
                tvDateReg1.setText(date.toString());
            }
            break;
            case 1: {
                ckReg2.setChecked(true);
                String date = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).
                        format(new Date());
                tvDateReg2.setText(date.toString());
            }
            break;
            case 2: {
                ckReg3.setChecked(true);
                String date = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).
                        format(new Date());
                tvDateReg3.setText(date.toString());
            }
            break;
            case 3: {
                ckReg4.setChecked(true);
                String date = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).
                        format(new Date());
                tvDateReg4.setText(date.toString());
            }
            break;
            case 4: {
                ckReg5.setChecked(true);
                String date = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).
                        format(new Date());
                tvDateReg5.setText(date.toString());
            }
            break;
            case 5: {
                ckReg6.setChecked(true);
                String date = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).
                        format(new Date());
                tvDateReg6.setText(date.toString());
            }
            break;
            case 6: {
                ckReg7.setChecked(true);
                String date = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).
                        format(new Date());
                tvDateReg7.setText(date.toString());
            }
            break;
            case 7: {
                ckReg8.setChecked(true);
                String date = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).
                        format(new Date());
                tvDateReg8.setText(date.toString());
            }
            break;
            case 8: {
                ckReg9.setChecked(true);
                String date = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).
                        format(new Date());
                tvDateReg9.setText(date.toString());

            }
            break;
            case 9: {
                ckReg10.setChecked(true);
                String date = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).
                        format(new Date());
                tvDateReg10.setText(date.toString());
            }
            break;
        }


    }
}
