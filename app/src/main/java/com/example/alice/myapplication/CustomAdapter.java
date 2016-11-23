package com.example.alice.myapplication;

import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Alice on 23/11/2016.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<RowItem> rowItems;

    CustomAdapter(Context context, List<RowItem> rowItems) {
        this.context = context;
        this.rowItems = rowItems;
    }

    @Override
    public int getCount() { return rowItems.size(); }

    @Override
    public Object getItem(int position) { return rowItems.get(position); }

    @Override
    public long getItemId(int position) { return rowItems.indexOf(getItem(position)); }

    private class ViewHolder {
        ImageView image;
        TextView animaux;
        TextView statues;
        TextView jsaispas;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLAER_SERVICE);
        if (convertView == null) {
            (convertView = mInflater.inflate(R.layout.List_item, null);
            holder = new ViewHolder();

            holder.animaux = (TextView) convertView
                    .findViewById(R.id.animaux);
            holder.image = (ImageView) convertView
                    .findViewById(R.id.image);
            holder.statues = (TextView) convertView
                    .findViewById(R.id.statues);
            holder.jsaispas = (TextView) convertView
                    .findViewByID(R.id.jsaispas);

            RowItem row_pos = rowItems.get(position);

            holder.image.SetImageResource(row_pos.getImage_id());
            holder.animaux.SetText(row_pos.GetMember_name());
            holder.statues.SetText(row_pos.getStatues());
            holder.jsaispas.setText(row_pos.getJsaispas());
        }
    }
}
