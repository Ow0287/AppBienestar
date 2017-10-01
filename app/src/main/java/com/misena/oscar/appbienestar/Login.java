package com.misena.oscar.appbienestar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
EditText correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        correo= (EditText) findViewById(R.id.edt_coreo);
    }
    public void registrarse(View view){
        if (correo.getText().toString().isEmpty()){
            Toast.makeText(this, "Los Campos Estan Vacios", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Login.this,Home.class);
        startActivity(intent);
        finish();
        }
    }
}
