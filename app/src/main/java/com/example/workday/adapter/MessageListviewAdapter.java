package com.example.workday.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.workday.R;

public class MessageListviewAdapter extends BaseAdapter {
    private Context mcontext;

    public MessageListviewAdapter(Context context){
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
        ViewHoled viewHoled = null;
        if (convertView == null){
            convertView = LayoutInflater.from(mcontext).inflate(R.layout.listviewadapter_message,null);
            viewHoled = new ViewHoled();
            viewHoled.message_img = convertView.findViewById(R.id.message_img);
            convertView.setTag(viewHoled);
        }else{
            viewHoled = (ViewHoled) convertView.getTag();
        }
        return convertView;
    }
    class ViewHoled{
        ImageView message_img;
    }

}
