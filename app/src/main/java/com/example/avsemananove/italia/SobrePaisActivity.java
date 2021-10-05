package com.example.avsemananove.italia;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.avsemananove.R;

import java.util.ArrayList;

public class SobrePaisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("País > Itália > Sobre");
        setContentView(R.layout.activity_italia_sobre_pais);

        ListView lista = (ListView) findViewById(R.id.lv_italia_detalhes);
        ArrayList<String> detalhes = preencherDetalhes();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, detalhes);
        lista.setAdapter(arrayAdapter);
    }

    private ArrayList<String> preencherDetalhes() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Presidente: Sergio Mattarella");
        dados.add("Língua Nativa: Italiano");
        dados.add("Continente: Europa");
        dados.add("Distância do Brasil: 9.064 Km");
        dados.add("Moeda: Euro");
        dados.add("Área territorial: 301.338 km²");
        dados.add("População: 60.665.551 hab.");
        dados.add("Capital: Roma");
        dados.add("Fuso horário: UTC +2");

        return dados;
    }
}