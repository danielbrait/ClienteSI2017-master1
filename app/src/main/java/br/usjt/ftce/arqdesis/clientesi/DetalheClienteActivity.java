package br.usjt.ftce.arqdesis.clientesi;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalheClienteActivity extends Activity {

    ImageView clienteImageView;
    Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cliente);
        Intent intent = getIntent();
        cliente = (Cliente) intent.getSerializableExtra(ListaClientesActivity.CLIENTE);
        clienteImageView = (ImageView) findViewById(R.id.cliente_image_view);
        Drawable drawable = Util.getDrawable(this, cliente.getFoto());
        clienteImageView.setImageDrawable(drawable);

        TextView nome = (TextView) findViewById(R.id.txt_cliente_nome);
        TextView fone = (TextView) findViewById(R.id.txt_cliente_fone);
        TextView email = (TextView) findViewById(R.id.txt_cliente_email);

        nome.setText(cliente.getNome());
        fone.setText(cliente.getFone());
        email.setText(cliente.getEmail());
    }
}
