package com.example.avsemananove.italia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.avsemananove.R;
import com.example.avsemananove.italia.artistas.*;

import java.util.ArrayList;

public class ArtistasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("País > Itália > Artistas");
        setContentView(R.layout.activity_italia_artistas);

        ListView lista = (ListView) findViewById(R.id.lv_italia_artistas);
        ArrayList<String> artistas = preencherArtistas();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, artistas);
        lista.setAdapter(arrayAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch(position) {
                    case 0:
                        Intent activity0 = new Intent(getApplicationContext(), SophiaActivity.class);
                        startActivity(activity0);
                        break;
                    case 1:
                        Intent activity1 = new Intent(getApplicationContext(), MichelangeloActivity.class);
                        startActivity(activity1);
                        break;
                    case 2:
                        Intent activity2 = new Intent(getApplicationContext(), LauraActivity.class);
                        startActivity(activity2);
                        break;
                }
            }
        });
    }

    private ArrayList<String> preencherArtistas() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Sophia Loren");
        dados.add("Michelangelo di Lodovico Buonarroti Simoni");
        dados.add("Laura Pausini");

        return dados;
    }
}