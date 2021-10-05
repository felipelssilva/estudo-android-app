package com.example.avsemananove.alemanha;

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
        setTitle("País > Alemanha > Sobre");
        setContentView(R.layout.activity_alemanha_sobre_pais);

        ListView lista = (ListView) findViewById(R.id.lv_alemanha_detalhes);
        ArrayList<String> detalhes = preencherDetalhes();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, detalhes);
        lista.setAdapter(arrayAdapter);
    }

    private ArrayList<String> preencherDetalhes() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Imperador: Frank-Walter Steinmeier");
        dados.add("Língua Nativa: Alemão");
        dados.add("Continente: Europa");
        dados.add("Distância do Brasil: 9.426 Km");
        dados.add("Moeda: Euro");
        dados.add("Área territorial: 3.570.541 km²");
        dados.add("População: 83.166.711 hab.");
        dados.add("Capital: Berlin");
        dados.add("Fuso horário: UTC +2");

        return dados;
    }
}