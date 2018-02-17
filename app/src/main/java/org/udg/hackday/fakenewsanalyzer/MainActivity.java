package org.udg.hackday.fakenewsanalyzer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boto_analitzar = (Button) findViewById(R.id.button_buscar);

        boto_analitzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView prova = (TextView) findViewById(R.id.textView3);
                EditText editText_url = (EditText) findViewById(R.id.EditText_URL);
                int contador = 0;

                editText_url.setText("www.google.es");

                prova.setText("Enllaç fiable");


            }
        });




    }


}
