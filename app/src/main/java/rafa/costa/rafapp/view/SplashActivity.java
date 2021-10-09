package rafa.costa.rafapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import rafa.costa.rafapp.R;
import rafa.costa.rafapp.model.Cliente;

public class SplashActivity extends AppCompatActivity {

    String TAG = "RAFA_APP";
    int tempoDeEspera = 1000 * 3;

    Cliente objCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(TAG, "onCreate: Tela Splash Carregada...");


        trocaTela();
    }

    private void trocaTela() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                objCliente = new Cliente("Raphaell", "teste@teste.com","63991106029",true);

                Intent trocaDeTela = new Intent(SplashActivity.this, MainActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("nome",objCliente.getNome());
                bundle.putString("email",objCliente.getEmail());
                trocaDeTela.putExtras(bundle);

                startActivity(trocaDeTela);
                finish();
            }
        }, tempoDeEspera);



        Log.d(TAG, "trocarDeTela: carregando teste...");
    }
}