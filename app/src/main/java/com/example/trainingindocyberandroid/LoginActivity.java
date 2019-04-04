package com.example.trainingindocyberandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btn_login;
    EditText username, password;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = (Button) findViewById(R.id.login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);


        //SetClickOnlistener berfungsi untuk memberi aksi
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username.getText().toString().equals("") && password.getText().toString().equals("")) {
                    Toast.makeText(LoginActivity.this, "Harap Isi Username dan Password", Toast.LENGTH_SHORT).show();

                } else {
                    //untuk pindah halaman
                    startActivity(new Intent(LoginActivity.this,RegisterActivity.class));

                    //destroy aplikasi
                    finish();

                    //bikin toast (massagebox)
                    Toast.makeText(LoginActivity.this, "Selamat Anda Berhasil Login", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }


}
