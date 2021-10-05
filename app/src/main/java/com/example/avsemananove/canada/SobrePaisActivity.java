package com.example.avsemananove.canada;

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
        dados.add("Imperador: Naruhito");
        dados.add("Língua Nativa: Japonês");
        dados.add("Continente: Ásia");
        dados.add("Distância do Brasil: 17.360 km");
        dados.add("Moeda: Iene");
        dados.add("Área territorial: 377.975 km²");
        dados.add("População: 126.440.000 hab.");
        dados.add("Capital: Tóquio");
        dados.add("Fundação: 11 de fevereiro de 660 a.C.");

        return dados;

       /* Presidente/rei/outro;
       Língua(s) Nativa(s);
       Continente;
       Distância do Brasil;
       Moeda;
        Área territorial;
        População;
        Capital;
        Outro: (O estudante deverá escolher)
*/
    }
}