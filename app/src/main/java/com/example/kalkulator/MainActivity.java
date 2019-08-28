package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText vTxA, vTxB, vTxC;
    protected Float yTxA, yTxB, yTxC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vTxA = (EditText) findViewById(R.id.txtA);
        vTxB = (EditText) findViewById(R.id.txtB);
        vTxC = (EditText) findViewById(R.id.txtC);

        Button vBtnTambah = (Button) findViewById(R.id.btnTambah);
        Button vBtnKurang = (Button) findViewById(R.id.btnKurang);
        Button vBtnKali = (Button) findViewById(R.id.btnKali);
        Button vBtnBagi = (Button) findViewById(R.id.btnBagi);

        vBtnTambah.setOnClickListener(this);
        vBtnKali.setOnClickListener(this);
        vBtnBagi.setOnClickListener(this);
        vBtnKurang.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        yTxA = Float.parseFloat(vTxA.getText().toString());
        yTxB = Float.parseFloat(vTxB.getText().toString());

        switch (v.getId()){
            case R.id.btnTambah:
                yTxC = yTxA + yTxB;
                vTxC.setText(Float.toString(yTxC));
                break;

            case R.id.btnKurang:
                yTxC = yTxA - yTxB;
                vTxC.setText(Float.toString(yTxC));
                break;

            case R.id.btnKali:
                yTxC = yTxA * yTxB;
                vTxC.setText(Float.toString(yTxC));
                break;

            case R.id.btnBagi:
                yTxC = yTxA / yTxB;
                vTxC.setText(Float.toString(yTxC));
                break;
        }
    }

}
