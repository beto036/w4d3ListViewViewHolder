package com.example.admin.w4d3listviewviewholder;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by evin on 4/19/16.
 */
public class SimpleAdapter extends ArrayAdapter<String> {

    private static final String TAG = "TAG_";
    private String[] mArrayList;

    private static class ViewHolder {
        TextView name;
        String value;
    }


    public SimpleAdapter(Context context, String[] mArrayList) {
        super(context, 0, mArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.d(TAG, "getView: ");
        String user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        final ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            // If there's no view to re-use, inflate a brand new view for row
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_entry, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.txt);
            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data from the data object via the viewHolder object
        // into the template view.
        viewHolder.name.setText(user);
        viewHolder.value = user;

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), viewHolder.value, Toast.LENGTH_SHORT).show();
            }
        });
        // Return the completed view to render on screen
        return convertView;
    }

}

