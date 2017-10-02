package com.misena.oscar.appbienestar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Administrador extends AppCompatActivity {

    EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);
        user=(EditText)findViewById(R.id.edt_user);
        pass=(EditText)findViewById(R.id.edt_pass);
    }
    public  void validarAdmin(View view){

        if (user.getText().toString().isEmpty() && pass.getText().toString().isEmpty()){

            Toast.makeText(this, "Debe LLenar Los Campos", Toast.LENGTH_SHORT).show();

        }else if (user.getText().toString().equals("admin") &&  pass.getText().toString().equals("123")){
            Toast.makeText(this, "Bienvenido Administrador", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Administrador.this,Subir.class);
            startActivity(intent);
            finish();
        }
    }
}
