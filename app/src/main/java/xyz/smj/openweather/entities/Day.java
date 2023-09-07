package xyz.smj.openweather.entities;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Day implements Serializable {
    @SerializedName("maxtemp_c")
    private Double maxtempC;
    private Double maxtempF;
    @SerializedName("mintemp_c")

    private Double mintempC;
    private Double mintempF;
    private Double avgtempC;
    private Double avgtempF;
    private Double maxwindMph;
    private Double maxwindKph;
    private Double totalprecipMm;
    private Double totalprecipIn;
    private Long totalsnowCM;
    private Double avgvisKM;
    private Long avgvisMiles;
    private Long avghumidity;
    private Long dailyWillItRain;
    private Long dailyChanceOfRain;
    private Long dailyWillItSnow;
    private Long dailyChanceOfSnow;
    private Condition condition;
    private Long uv;


    public Double getMaxtempC() { return maxtempC; }
    @SerializedName("maxtemp_c")
    public void setMaxtempC(Double value) { this.maxtempC = value; }

    @SerializedName("maxtemp_f")
    public Double getMaxtempF() { return maxtempF; }
    @SerializedName("maxtemp_f")
    public void setMaxtempF(Double value) { this.maxtempF = value; }

    public Double getMintempC() { return mintempC; }
    @SerializedName("mintemp_c")
    public void setMintempC(Double value) { this.mintempC = value; }

    @SerializedName("mintemp_f")
    public Double getMintempF() { return mintempF; }
    @SerializedName("mintemp_f")
    public void setMintempF(Double value) { this.mintempF = value; }

    @SerializedName("avgtemp_c")
    public Double getAvgtempC() { return avgtempC; }
    @SerializedName("avgtemp_c")
    public void setAvgtempC(Double value) { this.avgtempC = value; }

    @SerializedName("avgtemp_f")
    public Double getAvgtempF() { return avgtempF; }
    @SerializedName("avgtemp_f")
    public void setAvgtempF(Double value) { this.avgtempF = value; }

    @SerializedName("maxwind_mph")
    public Double getMaxwindMph() { return maxwindMph; }
    @SerializedName("maxwind_mph")
    public void setMaxwindMph(Double value) { this.maxwindMph = value; }

    @SerializedName("maxwind_kph")
    public Double getMaxwindKph() { return maxwindKph; }
    @SerializedName("maxwind_kph")
    public void setMaxwindKph(Double value) { this.maxwindKph = value; }

    @SerializedName("totalprecip_mm")
    public Double getTotalprecipMm() { return totalprecipMm; }
    @SerializedName("totalprecip_mm")
    public void setTotalprecipMm(Double value) { this.totalprecipMm = value; }

    @SerializedName("totalprecip_in")
    public Double getTotalprecipIn() { return totalprecipIn; }
    @SerializedName("totalprecip_in")
    public void setTotalprecipIn(Double value) { this.totalprecipIn = value; }

    @SerializedName("totalsnow_cm")
    public Long getTotalsnowCM() { return totalsnowCM; }
    @SerializedName("totalsnow_cm")
    public void setTotalsnowCM(Long value) { this.totalsnowCM = value; }

    @SerializedName("avgvis_km")
    public Double getAvgvisKM() { return avgvisKM; }
    @SerializedName("avgvis_km")
    public void setAvgvisKM(Double value) { this.avgvisKM = value; }

    @SerializedName("avgvis_miles")
    public Long getAvgvisMiles() { return avgvisMiles; }
    @SerializedName("avgvis_miles")
    public void setAvgvisMiles(Long value) { this.avgvisMiles = value; }

    @SerializedName("avghumidity")
    public Long getAvghumidity() { return avghumidity; }
    @SerializedName("avghumidity")
    public void setAvghumidity(Long value) { this.avghumidity = value; }

    @SerializedName("daily_will_it_rain")
    public Long getDailyWillItRain() { return dailyWillItRain; }
    @SerializedName("daily_will_it_rain")
    public void setDailyWillItRain(Long value) { this.dailyWillItRain = value; }

    @SerializedName("daily_chance_of_rain")
    public Long getDailyChanceOfRain() { return dailyChanceOfRain; }
    @SerializedName("daily_chance_of_rain")
    public void setDailyChanceOfRain(Long value) { this.dailyChanceOfRain = value; }

    @SerializedName("daily_will_it_snow")
    public Long getDailyWillItSnow() { return dailyWillItSnow; }
    @SerializedName("daily_will_it_snow")
    public void setDailyWillItSnow(Long value) { this.dailyWillItSnow = value; }

    @SerializedName("daily_chance_of_snow")
    public Long getDailyChanceOfSnow() { return dailyChanceOfSnow; }
    @SerializedName("daily_chance_of_snow")
    public void setDailyChanceOfSnow(Long value) { this.dailyChanceOfSnow = value; }

    @SerializedName("condition")
    public Condition getCondition() { return condition; }
    @SerializedName("condition")
    public void setCondition(Condition value) { this.condition = value; }

    @SerializedName("uv")
    public Long getUv() { return uv; }
    @SerializedName("uv")
    public void setUv(Long value) { this.uv = value; }
}
