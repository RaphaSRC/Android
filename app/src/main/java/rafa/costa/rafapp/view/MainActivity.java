package rafa.costa.rafapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import rafa.costa.rafapp.R;
import rafa.costa.rafapp.model.Cliente;

public class MainActivity extends AppCompatActivity {


    TextView txtNome;


    String TAG = "RAFA_APP";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();


        Log.d(TAG, "onCreate: "+bundle.getString("nome"));
        Log.d(TAG, "onCreate: "+bundle.getString("email"));

        txtNome = findViewById(R.id.textView2);
        txtNome.setText("Bem vindo..."+bundle.getString("nome"));


    }
}