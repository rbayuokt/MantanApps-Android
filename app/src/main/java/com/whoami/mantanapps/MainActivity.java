package com.whoami.mantanapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rvMantan;
    private ArrayList<Mantan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //recycler view
        rvMantan = (RecyclerView) findViewById(R.id.recycler_list_mantan);
        list.addAll(MantanData.getListData());
        showRecyclerList();

        //about me
        Button btn_about = findViewById(R.id.btn_about);
        btn_about.setOnClickListener(this);
    }

    private void showRecyclerList(){
        rvMantan.setHasFixedSize(false);
        rvMantan.setNestedScrollingEnabled(false);
        rvMantan.setLayoutManager(new GridLayoutManager(MainActivity.this,1));
        MantanAdapter listMantanAdapter = new MantanAdapter(list);
        rvMantan.setAdapter(listMantanAdapter);

        listMantanAdapter.setOnItemClickCallback(new MantanAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Mantan data) {
                Intent detailMantan = new Intent(MainActivity.this, MantanDetail.class);
                detailMantan.putExtra(MantanDetail.NAMA,data.getNama());
                detailMantan.putExtra(MantanDetail.TTL,data.getTtl());
                detailMantan.putExtra(MantanDetail.LAMA,data.getLamaPacaran());
                detailMantan.putExtra(MantanDetail.ALASAN,data.getAlasanPutus());
                detailMantan.putExtra(MantanDetail.GAMBAR,data.getGambar());
                startActivity(detailMantan);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_about:
                Intent about = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(about);
                break;
        }
    }

    private void showSelectedMantan(Mantan mantan) {
        Toast.makeText(this, "Kamu memilih " + mantan.getNama(), Toast.LENGTH_SHORT).show();
    }
}
