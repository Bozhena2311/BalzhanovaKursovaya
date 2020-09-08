package com.example.balzhanovakursovaya;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

import static com.example.balzhanovakursovaya.Vedomost.ok1;

public class ScanCode extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    public String scanned;
    int MY_PERMISSIONS_REQUEST_CAMERA=0;
    ZXingScannerView ScannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScannerView = new ZXingScannerView(this);
        setContentView(ScannerView);


    }

    @Override
    public void handleResult(Result result) {

        //Vedomost.resultTextView.setText(result.getText());
        Intent intent = new Intent();
        ok1 = result.getText();
        intent.putExtra("ok", ok1);
        setResult(RESULT_OK, intent);
        finish();
        //onBackPressed();

    }

    @Override
    protected void onPause(){
        super.onPause();

        ScannerView.stopCamera();

    }

    @Override
    protected void onResume(){
        super.onResume();
        ScannerView.setResultHandler(this);
        ScannerView.startCamera();
    }

    @Override
    protected void onPostResume(){
        super.onPostResume();
        if(ContextCompat.checkSelfPermission(getApplicationContext(),
                Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]
                    {Manifest.permission.CAMERA}, MY_PERMISSIONS_REQUEST_CAMERA);
        }
        ScannerView.setResultHandler(this);
        ScannerView.startCamera();
    }
}
