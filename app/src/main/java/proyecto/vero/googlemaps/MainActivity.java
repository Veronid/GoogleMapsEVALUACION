package proyecto.vero.googlemaps;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment=(SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        //Pude resolver lo de ingresar las cordenadas, al ingresar serîa -34.151
        LatLng Direccion1 = new LatLng(-34,151);
        LatLng Direccion2 = new LatLng(-54,171);
        LatLng Direccion3 = new LatLng(-84,161);
        LatLng MiDireccion = new LatLng(-94,191);
        mMap.addMarker(new MarkerOptions().position(Direccion1).title("Direccion 1"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Direccion1));
        mMap.addMarker(new MarkerOptions().position(Direccion2).title("Direccion 2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Direccion2));
        mMap.addMarker(new MarkerOptions().position(Direccion3).title("Direccion 3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Direccion3));
        mMap.addMarker(new MarkerOptions().position(MiDireccion).title("Direccion 4"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MiDireccion));


    }
}
