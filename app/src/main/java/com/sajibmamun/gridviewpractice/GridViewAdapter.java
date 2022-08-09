package com.sajibmamun.gridviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewAdapter extends BaseAdapter {


    private  final int image[];
   private final String name[];
    Context context;


    public GridViewAdapter(int[] image, String[] name, Context context) {
        this.image = image;
        this.name = name;
        this.context = context;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.grid_item_design,null);

        ImageView imageView=(ImageView)view.findViewById(R.id.gridImageid);
        TextView textView=(TextView) view.findViewById(R.id.textviewid);

        imageView.setImageResource(image[position]);
        textView.setText(name[position]);

        return  view;
    }
}
