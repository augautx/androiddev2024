package vn.edu.usth.weatheractivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class WeatherAndForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);

        // Add WeatherFragment and ForecastFragment to this fragment
        FragmentManager fragmentManager = getChildFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        // Add WeatherFragment to the top
        transaction.replace(R.id.weather_fragment_container, new WeatherFragment());

        // Add ForecastFragment to the bottom
        transaction.replace(R.id.forecast_fragment_container, new ForecastFragment());

        transaction.commit();

        return view;
    }
}
