package com.example.avsemananove.alemanha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.avsemananove.R;
import com.example.avsemananove.alemanha.artistas.*;

import java.util.ArrayList;

public class ArtistasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("País > Alemanha > Artistas");
        setContentView(R.layout.activity_alemanha_artistas);

        ListView lista = (ListView) findViewById(R.id.lv_alemanha_artistas);
        ArrayList<String> artistas = preencherArtistas();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, artistas);
        lista.setAdapter(arrayAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch(position) {
                    case 0:
                        Intent activity0 = new Intent(getApplicationContext(), KlausActivity.class);
                        startActivity(activity0);
                        break;
                    case 1:
                        Intent activity1 = new Intent(getApplicationContext(), HeidiActivity.class);
                        startActivity(activity1);
                        break;
                    case 2:
                        Intent activity2 = new Intent(getApplicationContext(), LudwigActivity.class);
                        startActivity(activity2);
                        break;
                }
            }
        });
    }

    private ArrayList<String> preencherArtistas() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Klaus Meine");
        dados.add("Heidi Klum");
        dados.add("Ludwig van Beethoven");

        return dados;
    }
}