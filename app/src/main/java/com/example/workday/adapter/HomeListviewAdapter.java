package com.example.workday.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.workday.R;


public class HomeListviewAdapter extends BaseAdapter {
    private Context mcontext;

    public HomeListviewAdapter( Context context){
        this.mcontext = context;
    }
    @Override
    public int getCount() {
        return 30;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolde viewHolde = null;
        if (convertView == null){
            convertView = LayoutInflater.from(mcontext).inflate(R.layout.listviewadapter_home,null);
            viewHolde = new ViewHolde();
            viewHolde.home_tv = convertView.findViewById(R.id.tv_home);
            convertView.setTag(viewHolde);
        }else {
            viewHolde = (ViewHolde) convertView.getTag();
        }
        return convertView;
    }
   class ViewHolde{
        TextView home_tv;
   }
}
