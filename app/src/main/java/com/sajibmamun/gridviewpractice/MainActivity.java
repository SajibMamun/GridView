package com.sajibmamun.gridviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    int images[] = {
            R.drawable.akhhy, R.drawable.anupama, R.drawable.ayan, R.drawable.estiak, R.drawable.jahid,
            R.drawable.junayed, R.drawable.likhon, R.drawable.shimon, R.drawable.shorna, R.drawable.sajib, R.drawable.nirob,
            R.drawable.munna, R.drawable.obaydur, R.drawable.sadhin, R.drawable.payel
    };
    String name[] = {
            "Akhy", "Anu pama", "Ayan", "Estiak", "Jahid", "Junayed", "Likhon", "Shimon", "Shorna", "Sajib", "Nirob", "Munna", "Obaydur", "Sadhin", "Payel"
    };


    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridViewid);



        GridViewAdapter gridViewAdapter=new GridViewAdapter(images,name,this);
        gridView.setAdapter(gridViewAdapter);
    }
}