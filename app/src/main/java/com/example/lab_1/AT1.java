package com.example.lab_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AT1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at1); // Use o layout correto

        // Encontre o botão pelo ID
        Button buttonGoToAT2 = findViewById(R.id.buttonGoToAT2);
        buttonGoToAT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crie uma Intent que descreve a transição da AT1 para a AT2
                Intent intent = new Intent(AT1.this, AT2.class);
                startActivity(intent); // Inicie a atividade AT2
            }
        });
    }
}


