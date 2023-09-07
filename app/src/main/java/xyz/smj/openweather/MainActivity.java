package xyz.smj.openweather;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import xyz.smj.openweather.databinding.ActivityMainBinding;
import xyz.smj.openweather.entities.WeatherForecast;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FusedLocationProviderClient client;
    private double latitude, longitude;

    WeatherForecast weatherForecast;

    private static final String BASE_URL_CURRENT = "https://api.weatherapi.com/v1/";

    WeatherService weatherService;

    TextView cwLocationTV;
    TextView cwDateTimeTV;
    ImageView cwIconIV;
    TextView cwTempTV;
    TextView cwDescTV;
    TextView cwHumidityTV;

    ListView forecastLV;

    ForecastDayAdapter forecastDayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);


        cwLocationTV = findViewById(R.id.cwLocationTV);
        cwDateTimeTV = findViewById(R.id.cwDateTimeTV);
        cwIconIV = findViewById(R.id.cwIconIV);
        cwTempTV = findViewById(R.id.cwTempTV);
        cwDescTV = findViewById(R.id.cwDescTV);
        cwHumidityTV = findViewById(R.id.cwHumidityTV);
        forecastLV = findViewById(R.id.forecastLV);

        client = LocationServices.getFusedLocationProviderClient(this);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1000);
            return;
        }


        client.getLastLocation().addOnSuccessListener(location -> {
            if (location == null) {
                return;
            }
            latitude = location.getLatitude();
            longitude = location.getLongitude();

            Toast.makeText(getApplicationContext(), "Lat" + latitude + " Lon" + longitude, Toast.LENGTH_SHORT).show();


            Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL_CURRENT).addConverterFactory(GsonConverterFactory.create()).build();
            weatherService = retrofit.create(WeatherService.class);

            String appId = getString(R.string.weather_api_key);
            String urlWeatherForecast = String.format("forecast.json?q=%f,%f&days=7&key=%s", latitude, longitude, appId);

            Call<WeatherForecast> weatherCall = weatherService.getWeatherForecast(urlWeatherForecast);
            weatherCall.enqueue(new Callback<WeatherForecast>() {
                @Override
                public void onResponse(Call<WeatherForecast> call, Response<WeatherForecast> response) {
                    Log.d(TAG, "onResponse: " + response.code());

                    if (response.isSuccessful()) {
                        weatherForecast = response.body();


                        cwLocationTV.setText(weatherForecast.getLocation().getName());
                        cwDateTimeTV.setText(weatherForecast.getCurrent().getLastUpdated());
                        cwTempTV.setText(weatherForecast.getCurrent().getTempC().toString() + " C");
                        cwDescTV.setText(weatherForecast.getCurrent().getCondition().getText());
                        cwHumidityTV.setText("Humidity: " + weatherForecast.getCurrent().getHumidity().toString() + " %");

                        forecastDayAdapter = new ForecastDayAdapter(new ArrayList(weatherForecast.getForecast().getForecastday()), getApplicationContext());

                        forecastLV.setAdapter(forecastDayAdapter);
                    }
                }

                @Override
                public void onFailure(Call<WeatherForecast> call, Throwable t) {
                    Log.e(TAG, "onFailure: " + t.getMessage(), t);
                    Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();


                }
            });


        });


    }

}