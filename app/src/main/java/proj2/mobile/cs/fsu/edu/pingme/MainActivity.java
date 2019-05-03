package proj2.mobile.cs.fsu.edu.pingme;

import android.app.Activity;
import android.provider.SyncStateContract;
import android.support.v4.app.ActivityCompat;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.content.Intent;
import android.location.LocationManager;
import android.Manifest;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;


public class MainActivity extends Activity {

    private static final int PERMISSIONS_REQUEST = 100;

    private Button mSignInButton;
    private Button mSignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mSignInButton = findViewById(R.id.button_sign_in);
        //mSignUpButton = findViewById(R.id.button_sign_up);

    }

    /*
    public void Login(View view)
    {
        Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);

    }

    public void Register(View view)
    {
        Intent intent=new Intent(getApplicationContext(),RegisterActivity.class);
        startActivity(intent);

    }
    */

    public void showMyLocation(View view){
        startActivity(new Intent(getApplicationContext(),MapsActivity.class));
    }

    }

