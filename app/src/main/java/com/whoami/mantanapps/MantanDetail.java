package com.whoami.mantanapps;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MantanDetail extends AppCompatActivity implements View.OnClickListener{
    public static final String NAMA = "nama";
    public static final String TTL = "ttl";
    public static final String LAMA = "wow";
    public static final String ALASAN = "ALASAN";
    public static final String GAMBAR = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mantan_detail);

        ImageView img_mantan = (ImageView) findViewById(R.id.img_mantan);
        img_mantan.setClipToOutline(true);

        TextView nama = (TextView) findViewById(R.id.txt_nama_mantan);
        TextView ttl = (TextView) findViewById(R.id.txt_ttl_mantan);
        TextView lama = (TextView) findViewById(R.id.txt_lama_pacaran);
        TextView alasan = (TextView) findViewById(R.id.txt_alasan_putus);

        nama.setText(getIntent().getStringExtra(NAMA));
        ttl.setText(getIntent().getStringExtra(TTL));
        lama.setText(getIntent().getStringExtra(LAMA));
        alasan.setText(getIntent().getStringExtra(ALASAN));
        img_mantan.setImageResource(getIntent().getIntExtra(GAMBAR,0));

        Button kembali = (Button) findViewById(R.id.btn_kembali_detail);
        kembali.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_kembali_detail:
                Intent home = new Intent(MantanDetail.this,MainActivity.class);
                startActivity(home);
                break;
        }
    }
}
