package com.example.proyecto_andriod;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class activy_consultar_recycler_view1  extends AppCompatActivity {
    RecyclerView recyclerView;
    ProductsAdapter adapter;

    //MantenimientoMySQL manto=new Mantenimiento();
    protected void onCreate(Bundle savedInstantState){
        super.onCreate (savedInstantState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Object manto;
        adapter =new ProductsAdapter (activy_consultar_recycler_view1.this, manto.consularAllArticulos());
        recyclerView.setAdapter(adapter);
    }

}
