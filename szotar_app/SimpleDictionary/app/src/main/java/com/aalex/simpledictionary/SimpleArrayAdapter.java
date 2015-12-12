package com.aalex.simpledictionary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by apjok on 2015. 12. 06..
 */
public class SimpleArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;
    TextView textView;

    public SimpleArrayAdapter(Context context, String[] values) {
        super(context, R.layout.list_item, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Layout létrehozás XML-ből rendszer szolgáltatással.
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Hozzuk létre az adapterhez használatos View-t
        View rowView = inflater.inflate(R.layout.list_item, parent, false);

        //Példányosítsuk és töltsük fel a View elemeit
        TextView textView = (TextView) rowView.findViewById(R.id.secondLine);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        textView.setText(values[position]);

        return rowView;
    }
}
