package com.example.balzhanovakursovaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import Models.User;

public class Groups_Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvNameKaf;
    private User user;

    TextView tvNameDisc1, tvTipSdachi1, tvNameGroup1, tvNomerVed1, tvOperatchi1,
            tvTipSdachi11, tvNameGroup11, tvNomerVed11, tvOperatchi11,
            tvTipSdachi12, tvNameGroup12, tvNomerVed12, tvOperatchi12,
            tvTipSdachi13, tvNameGroup13, tvNomerVed13, tvOperatchi13,
            tvNameDisc2, tvTipSdachi2, tvNameGroup2, tvNomerVed2, tvOperatchi2,
            tvTipSdachi21, tvNameGroup21, tvNomerVed21, tvOperatchi21,
            tvNameDisc3, tvTipSdachi3, tvNameGroup3, tvNomerVed3, tvOperatchi3,
            tvTipSdachi31, tvNameGroup31, tvNomerVed31, tvOperatchi31,
            tvNameDisc4, tvTipSdachi4, tvNameGroup4, tvNomerVed4, tvOperatchi4,
            tvTipSdachi41, tvNameGroup41, tvNomerVed41, tvOperatchi41;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);

        user = (User) getIntent().getSerializableExtra("User");


        tvNameKaf = findViewById(R.id.tvNameKaf);

        if (user != null) {
            tvNameKaf.setText(user.getName());
        }

        tvNameDisc1 = findViewById(R.id.tvNameDisc1);
        tvTipSdachi1 = findViewById(R.id.tvTipSdachi1);
        tvNameGroup1 = findViewById(R.id.tvNameGroup1);
        tvNomerVed1 = findViewById(R.id.tvNomerVed1);
        tvOperatchi1 = findViewById(R.id.tvOperatchi1);

        tvTipSdachi11 = findViewById(R.id.tvTipSdachi11);
        tvNameGroup11 = findViewById(R.id.tvNameGroup11);
        tvNomerVed11 = findViewById(R.id.tvNomerVed11);
        tvOperatchi11 = findViewById(R.id.tvOperatchi11);

        tvTipSdachi12 = findViewById(R.id.tvTipSdachi12);
        tvNameGroup12 = findViewById(R.id.tvNameGroup12);
        tvNomerVed12 = findViewById(R.id.tvNomerVed12);
        tvOperatchi12 = findViewById(R.id.tvOperatchi12);

        tvTipSdachi13 = findViewById(R.id.tvTipSdachi13);
        tvNameGroup13 = findViewById(R.id.tvNameGroup13);
        tvNomerVed13 = findViewById(R.id.tvNomerVed13);
        tvOperatchi13 = findViewById(R.id.tvOperatchi13);


        tvNameDisc2 = findViewById(R.id.tvNameDisc2);
        tvTipSdachi2 = findViewById(R.id.tvTipSdachi2);
        tvNameGroup2 = findViewById(R.id.tvNameGroup2);
        tvNomerVed2 = findViewById(R.id.tvNomerVed2);
        tvOperatchi2 = findViewById(R.id.tvOperatchi2);

        tvTipSdachi21 = findViewById(R.id.tvTipSdachi21);
        tvNameGroup21 = findViewById(R.id.tvNameGroup21);
        tvNomerVed21 = findViewById(R.id.tvNomerVed21);
        tvOperatchi21 = findViewById(R.id.tvOperatchi21);


        tvNameDisc3 = findViewById(R.id.tvNameDisc3);
        tvTipSdachi3 = findViewById(R.id.tvTipSdachi3);
        tvNameGroup3 = findViewById(R.id.tvNameGroup3);
        tvNomerVed3 = findViewById(R.id.tvNomerVed3);
        tvOperatchi3 = findViewById(R.id.tvOperatchi3);

        tvTipSdachi31 = findViewById(R.id.tvTipSdachi31);
        tvNameGroup31 = findViewById(R.id.tvNameGroup31);
        tvNomerVed31 = findViewById(R.id.tvNomerVed31);
        tvOperatchi31 = findViewById(R.id.tvOperatchi31);


        tvNameDisc4 = findViewById(R.id.tvNameDisc4);
        tvTipSdachi4 = findViewById(R.id.tvTipSdachi4);
        tvNameGroup4 = findViewById(R.id.tvNameGroup4);
        tvNomerVed4 = findViewById(R.id.tvNomerVed4);
        tvOperatchi4 = findViewById(R.id.tvOperatchi4);

        tvTipSdachi41 = findViewById(R.id.tvTipSdachi41);
        tvNameGroup41 = findViewById(R.id.tvNameGroup41);
        tvNomerVed41 = findViewById(R.id.tvNomerVed41);
        tvOperatchi41 = findViewById(R.id.tvOperatchi41);

    }

    @Override
    public void onClick(View v) {
        Resources res = getResources();
        String[] PI1901 = res.getStringArray(R.array.PI1901);
        Intent intent1 = new Intent(Groups_Activity.this, Vedomost.class);
        intent1.putExtra("PI1901", PI1901);
        intent1.putExtra("NameDisc", tvNameDisc1.getText().toString());
        intent1.putExtra("NameGroup", tvNameGroup11.getText().toString());
        startActivity(intent1);
    }

    public void onClick1(View v) {
        Resources res = getResources();
        String[] PI1902 = res.getStringArray(R.array.PI1902);
        Intent intent2 = new Intent(Groups_Activity.this, Vedomost.class);
        intent2.putExtra("PI1902", PI1902);
        intent2.putExtra("NameDisc", tvNameDisc1.getText().toString());
        intent2.putExtra("NameGroup", tvNameGroup12.getText().toString());
        startActivity(intent2);

    }

    public void onClick2(View v) {
        Resources res = getResources();
        String [] PI1903 = res.getStringArray(R.array.PI1903);
        Intent intent = new Intent(Groups_Activity.this, Vedomost.class);
        intent.putExtra("PI1903", PI1903);
        intent.putExtra("NameDisc", tvNameDisc1.getText().toString());
        intent.putExtra("NameGroup", tvNameGroup13.getText().toString());
        startActivity(intent);
    }

        public void onClick3(View v){
            Resources res = getResources();
            String [] IT1941 = res.getStringArray(R.array.IT1941);
            Intent intent = new Intent(Groups_Activity.this, Vedomost.class);
            intent.putExtra("IT1941", IT1941);
            intent.putExtra("NameDisc", tvNameDisc2.getText().toString());
            intent.putExtra("NameGroup", tvNameGroup21.getText().toString());
            startActivity(intent);
        }

    public void onClick4(View v){
        Resources res = getResources();
        String [] BI1901 = res.getStringArray(R.array.BI1901);
        Intent intent = new Intent(Groups_Activity.this, Vedomost.class);
        intent.putExtra("BI1901", BI1901);
        intent.putExtra("NameDisc", tvNameDisc3.getText().toString());
        intent.putExtra("NameGroup", tvNameGroup31.getText().toString());
        startActivity(intent);
    }

    public void onClick5(View v){
        Resources res = getResources();
        String [] BI1701 = res.getStringArray(R.array.BI1701);
        Intent intent = new Intent(Groups_Activity.this, Vedomost.class);
        intent.putExtra("BI1701", BI1701);
        intent.putExtra("NameDisc", tvNameDisc4.getText().toString());
        intent.putExtra("NameGroup", tvNameGroup41.getText().toString());
        startActivity(intent);
    }



}



