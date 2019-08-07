package com.nijjwal.currencyconvertor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Hello World!");
    }


    public void convertCurrency(View view) {
        Log.i("Info", "Currency convertor button is clicked!");

        EditText inputCurrency = (EditText) findViewById(R.id.inputCurrency);
        double inputCurrencyDouble = Double.valueOf(inputCurrency.getText().toString());

        // Convert the currency
        double output = 113.10 * inputCurrencyDouble;

        // Display the currency as a toast
        Toast.makeText(MainActivity.this, String.valueOf(output), Toast.LENGTH_LONG).show();
        Log.i("Info", String.valueOf(output));
    }


}
