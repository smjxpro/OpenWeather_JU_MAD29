package xyz.smj.openweather.entities;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Astro implements Serializable {
    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    private String moonPhase;
    private String moonIllumination;
    private Long isMoonUp;
    private Long isSunUp;

    @SerializedName("sunrise")
    public String getSunrise() { return sunrise; }
    @SerializedName("sunrise")
    public void setSunrise(String value) { this.sunrise = value; }

    @SerializedName("sunset")
    public String getSunset() { return sunset; }
    @SerializedName("sunset")
    public void setSunset(String value) { this.sunset = value; }

    @SerializedName("moonrise")
    public String getMoonrise() { return moonrise; }
    @SerializedName("moonrise")
    public void setMoonrise(String value) { this.moonrise = value; }

    @SerializedName("moonset")
    public String getMoonset() { return moonset; }
    @SerializedName("moonset")
    public void setMoonset(String value) { this.moonset = value; }

    @SerializedName("moon_phase")
    public String getMoonPhase() { return moonPhase; }
    @SerializedName("moon_phase")
    public void setMoonPhase(String value) { this.moonPhase = value; }

    @SerializedName("moon_illumination")
    public String getMoonIllumination() { return moonIllumination; }
    @SerializedName("moon_illumination")
    public void setMoonIllumination(String value) { this.moonIllumination = value; }

    @SerializedName("is_moon_up")
    public Long getIsMoonUp() { return isMoonUp; }
    @SerializedName("is_moon_up")
    public void setIsMoonUp(Long value) { this.isMoonUp = value; }

    @SerializedName("is_sun_up")
    public Long getIsSunUp() { return isSunUp; }
    @SerializedName("is_sun_up")
    public void setIsSunUp(Long value) { this.isSunUp = value; }
}
