package mx.edu.ittepic.tpdm_u4_practica4_eduardosilva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView cliente1,cliente2,cliente3,
            c1c1,c2c1,c3c1,c4c1,c5c1,
            c1c2,c2c2,c3c2,c4c2,c5c2,
            c1c3,c2c3,c3c3,c4c3,c5c3;

    Boolean [] cola1,cola2,cola3;
    int ini1,ini2,ini3,fin1,fin2,fin3;

    Thread caja1, caja2, caja3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cliente1 = findViewById(R.id.cliente1);
        cliente2 = findViewById(R.id.cliente2);
        cliente3 = findViewById(R.id.cliente3);

        c1c1 = findViewById(R.id.c1c1);
        c2c1 = findViewById(R.id.c2c1);
        c3c1 = findViewById(R.id.c3c1);
        c4c1 = findViewById(R.id.c4c1);
        c5c1 = findViewById(R.id.c5c1);

        c1c2 = findViewById(R.id.c1c2);
        c2c2 = findViewById(R.id.c2c2);
        c3c2 = findViewById(R.id.c3c2);
        c4c2 = findViewById(R.id.c4c2);
        c5c2 = findViewById(R.id.c5c2);

        c1c3 = findViewById(R.id.c1c3);
        c2c3 = findViewById(R.id.c2c3);
        c3c3 = findViewById(R.id.c3c3);
        c4c3 = findViewById(R.id.c4c3);
        c5c3 = findViewById(R.id.c5c3);

        cola1 = new Boolean[6];
        cola2 = new Boolean[6];
        cola3 = new Boolean[6];

        ini1 = -1; fin1 = ini1;
        ini2 = -1; fin2 = ini2;
        ini3 = -1; fin3 = ini3;

        try {
            caja1.start();
            caja2.start();
            caja3.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        caja1 = new Thread() {
            @Override
            public void run() {
                while (true){
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            boolean cliente;
                            int n = (int) (Math.random()*1);
                            if (n==1){
                                cliente = true;
                            } else cliente = false;

                        }
                    });
                }
            }
        };
    }
}
