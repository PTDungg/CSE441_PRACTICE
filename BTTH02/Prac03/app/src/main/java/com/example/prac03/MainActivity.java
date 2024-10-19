package com.example.prac03;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prac03.Country;
import com.example.prac03.CountryAdapter;
import com.example.prac03.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Country> countries;
    private RecyclerView rcvcountries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        countries = new ArrayList<Country>();
        countries.add(new Country(R.drawable.india, "India","New Delhi"));
        countries.add(new Country(R.drawable.china, "China","Beijing"));
        countries.add(new Country(R.drawable.us, "United States","Washington DC"));
        countries.add(new Country(R.drawable.indonesia, "Indonesia","Jakarta"));
        countries.add(new Country(R.drawable.pakistan, "Pakistan","Islamabad"));
        countries.add(new Country(R.drawable.nigeria, "Nigeria","Abuja"));
        countries.add(new Country(R.drawable.brazil, "Brazil","Brasila"));
        countries.add(new Country(R.drawable.bangladesh, "Bangladesh","Dhaka"));

        rcvcountries = (RecyclerView) findViewById(R.id.rcvcountries);
        rcvcountries.setAdapter(new CountryAdapter(countries));
        rcvcountries.setLayoutManager(new LinearLayoutManager(this));
        rcvcountries.setHasFixedSize(true);
    }
}