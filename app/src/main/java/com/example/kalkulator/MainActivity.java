package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.drm.DrmStore;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView hasil;
    Button btn7,btn8,btn9,btntambah,btn4,btn5,btn6,btnkurang,btn1,btn2,btn3,btnkali,btn0,btntitik,btnsamadengan,btnbagi;

    public static double nilai=0;
    public static String operasi="";
    public static double hasi1=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    void init() {

        hasil = (TextView) findViewById(R.id.hsl);

        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(this);

        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(this);

        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(this);

        btntambah = (Button) findViewById(R.id.btntambah);
        btntambah.setOnClickListener(this);

        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);

        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);

        btnkurang = (Button) findViewById(R.id.btnkurang);
        btnkurang.setOnClickListener(this);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        btnkali = (Button) findViewById(R.id.btnkali);
        btnkali.setOnClickListener(this);

        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(this);

        btntitik = (Button) findViewById(R.id.btntitik);
        btntitik.setOnClickListener(this);

        btnsamadengan = (Button) findViewById(R.id.btnsamadengan);
        btnsamadengan.setOnClickListener(this);

        btnbagi = (Button) findViewById(R.id.btnbagi);
        btnbagi.setOnClickListener(this);

    }
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn1:
                        hasil.setText(hasil.getText().toString().trim() + "1");
                        break;

                    case R.id.btn2:
                        hasil.setText(hasil.getText().toString().trim() + "2");
                        break;

                    case R.id.btn3:
                        hasil.setText(hasil.getText().toString().trim() + "3");
                        break;

                    case R.id.btn4:
                        hasil.setText(hasil.getText().toString().trim() + "4");
                        break;

                    case R.id.btn5:
                        hasil.setText(hasil.getText().toString().trim() + "5");
                        break;

                    case R.id.btn6:
                        hasil.setText(hasil.getText().toString().trim() + "6");
                        break;

                    case R.id.btn7:
                        hasil.setText(hasil.getText().toString().trim() + "7");
                        break;

                    case R.id.btn8:
                        hasil.setText(hasil.getText().toString().trim() + "8");
                        break;

                    case R.id.btn9:
                        hasil.setText(hasil.getText().toString().trim() + "9");
                        break;

                    case R.id.btn0:
                        hasil.setText(hasil.getText().toString().trim() + "0");
                        break;

                    case R.id.btntitik:
                        hasil.setText(".");
                        break;

                    case R.id.btntambah:
                        operasi = "tambah";
                        nilai = Double.parseDouble(hasil.getText().toString());
                        hasil.setText(" ");
                        break;

                    case R.id.btnkurang:
                        operasi = "kurang";
                        nilai = Double.parseDouble(hasil.getText().toString());
                        hasil.setText(" ");
                        break;
                    case R.id.btnkali:
                        operasi = "kali";
                        nilai = Double.parseDouble(hasil.getText().toString());
                        hasil.setText(" ");
                        break;
                    case R.id.btnbagi:
                        operasi = "bagi";
                        nilai = Double.parseDouble(hasil.getText().toString());
                        hasil.setText(" ");
                        break;

                    case R.id.btnsamadengan:

                        if (operasi.equals("tambah")){
                            hasi1 = nilai+Double.parseDouble(hasil.getText().toString().trim());
                        }

                        if (operasi.equals("Kurang")){
                            hasi1 = nilai-Double.parseDouble(hasil.getText().toString().trim());
                        }
                        if (operasi.equals("kali")){
                            hasi1 = nilai*Double.parseDouble(hasil.getText().toString().trim());
                        }
                        if (operasi.equals("bagi")){
                            hasi1 = nilai/Double.parseDouble(hasil.getText().toString().trim());
                        }

                        int nilaitemp = (int) hasi1;

                        if (nilaitemp == hasi1) {
                            hasil.setText(String.valueOf((int)hasi1));
                        }else {
                            hasil.setText(String.valueOf(hasi1));
                        }


                        break;

                }
    }
}
