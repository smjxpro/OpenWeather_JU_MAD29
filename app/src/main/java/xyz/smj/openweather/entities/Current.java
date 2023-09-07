package xyz.smj.openweather.entities;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Current implements Serializable {
    private Long lastUpdatedEpoch;
    @SerializedName("last_updated")

    private String lastUpdated;
    @SerializedName("temp_c")

    private Double tempC;
    private Long tempF;
    private Long isDay;
    private Condition condition;
    private Double windMph;
    private Double windKph;
    private Long windDegree;
    private Long pressureMB;
    private Double pressureIn;
    private Long precipMm;
    private Long precipIn;
    private Long humidity;
    private Long cloud;
    private Double feelslikeC;
    private Double feelslikeF;
    private Long visKM;
    private Long visMiles;
    private Long uv;
    private Double gustMph;
    private Double gustKph;

    @SerializedName("last_updated_epoch")
    public Long getLastUpdatedEpoch() { return lastUpdatedEpoch; }
    @SerializedName("last_updated_epoch")
    public void setLastUpdatedEpoch(Long value) { this.lastUpdatedEpoch = value; }

    public String getLastUpdated() { return lastUpdated; }
    @SerializedName("last_updated")
    public void setLastUpdated(String value) { this.lastUpdated = value; }

    public Double getTempC() { return tempC; }
    @SerializedName("temp_c")
    public void setTempC(Double value) { this.tempC = value; }

    @SerializedName("temp_f")
    public Long getTempF() { return tempF; }
    @SerializedName("temp_f")
    public void setTempF(Long value) { this.tempF = value; }

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
    public Long getPrecipMm() { return precipMm; }
    @SerializedName("precip_mm")
    public void setPrecipMm(Long value) { this.precipMm = value; }

    @SerializedName("precip_in")
    public Long getPrecipIn() { return precipIn; }
    @SerializedName("precip_in")
    public void setPrecipIn(Long value) { this.precipIn = value; }

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

    @SerializedName("vis_km")
    public Long getVisKM() { return visKM; }
    @SerializedName("vis_km")
    public void setVisKM(Long value) { this.visKM = value; }

    @SerializedName("vis_miles")
    public Long getVisMiles() { return visMiles; }
    @SerializedName("vis_miles")
    public void setVisMiles(Long value) { this.visMiles = value; }

    @SerializedName("uv")
    public Long getUv() { return uv; }
    @SerializedName("uv")
    public void setUv(Long value) { this.uv = value; }

    @SerializedName("gust_mph")
    public Double getGustMph() { return gustMph; }
    @SerializedName("gust_mph")
    public void setGustMph(Double value) { this.gustMph = value; }

    @SerializedName("gust_kph")
    public Double getGustKph() { return gustKph; }
    @SerializedName("gust_kph")
    public void setGustKph(Double value) { this.gustKph = value; }
}
