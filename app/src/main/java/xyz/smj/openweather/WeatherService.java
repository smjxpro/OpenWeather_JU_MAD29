package xyz.smj.openweather;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;
import xyz.smj.openweather.entities.WeatherForecast;


public interface WeatherService {

    @GET()
    Call<WeatherForecast> getWeatherForecast(@Url String urlString);
}
