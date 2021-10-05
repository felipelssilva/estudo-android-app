package com.example.avsemananove.uruguai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.avsemananove.R;
import com.example.avsemananove.uruguai.artistas.*;

import java.util.ArrayList;

public class ArtistasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("País > Uruguai > Artistas");
        setContentView(R.layout.activity_uruguai_artistas);

        ListView lista = (ListView) findViewById(R.id.lv_uruguai_artistas);
        ArrayList<String> artistas = preencherArtistas();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, artistas);
        lista.setAdapter(arrayAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch(position) {
                    case 0:  Intent takashiActivity = new Intent(getApplicationContext(), TakashiActivity.class);
                        startActivity(takashiActivity);
                        break;
                    case 1:  Intent YayoiActivity = new Intent(getApplicationContext(), YayoiActivity.class);
                        startActivity(YayoiActivity);
                        break;
                    case 2:  Intent RiusukeActivity = new Intent(getApplicationContext(), RiusukeActivity.class);
                        startActivity(RiusukeActivity);
                        break;
                }
            }
        });
    }

    private ArrayList<String> preencherArtistas() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Takashi Murakami");
        dados.add("Yayoi Kusama");
        dados.add("Riusuke Fukahori");

        return dados;
    }
}