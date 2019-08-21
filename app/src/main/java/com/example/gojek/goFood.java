package com.example.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class goFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);
        final EditText nama = (EditText) findViewById(R.id.editNamaOrder);
        final EditText alamat = (EditText) findViewById(R.id.editAlamatOrder);
        final EditText pesanan = (EditText) findViewById(R.id.editPesananOrder);
        Button button = (Button) findViewById(R.id.submitPesanan);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(goFood.this,Success.class);
                i.putExtra("nama", nama.getText().toString());
                i.putExtra("alamat",alamat.getText().toString());
                i.putExtra("pesanan",pesanan.getText().toString());
                startActivity(i);
            }
        });
    }
}
