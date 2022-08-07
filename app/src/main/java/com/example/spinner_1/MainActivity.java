package com.example.spinner_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String[] chessWorldChampions = {"Wilhelm Steinitz", "Emanuel Lasker", "Jose Raul Capablanca", "Alexander Alekhine", "Max Euwe", "Mikhail Botvinnik", "Vassily Smislov", "Mikhail Tal", "Tigran Petrosian", "Boris Spassky", "Robert Fischer", "Anatoly Karpov", "Garry Kasparov", "Alexander Khalifman", "Vladimir Kramnik", "Viswanathan Anand", "Ruslan Panamariov", "Rustam Kasımdzhanov", "Veselin Topalov", "Vladimir Kramnik", "Viswanathan Anand", "Magnus Carlsen"};
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        define();
        createAdapter();
        addAdapterToSpinner();
        info();
    }

    private void define() {
        spinner = (Spinner) findViewById(R.id.spinner);
    }

    public void createAdapter() {
        arrayAdapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, chessWorldChampions);
    }

    public void addAdapterToSpinner() {
        spinner.setAdapter(arrayAdapter);
    }

    public void info() {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(), spinner.getSelectedItem().toString() + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}