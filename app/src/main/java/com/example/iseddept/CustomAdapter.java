package com.example.iseddept;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] names;
    int[] images;
    Activity Context;
    String[] scores;

    CustomAdapter(String[] names, int[] images, String[] scores, Activity Context){
        this.names = names;
        this.Context = Context;
        this.images = images;
        this.scores = scores;
    }
    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return names[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            LayoutInflater Inflater = Context.getLayoutInflater();
            view =  Inflater.inflate(R.layout.single_item,viewGroup,false);
        }
        ImageView item_imageview = view.findViewById(R.id.item_imageview);
        TextView item_textview = view.findViewById(R.id.item_textview);
        TextView item_textviewScore = view.findViewById(R.id.item_textviewScore);


        item_imageview.setImageResource(images[i]);
        item_textview.setText(names[i]);
        item_textviewScore.setText(scores[i]);
        return view;
    }
}
