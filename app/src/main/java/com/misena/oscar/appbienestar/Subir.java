package com.misena.oscar.appbienestar;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Subir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subir);
    }


    public  void subir(View v){
        final AlertDialog.Builder dialogo=new AlertDialog.Builder(Subir.this);
        dialogo.setMessage("Acceso para Administrador");
        dialogo.setTitle("Administrador");

        final  EditText admin=new EditText((Subir.this));
        final  EditText password=new EditText((Subir.this));
        LinearLayout linearL =new LinearLayout(Subir.this);
        linearL.setOrientation(LinearLayout.VERTICAL);

        admin.setHint("Administrador");
        password.setHint("Contraseña");
        password.setInputType(InputType.TYPE_TEXT_VARIATION_WEB_PASSWORD);
        linearL.addView(admin);
        linearL.addView(password);
        dialogo.setView(linearL);

        dialogo.setNeutralButton("Entrar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                if (admin.getText().toString().isEmpty() && password.getText().toString().isEmpty()){
                    Toast.makeText(Subir.this, "Los Campos Estan Vacios", Toast.LENGTH_SHORT).show();
                }else if(admin.getText().toString().equals("admin") && password.getText().toString().equals("123")){
                    Intent in =new Intent(Subir.this,Actividades.class);
                    startActivity(in);
                    finish();
                }else{
                    Toast.makeText(Subir.this, "Usted no es administrador.", Toast.LENGTH_SHORT).show();
                }
            }

        });

        dialogo.create();
        dialogo.show();
    }
    }