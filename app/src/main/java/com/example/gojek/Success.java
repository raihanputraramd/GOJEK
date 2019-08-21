package com.example.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        TextView nama = (TextView) findViewById(R.id.hasilNamaOrder);
        TextView alamat = (TextView)findViewById(R.id.hasilAlamatOrder);
        TextView pesanan = (TextView) findViewById(R.id.hasilPesananOrder);
        Bundle bundle = getIntent().getExtras();
        String n = bundle.getString("nama");
        String a =  bundle.getString("alamat");
        String p =  bundle.getString("pesanan");
        nama.setText(n);
        alamat.setText(a);
        pesanan.setText(p);

        Button button = (Button) findViewById(R.id.kembaliOrder);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Success.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}
