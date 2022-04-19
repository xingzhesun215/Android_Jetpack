package com.sun.viewbinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sun.viewbinding.databinding.ItemStudentBinding;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHold> {


    private ArrayList<Student> beans;

    public StudentAdapter(ArrayList<Student> beans) {
        this.beans = beans;
    }

    @NonNull
    @Override
    public StudentViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       ItemStudentBinding binding= ItemStudentBinding.inflate(LayoutInflater.from(parent.getContext()));

        return new StudentViewHold(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHold holder, int position) {
        Student bean = beans.get(position);
        holder.tv_age.setText("年龄=" + bean.age);
        holder.tv_name.setText("名字=" + bean.name);
    }

    @Override
    public int getItemCount() {
        return beans.size();
    }

    class StudentViewHold extends RecyclerView.ViewHolder{
        TextView tv_name;
        TextView tv_age;

        public StudentViewHold(ItemStudentBinding binding) {
            super(binding.getRoot());
            tv_name=binding.tvName;
            tv_age=binding.tvAge;
        }
    }
}
