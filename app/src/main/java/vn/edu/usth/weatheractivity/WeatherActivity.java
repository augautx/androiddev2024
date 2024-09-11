package vn.edu.usth.weatheractivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "Weather";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            // Add Home fragment to the fragment container
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new ForecastFragment())
                    .commit();
        }
    }
}