package com.example.creat_acount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class information_client extends AppCompatActivity {

    TextView ten, tenid, mkhau, sdtmail;
    Button back, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_client);
        ten = findViewById(R.id.txt_accountname);
        tenid = findViewById(R.id.txt_accountid);
        mkhau = findViewById(R.id.txt_mkhau);
        sdtmail = findViewById(R.id.txt_sdemail);
        back = findViewById(R.id.btn_back);
        exit = findViewById(R.id.btn_exit);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String tenclient = bundle.getString("accoutname");
            String tendnhap = bundle.getString("accountid");
            String matkhau = bundle.getString("matkhau");
            String SDTemai = bundle.getString("sdtmail");

            ten.setText(tenclient);
            tenid.setText(tendnhap);
            mkhau.setText(matkhau);
            sdtmail.setText(SDTemai);
        } else {
            ten.setText("unknown");
            tenid.setText("unknown");
            mkhau.setText("unknown");
            sdtmail.setText("unknown");
            Toast.makeText(getApplicationContext(), "Không có dữ liệu nào để hiển thị", Toast.LENGTH_SHORT).show();
        }

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(0);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}