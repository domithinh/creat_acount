package com.example.creat_acount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText tenclient, tenid, password, sdtemail;

    Button dangky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tenclient = findViewById(R.id.txt_tenclient);
        tenid = findViewById(R.id.txt_tenid);
        password = findViewById(R.id.txt_password);
        sdtemail = findViewById(R.id.txt_sdtemail);
        dangky = findViewById(R.id.btn_back);

        dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String accountname = tenclient.getText().toString();
                String accountid = tenid.getText().toString();
                String matkhau = password.getText().toString();
                String sdtmail = sdtemail.getText().toString();
                if(accountname.isEmpty() || accountid.isEmpty() || matkhau.isEmpty() || sdtmail.isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Không được để trống thông tin!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Bundle bundle = new Bundle();

                    bundle.putString("accoutname", accountname);
                    bundle.putString("accountid", accountid);
                    bundle.putString("matkhau", matkhau);
                    bundle.putString("sdtmail", sdtmail);

                    Intent intent = new Intent(MainActivity.this, information_client.class);

                    intent.putExtras(bundle);
                    startActivity(intent);
                    tenclient.setText("");
                    tenid.setText("");
                    password.setText("");
                    sdtemail.setText("");
                }
            }
        });
    }
}