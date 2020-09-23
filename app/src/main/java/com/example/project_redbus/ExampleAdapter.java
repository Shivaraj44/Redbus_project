package com.example.project_redbus;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<Example> mExampleList;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        public TextView mTextView3;
        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
            mTextView3 = itemView.findViewById(R.id.textView3);
        }
    }
    public ExampleAdapter(ArrayList<Example> exampleList) {
        mExampleList = exampleList;
    }
    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }
    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        Example currentItem = mExampleList.get(position);
        holder.mImageView.setText(currentItem.getText());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
        holder.mTextView3.setText(currentItem.getText3());
    }
    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}