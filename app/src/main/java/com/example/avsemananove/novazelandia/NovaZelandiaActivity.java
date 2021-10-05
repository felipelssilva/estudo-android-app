package com.example.avsemananove.novazelandia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.avsemananove.R;
import com.example.avsemananove.novazelandia.*;

public class NovaZelandiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_zelandia);
        setTitle("País > Nova Zelândia");
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