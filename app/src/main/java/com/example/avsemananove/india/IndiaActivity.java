package com.example.avsemananove.india;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.avsemananove.R;
import com.example.avsemananove.india.*;

public class IndiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india);
        setTitle("País > Índia");
    }

    public void btnAbrirSobrePais(View view) {
        Intent intent = new Intent(getApplicationContext(), SobrePaisActivity.class);
        startActivity(intent);
    }

    public void btnAbrirLugares(View view) {
        Intent intent = new Intent(getApplicationContext(), LugaresActivity.class);
        startActivity(intent);
    }

    public void btnAbrirArtistas(View view) {
        Intent intent = new Intent(getApplicationContext(), ArtistasActivity.class);
        startActivity(intent);
    }
}