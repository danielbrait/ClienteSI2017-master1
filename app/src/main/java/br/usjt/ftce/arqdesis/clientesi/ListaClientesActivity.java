package br.usjt.ftce.arqdesis.clientesi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListaClientesActivity extends Activity {
    public static final String CLIENTE = "br.usjt.ftce.arqdesis.clientesi.cliente";
    String busca;
    Cliente[] clientes;
    ListView listView;
    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clientes);
        activity = this;
        Intent intent = getIntent();
        busca = intent.getStringExtra(MainActivity.CHAVE);
        clientes = Data.buscaClientes(busca);
        ClienteAdapter adapter = new ClienteAdapter(this, clientes);
        listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent1 = new Intent(activity, DetalheClienteActivity.class);
                intent1.putExtra(CLIENTE, clientes[position]);
                startActivity(intent1);
            }
        });


    }

}
