package com.anku.chhoti.list;

import android.app.Activity;
import android.app.Dialog;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    ImageView i;
    TextView t,t1;
String[] ar={"ALPHA","BETA","CUPCAKE","DONUT","ECLAIR","FROYO","GINGER BREAD","HONEYCOMB","ICECREAM SANDWITCH","JELLY BEAN","KITKAT","LOLLIPOP","MARSHMALLOW"};
int[] image={R.drawable.alpha,R.drawable.beta,R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecreamsandwitch,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop,R.drawable.marshmallow};
    String[] versionAPI={"Android Version 1.0","Android Version 1.1","Android Version 1.5","Android Version 1.6","Android Version 2.0","Android Version 2.2","Android Version 2.3","Android Version 3.0","Android Version 4.0","Android Version 4.1","Android Version 4.4","Android Version 5.0","Android Version 6.0"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, ar));
        //setListAdapter(new ArrayAdapter<String>());

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Dialog d=new Dialog(this);
        d.setContentView(R.layout.activity_main);

        ImageView i=(ImageView)d.findViewById(R.id.imageView);
        TextView t=(TextView)d.findViewById(R.id.textView);
        TextView t1=(TextView)d.findViewById(R.id.textView2);
        i.setImageResource(image[position]);
        t.setText(versionAPI[position]);
        t1.setText(ar[position]);
        d.show();


    }
}