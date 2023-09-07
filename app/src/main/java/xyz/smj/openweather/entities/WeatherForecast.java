package xyz.smj.openweather.entities;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class WeatherForecast implements Serializable {
    private Location location;
    private Current current;
    private Forecast forecast;

    @SerializedName("location")
    public Location getLocation() { return location; }
    @SerializedName("location")
    public void setLocation(Location value) { this.location = value; }

    @SerializedName("current")
    public Current getCurrent() { return current; }
    @SerializedName("current")
    public void setCurrent(Current value) { this.current = value; }

    @SerializedName("forecast")
    public Forecast getForecast() { return forecast; }
    @SerializedName("forecast")
    public void setForecast(Forecast value) { this.forecast = value; }
}
