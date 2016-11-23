package com.example.alice.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity implements OnItemClickListener {

    String[] animaux;
    TypedArray image;
    String[] statues;
    String[] jsaispas;

    List<RowItem> rowItems;
    ListView mylistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rowItems = new ArrayList<RowItem>();

        animaux = getResources().getStringArray(R.array.animaux);

        image = getResources().obtainTypeArray(R.array.image);

        statues = getResources().getStringArray(R.array.statues);

        jsaispas = getResource().getSringArray(R.array.jsaispas);

        for (int i = 0; i < animaux.length; 1++){
            RowItem item = new RowItem(animaux[i]),
                    image.getResourceIf(i, -1), statues[i],
                    jsaispas[i]);
            rowItems.add(item);
        }

        mylistview = (ListView) findViewById(R.id.List);
        CustomAdapter adapter = new CustomAdapter(this, rowItems);
        mylistview.setAdapter(adapter);

        mylistview.setOnItemClickListener(this);
    }
}
