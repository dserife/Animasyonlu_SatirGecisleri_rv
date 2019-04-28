package com.example.animasyonlu_satirgecisleri_rv.Holder;

import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.animasyonlu_satirgecisleri_rv.R;

public class UyeHolder extends RecyclerView.ViewHolder {

    public ImageView profilResim;
    public TextView txtAd, txtEmail;

    public UyeHolder(@NonNull View itemView) {
        super(itemView);

        profilResim=itemView.findViewById(R.id.profilResim);
        txtAd=itemView.findViewById(R.id.txtAd);
        txtEmail=itemView.findViewById(R.id.txtEmail);
    }
}
