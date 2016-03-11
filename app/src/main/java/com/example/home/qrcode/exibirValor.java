package com.example.home.qrcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class exibirValor extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);

        TextView valorLido = (TextView) findViewById(R.id.textViewValorLido);

        Intent intent = getIntent();

        valorLido.setText(("Os dados convertidos do código QR foi: " + (String) intent.getSerializableExtra("valorLido")));
    }
}
