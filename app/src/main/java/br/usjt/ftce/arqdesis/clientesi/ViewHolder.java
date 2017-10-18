package br.usjt.ftce.arqdesis.clientesi;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
    private ImageView foto;
    private TextView nome, detalhe;

    public ViewHolder(ImageView foto, TextView nome, TextView detalhe) {
        this.foto = foto;
        this.nome = nome;
        this.detalhe = detalhe;
    }

    public ImageView getFoto() {
        return foto;
    }

    public TextView getNome() {
        return nome;
    }

    public TextView getDetalhe() {
        return detalhe;
    }

    public void setFoto(ImageView foto) {
        this.foto = foto;
    }

    public void setNome(TextView nome) {
        this.nome = nome;
    }

    public void setDetalhe(TextView detalhe) {
        this.detalhe = detalhe;
    }
}
