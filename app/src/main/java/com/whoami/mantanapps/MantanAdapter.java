package com.whoami.mantanapps;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MantanAdapter extends RecyclerView.Adapter<MantanAdapter.ViewHolder> {

    private List<Mantan> listMantan;
    private Context context;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public MantanAdapter(List<Mantan> listMantan, Context context) {
        this.listMantan = listMantan;
        this.context = context;
    }

    public MantanAdapter(ArrayList<Mantan> list) {
        this.listMantan = list;
    }

    @NonNull
    @Override
    public MantanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_mantan , viewGroup , false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MantanAdapter.ViewHolder viewHolder, int i) {
        Mantan mantan = listMantan.get(i);
        viewHolder.txtNamaMantan.setText(mantan.getNama());
        viewHolder.txtLamaPacaran.setText("Pacaran Selama "+ mantan.getLamaPacaran());
        viewHolder.imgMantan.setImageResource(mantan.getGambar());
        viewHolder.imgMantan.setClipToOutline(true);
        viewHolder.btnMengenang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMantan.get(viewHolder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMantan.size();
    }

    public interface OnItemClickCallback {
        void onItemClicked(Mantan data);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView txtNamaMantan;
        public TextView txtLamaPacaran;
        public ImageView imgMantan;
        public Button btnMengenang;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNamaMantan = (TextView)  itemView.findViewById(R.id.txt_nama);
            txtLamaPacaran = (TextView)  itemView.findViewById(R.id.txt_lama);
            imgMantan = (ImageView) itemView.findViewById(R.id.img_gambar);
            btnMengenang = (Button) itemView.findViewById(R.id.btn_kenang);

        }
    }
}
