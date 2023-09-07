package xyz.smj.openweather.entities;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Forecast implements Serializable {
    private List<Forecastday> forecastday;

    @SerializedName("forecastday")
    public List<Forecastday> getForecastday() { return forecastday; }
    @SerializedName("forecastday")
    public void setForecastday(List<Forecastday> value) { this.forecastday = value; }
}
