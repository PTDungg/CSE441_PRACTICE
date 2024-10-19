package com.example.prac03;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {
    //Nhan du lieu truyen tu ngoai vao
    private List<Country> countries;


    //Constructer de truyen du lieu Adapter
    public CountryAdapter(List<Country> countries) {
        this.countries = countries;
    }
    //Tao ViewHolder moi khi can thiet
        @NonNull
        @Override
        public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false);
            return new CountryViewHolder(itemView);
        }
    //Gan du lieu vao ViewHolder tai vi tri cu the
    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        Country currentIteam = countries.get(position);
        holder.imgFlag.setImageResource(currentIteam.getFlag());
        holder.txtName.setText(currentIteam.getCountryName());
        holder.txtCapital.setText(currentIteam.getCountryCapital());
    }

        @Override
        public int getItemCount() {
            return countries.size();
        }

    //Dinh nghia ViewHolder
    public static class CountryViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFlag;
        TextView txtName, txtCapital;

        public CountryViewHolder(View itemView) {
            super(itemView);
            imgFlag = itemView.findViewById(R.id.imgflag);
            txtName = itemView.findViewById(R.id.txtname);
            txtCapital = itemView.findViewById(R.id.txtcapital);
        }
    }
    }




