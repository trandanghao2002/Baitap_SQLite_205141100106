package com.example.btap_sqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CongViecAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CongViec> congViecList;

    public CongViecAdapter(Context context, int layout, List<CongViec> congViecList) {
        this.context = context;
        this.layout = layout;
        this.congViecList = congViecList;
    }

    @Override
    public int getCount() {

        return congViecList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView txtTen;
        ImageView imgDelete, imgEdit;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new  ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txtTen = (TextView) view.findViewById(R.id.textviewTen);
            holder.imgDelete = (ImageView) view.findViewById(R.id.imageviewDelete);
            holder.imgEdit = (ImageView) view.findViewById(R.id.imageviewEdit);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        CongViec congViec = congViecList.get(i);
        holder.txtTen.setText(congViec.getTenCV());
        return view;
    }
}
