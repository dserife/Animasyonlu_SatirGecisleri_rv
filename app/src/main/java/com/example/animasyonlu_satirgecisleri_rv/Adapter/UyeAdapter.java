package com.example.animasyonlu_satirgecisleri_rv.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.bumptech.glide.Glide;
import com.example.animasyonlu_satirgecisleri_rv.Holder.UyeHolder;
import com.example.animasyonlu_satirgecisleri_rv.Model.Uyeler;
import com.example.animasyonlu_satirgecisleri_rv.R;

import java.util.ArrayList;


public class UyeAdapter extends RecyclerView.Adapter<UyeHolder> {

    private Context context;
    private ArrayList<Uyeler> uyeler= new ArrayList<>();

    public UyeAdapter() {
    }

    public UyeAdapter(Context context, ArrayList<Uyeler> uyeler) {
        this.context = context;
        this.uyeler = uyeler;
    }

    @NonNull
    @Override
    public UyeHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        /*
        görüntüyü oluştur-createView - layoutInflater kullanıcaz.
        satır görüntüsünün layouta bağlanması işlemini yapar.
         */

        View v= LayoutInflater.from(context).inflate(R.layout.item_layout,viewGroup,false);

        return new UyeHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UyeHolder uyeHolder, int i) {
        /*
        atama işlemi yapar.
        kaçıncı indisteysek, arraylistte ilgili modelin değerlerini ilgili nesnelere atar.
         */

        Animation animation= AnimationUtils.loadAnimation(uyeHolder.itemView.getContext(),R.anim.item_animation_fall_down);
        uyeHolder.itemView.startAnimation(animation);

        uyeHolder.txtEmail.setText(uyeler.get(i).getEmail());
        uyeHolder.txtAd.setText(uyeler.get(i).getAd());

        Glide
                .with(context)
                .load(uyeler.get(i).getProfilResim())
                .into(uyeHolder.profilResim);

    }

    @Override
    public int getItemCount() {
        //satır görüntüsündeki değerleri sayar.
        return uyeler.size();
    }
}
