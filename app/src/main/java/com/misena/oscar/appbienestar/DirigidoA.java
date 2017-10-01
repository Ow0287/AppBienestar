package com.misena.oscar.appbienestar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DirigidoA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dirigido);
    }
    public void informacion(View view){
        Intent i =new Intent(DirigidoA.this,Informacion.class);
        startActivity(i);

    }
    public void dirigidoa(View view){
        Intent i =new Intent(DirigidoA.this,DirigidoA.class);
        startActivity(i);

    }
    public void lugar(View view){
        Intent i =new Intent(DirigidoA.this,Lugar.class);
        startActivity(i);

    }
}
