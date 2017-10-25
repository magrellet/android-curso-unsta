package com.martin.holamundo;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Martin on 23/10/2017.
 */

public class AdapterTitulares extends ArrayAdapter<Titular> {

    Titular[] titulares;
    Activity activity;

    public AdapterTitulares(@NonNull Context context, Titular[] titulares) {
        super(context, R.layout.listitem_titular, titulares);
        this.titulares = titulares;
        this.activity = (Activity) context;
    }


    public View getView(int position, View contentView, ViewGroup parent){

        View item = contentView;
        ViewHolder holder;

        if(item == null){
            LayoutInflater inflater = activity.getLayoutInflater();
            item = inflater.inflate(R.layout.listitem_titular, null);

            holder = new ViewHolder();
            holder.titulo= (TextView) item.findViewById(R.id.idTitulo);
            holder.subtitulo = (TextView) item.findViewById(R.id.idSubTitulo);

            item.setTag(holder);
        }
        else{
            holder = (ViewHolder) item.getTag();
        }
        holder.titulo.setText(titulares[position].getTitulo());
        holder.subtitulo.setText(titulares[position].getSubtitulo());

        return item;
    }

    public static class ViewHolder{
        TextView titulo;
        TextView subtitulo;
    }
}
