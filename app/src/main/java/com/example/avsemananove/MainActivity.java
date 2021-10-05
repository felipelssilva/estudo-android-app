package com.example.avsemananove;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.avsemananove.alemanha.AlemanhaActivity;
import com.example.avsemananove.argentina.ArgentinaActivity;
import com.example.avsemananove.italia.ItaliaActivity;
import com.example.avsemananove.canada.CanadaActivity;
import com.example.avsemananove.china.ChinaActivity;
import com.example.avsemananove.india.IndiaActivity;
import com.example.avsemananove.japao.ArtistasActivity;
import com.example.avsemananove.japao.JapaoActivity;
import com.example.avsemananove.japao.artistas.RiusukeActivity;
import com.example.avsemananove.japao.artistas.TakashiActivity;
import com.example.avsemananove.japao.artistas.YayoiActivity;
import com.example.avsemananove.novazelandia.NovaZelandiaActivity;
import com.example.avsemananove.russia.RussiaActivity;
import com.example.avsemananove.uruguai.UruguaiActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.lv_paises);
        ArrayList<String> paises = preencherPaises();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        lista.setAdapter(arrayAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch(position) {

                    case 0:
                        Intent intentAlemanha = new Intent(getApplicationContext(), AlemanhaActivity.class);
                        startActivity(intentAlemanha);
                        break;

                    case 1:
                        Intent intentArgentina = new Intent(getApplicationContext(), ArgentinaActivity.class);
                        startActivity(intentArgentina);
                        break;

                    case 2:
                        Intent intentItalia = new Intent(getApplicationContext(), ItaliaActivity.class);
                        startActivity(intentItalia);
                        break;

                }
            }
        });
    }

    private ArrayList<String> preencherPaises() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Alemanha");
        dados.add("Argentina");
        dados.add("Itália");
        dados.add("Canadá");
        dados.add("China");
        dados.add("Índia");
        dados.add("Japão");
        dados.add("Nova Zelândia");
        dados.add("Rússia");
        dados.add("Uruguai");

        return dados;
    }
}























                        /*
                    case 3:
                        Intent intentCanada = new Intent(getApplicationContext(), CanadaActivity.class);
                        startActivity(intentCanada);
                        break;

                    case 4:
                        Intent intentChina = new Intent(getApplicationContext(), ChinaActivity.class);
                        startActivity(intentChina);
                        break;

                    case 5:
                        Intent intentIndia = new Intent(getApplicationContext(), IndiaActivity.class);
                        startActivity(intentIndia);
                        break;

                    case 6:
                        Intent intentJapao = new Intent(getApplicationContext(), JapaoActivity.class);
                        startActivity(intentJapao);
                        break;

                    case 7:
                        Intent intentNovaZelandia = new Intent(getApplicationContext(), NovaZelandiaActivity.class);
                        startActivity(intentNovaZelandia);
                        break;

                    case 8:
                        Intent intentRussia = new Intent(getApplicationContext(), RussiaActivity.class);
                        startActivity(intentRussia);
                        break;

                    case 9:
                        Intent intentUruguai = new Intent(getApplicationContext(), UruguaiActivity.class);
                        startActivity(intentUruguai);
                        break;

                         */