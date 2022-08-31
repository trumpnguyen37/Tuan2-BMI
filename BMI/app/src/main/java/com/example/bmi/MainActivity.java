package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etChieuCao, etCanNang;
    RadioButton rbNam,rbNu;
    Button btnTinhBMI;
    TextView txtChiSo,txtNhanXet;
    double chiSo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etChieuCao = findViewById(R.id.et_chieucao);
        etCanNang = findViewById(R.id.et_cannang);
        rbNam = findViewById(R.id.rb_nam);
        rbNu = findViewById(R.id.rb_nu);
        btnTinhBMI = findViewById(R.id.btn_tinh);
        txtChiSo = findViewById(R.id.txt_ketqua);
        txtNhanXet = findViewById(R.id.txt_nhanxet);

        btnTinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double chieuCao = Double.parseDouble(etChieuCao.getText().toString()) / 100;
                double canNang = Double.parseDouble(etCanNang.getText().toString()) ;
                chiSo = Math.round((canNang/Math.pow(chieuCao,2))*10.0)/10.0;
                if (rbNam.isChecked()){
                    if(chiSo < 18 ){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Người gầy");
                    }
                    else if(chiSo >= 18 && chiSo <= 24.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Người bình thường");
                    }
                    else if(chiSo >= 25 && chiSo <=29.9 ){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Người béo phì độ I");
                    }
                    else if(chiSo >= 30 && chiSo <=34.9 ){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Người béo phì độ II");
                    }
                    else if(chiSo >= 35 ){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Người béo phì độ III");
                    }
                }
                else if (rbNu.isChecked()){
                    if(chiSo < 18 ){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Người gầy");
                    }
                    else if(chiSo >= 18 && chiSo <= 24.9){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Người bình thường");
                    }
                    else if(chiSo >= 25 && chiSo <=29.9 ){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Người béo phì độ I");
                    }
                    else if(chiSo >= 30 && chiSo <=34.9 ){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Người béo phì độ II");
                    }
                    else if(chiSo >= 35 ){
                        txtChiSo.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Người béo phì độ III");
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "Vui lòng chọn giới tính!",
                        Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}