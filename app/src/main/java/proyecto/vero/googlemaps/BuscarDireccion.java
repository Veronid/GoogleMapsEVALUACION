package proyecto.vero.googlemaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BuscarDireccion extends AppCompatActivity {

    EditText Direccion1;
    EditText Direccion2;
    EditText Direccion3;
    EditText MiDireccion;
    Button Agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_direccion);

        Direccion1 = findViewById(R.id.txtD1);
        Direccion2 = findViewById(R.id.txtD2);
        Direccion3 = findViewById(R.id.txtD3);
        MiDireccion = findViewById(R.id.txtMiPunto);

        Agregar = findViewById(R.id.btnAgregar);
        Agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        MainActivity.class
                );

                intent.putExtra("Agregar",Agregar.getText().toString());
                startActivity(intent);

            }
        });
    }
}