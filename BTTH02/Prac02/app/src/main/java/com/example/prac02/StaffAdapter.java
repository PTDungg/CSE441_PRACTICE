package com.example.prac02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StaffAdapter extends RecyclerView.Adapter<StaffAdapter.StaffViewHolder>  {
    private final List<Staff> staff;

    public StaffAdapter(List<Staff> staff){
        this.staff = staff;
    }

    @NonNull
    @Override
    public StaffViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new StaffViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StaffViewHolder holder, int position) {
        Staff currentItem = staff.get(position);
        if(currentItem == null){
            return;
        }
        holder.edtID.setText(currentItem.getId());
        holder.edtName.setText(currentItem.getName());
        holder.edtBD.setText(currentItem.getBd());
        holder.edtSalary.setText(currentItem.getSalary());
    }

    @Override
    public int getItemCount() {
        if(staff != null){
            return staff.size();
        }
        return 0;
    }

    public static class StaffViewHolder extends RecyclerView.ViewHolder {
        TextView txtMess;
        EditText edtID, edtName, edtBD, edtSalary;

        public StaffViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMess = itemView.findViewById(R.id.txtMess);
            edtID = itemView.findViewById(R.id.edtID);
            edtName = itemView.findViewById(R.id.edtName);
            edtBD = itemView.findViewById(R.id.edtBD);
            edtSalary = itemView.findViewById(R.id.edtSalary);
        }
    }
}
