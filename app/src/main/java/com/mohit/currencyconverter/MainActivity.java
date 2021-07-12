package com.mohit.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText am =(EditText)findViewById(R.id.am);
        String rupees=am.getText().toString();
        double rupeesDouble = Double.parseDouble(rupees);
        double daullar = rupeesDouble/60.00;
        Toast.makeText(this, "Currency in dollars are  $"+daullar, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
