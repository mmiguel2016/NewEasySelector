package com.castolin.easyselector;

/**
 * Created by mmiguel on 03.03.2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Item> {

    ArrayList<Item> selectionList = new ArrayList<>();

    public MyAdapter(Context context, int textViewResourceId, ArrayList<Item> objects) {
        super(context, textViewResourceId, objects);
        selectionList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.list_view_items, null);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        textView.setText(selectionList.get(position).getSelectionName());
        imageView.setImageResource(selectionList.get(position).getSelectionImage());
        return v;

    }

}
