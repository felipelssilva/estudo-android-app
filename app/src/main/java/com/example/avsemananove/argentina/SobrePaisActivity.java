package com.example.avsemananove.argentina;

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
        setTitle("País > Argentina > Sobre");
        setContentView(R.layout.activity_argentina_sobre_pais);

        ListView lista = (ListView) findViewById(R.id.lv_argentina_detalhes);
        ArrayList<String> detalhes = preencherDetalhes();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, detalhes);
        lista.setAdapter(arrayAdapter);
    }

    private ArrayList<String> preencherDetalhes() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Presidente: Alberto Fernández");
        dados.add("Língua Nativa: Espanhol");
        dados.add("Continente: América do Sul");
        dados.add("Distância do Brasil: 2.922 Km");
        dados.add("Moeda: Peso Argentino");
        dados.add("Área territorial: 2.780.400 km²");
        dados.add("População: 45.808.747 hab.");
        dados.add("Capital: Buenos Aires");
        dados.add("Fuso horário: UTC -3");

        return dados;
    }
}