    package com.example.lenovo.dynamiclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {
    EditText e1;
    Button btn;
    ListView lv;

    ArrayList<String> arrayList;
    ArrayAdapter<String> ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editText);
        btn=findViewById(R.id.button);
        lv=findViewById(R.id.lv);

        arrayList=new ArrayList<String>();
        ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        lv.setAdapter(ad);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=e1.getText().toString();
                if(name.equals(""))
                    e1.setError("enter valid string");
                arrayList.add(name);
                ad.notifyDataSetChanged();
            }
        });



    }
}
