package xyz.smj.openweather.entities;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Hour implements Serializable {
    private Long timeEpoch;
    private String time;
    private Double tempC;
    private Double tempF;
    private Long isDay;
    private Condition condition;
    private Double windMph;
    private Double windKph;
    private Long windDegree;
    private Long pressureMB;
    private Double pressureIn;
    private Double precipMm;
    private Double precipIn;
    private Long humidity;
    private Long cloud;
    private Double feelslikeC;
    private Double feelslikeF;
    private Double windchillC;
    private Double windchillF;
    private Double heatindexC;
    private Double heatindexF;
    private Double dewpointC;
    private Double dewpointF;
    private Long willItRain;
    private Long chanceOfRain;
    private Long willItSnow;
    private Long chanceOfSnow;
    private Double visKM;
    private Long visMiles;
    private Double gustMph;
    private Double gustKph;
    private Long uv;

    @SerializedName("time_epoch")
    public Long getTimeEpoch() { return timeEpoch; }
    @SerializedName("time_epoch")
    public void setTimeEpoch(Long value) { this.timeEpoch = value; }

    @SerializedName("time")
    public String getTime() { return time; }
    @SerializedName("time")
    public void setTime(String value) { this.time = value; }

    @SerializedName("temp_c")
    public Double getTempC() { return tempC; }
    @SerializedName("temp_c")
    public void setTempC(Double value) { this.tempC = value; }

    @SerializedName("temp_f")
    public Double getTempF() { return tempF; }
    @SerializedName("temp_f")
    public void setTempF(Double value) { this.tempF = value; }

    @SerializedName("is_day")
    public Long getIsDay() { return isDay; }
    @SerializedName("is_day")
    public void setIsDay(Long value) { this.isDay = value; }

    @SerializedName("condition")
    public Condition getCondition() { return condition; }
    @SerializedName("condition")
    public void setCondition(Condition value) { this.condition = value; }

    @SerializedName("wind_mph")
    public Double getWindMph() { return windMph; }
    @SerializedName("wind_mph")
    public void setWindMph(Double value) { this.windMph = value; }

    @SerializedName("wind_kph")
    public Double getWindKph() { return windKph; }
    @SerializedName("wind_kph")
    public void setWindKph(Double value) { this.windKph = value; }

    @SerializedName("wind_degree")
    public Long getWindDegree() { return windDegree; }
    @SerializedName("wind_degree")
    public void setWindDegree(Long value) { this.windDegree = value; }


    @SerializedName("pressure_mb")
    public Long getPressureMB() { return pressureMB; }
    @SerializedName("pressure_mb")
    public void setPressureMB(Long value) { this.pressureMB = value; }

    @SerializedName("pressure_in")
    public Double getPressureIn() { return pressureIn; }
    @SerializedName("pressure_in")
    public void setPressureIn(Double value) { this.pressureIn = value; }

    @SerializedName("precip_mm")
    public Double getPrecipMm() { return precipMm; }
    @SerializedName("precip_mm")
    public void setPrecipMm(Double value) { this.precipMm = value; }

    @SerializedName("precip_in")
    public Double getPrecipIn() { return precipIn; }
    @SerializedName("precip_in")
    public void setPrecipIn(Double value) { this.precipIn = value; }

    @SerializedName("humidity")
    public Long getHumidity() { return humidity; }
    @SerializedName("humidity")
    public void setHumidity(Long value) { this.humidity = value; }

    @SerializedName("cloud")
    public Long getCloud() { return cloud; }
    @SerializedName("cloud")
    public void setCloud(Long value) { this.cloud = value; }

    @SerializedName("feelslike_c")
    public Double getFeelslikeC() { return feelslikeC; }
    @SerializedName("feelslike_c")
    public void setFeelslikeC(Double value) { this.feelslikeC = value; }

    @SerializedName("feelslike_f")
    public Double getFeelslikeF() { return feelslikeF; }
    @SerializedName("feelslike_f")
    public void setFeelslikeF(Double value) { this.feelslikeF = value; }

    @SerializedName("windchill_c")
    public Double getWindchillC() { return windchillC; }
    @SerializedName("windchill_c")
    public void setWindchillC(Double value) { this.windchillC = value; }

    @SerializedName("windchill_f")
    public Double getWindchillF() { return windchillF; }
    @SerializedName("windchill_f")
    public void setWindchillF(Double value) { this.windchillF = value; }

    @SerializedName("heatindex_c")
    public Double getHeatindexC() { return heatindexC; }
    @SerializedName("heatindex_c")
    public void setHeatindexC(Double value) { this.heatindexC = value; }

    @SerializedName("heatindex_f")
    public Double getHeatindexF() { return heatindexF; }
    @SerializedName("heatindex_f")
    public void setHeatindexF(Double value) { this.heatindexF = value; }

    @SerializedName("dewpoint_c")
    public Double getDewpointC() { return dewpointC; }
    @SerializedName("dewpoint_c")
    public void setDewpointC(Double value) { this.dewpointC = value; }

    @SerializedName("dewpoint_f")
    public Double getDewpointF() { return dewpointF; }
    @SerializedName("dewpoint_f")
    public void setDewpointF(Double value) { this.dewpointF = value; }

    @SerializedName("will_it_rain")
    public Long getWillItRain() { return willItRain; }
    @SerializedName("will_it_rain")
    public void setWillItRain(Long value) { this.willItRain = value; }

    @SerializedName("chance_of_rain")
    public Long getChanceOfRain() { return chanceOfRain; }
    @SerializedName("chance_of_rain")
    public void setChanceOfRain(Long value) { this.chanceOfRain = value; }

    @SerializedName("will_it_snow")
    public Long getWillItSnow() { return willItSnow; }
    @SerializedName("will_it_snow")
    public void setWillItSnow(Long value) { this.willItSnow = value; }

    @SerializedName("chance_of_snow")
    public Long getChanceOfSnow() { return chanceOfSnow; }
    @SerializedName("chance_of_snow")
    public void setChanceOfSnow(Long value) { this.chanceOfSnow = value; }

    @SerializedName("vis_km")
    public Double getVisKM() { return visKM; }
    @SerializedName("vis_km")
    public void setVisKM(Double value) { this.visKM = value; }

    @SerializedName("vis_miles")
    public Long getVisMiles() { return visMiles; }
    @SerializedName("vis_miles")
    public void setVisMiles(Long value) { this.visMiles = value; }

    @SerializedName("gust_mph")
    public Double getGustMph() { return gustMph; }
    @SerializedName("gust_mph")
    public void setGustMph(Double value) { this.gustMph = value; }

    @SerializedName("gust_kph")
    public Double getGustKph() { return gustKph; }
    @SerializedName("gust_kph")
    public void setGustKph(Double value) { this.gustKph = value; }

    @SerializedName("uv")
    public Long getUv() { return uv; }
    @SerializedName("uv")
    public void setUv(Long value) { this.uv = value; }
}
