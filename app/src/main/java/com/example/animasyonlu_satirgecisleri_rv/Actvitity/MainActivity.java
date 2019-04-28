package com.example.animasyonlu_satirgecisleri_rv.Actvitity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.example.animasyonlu_satirgecisleri_rv.Adapter.UyeAdapter;
import com.example.animasyonlu_satirgecisleri_rv.Model.Uyeler;
import com.example.animasyonlu_satirgecisleri_rv.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    UyeAdapter adapter;
    ArrayList<Uyeler> uyeler = new ArrayList<>();

    public void doldur(int sayi){

        for (int i = 0; i <sayi ; i++) {
            uyeler.add(new Uyeler(
                    "Dilara"+i,
                    "dilara@dilara.com"+i,
                    "https://avatarfiles.alphacoders.com/115/115265.png"));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        doldur(8);

       /* uyeler.add(new Uyeler(
                "Dilara",
                "dilara@dilara.com",
                "https://i.servimg.com/u/f47/12/97/25/10/cd2d3f10.png"));
        uyeler.add(new Uyeler(
                "Dilara",
                "dilara@dilara.com",
                "https://img.webme.com/pic/a/avatar-nart/aang2.png"));
        uyeler.add(new Uyeler(
                "Dilara",
                "dilara@dilara.com",
                "https://img.webme.com/pic/a/avatar-nart/aang2.png"));
*/
        adapter= new UyeAdapter(getApplicationContext(),uyeler);

        int resId=R.anim.layout_animation_fall_down;
        LayoutAnimationController animationController= AnimationUtils.loadLayoutAnimation(getApplicationContext(),resId);
        //recyclerView.setItemAnimator(animationController);

        //linearlayout manager satırların alt alta gösterilmesi için.
        //GridLayoutmanager, StaggeredGridLayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapter);

    }
}
