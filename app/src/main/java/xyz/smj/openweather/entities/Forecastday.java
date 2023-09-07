package xyz.smj.openweather.entities;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Forecastday implements Serializable {
    @SerializedName("date")

    private String date;
    private Long dateEpoch;
    private Day day;
    private Astro astro;
    private List<Hour> hour;

    public String getDate() { return date; }
    @SerializedName("date")
    public void setDate(String value) { this.date = value; }

    @SerializedName("date_epoch")
    public Long getDateEpoch() { return dateEpoch; }
    @SerializedName("date_epoch")
    public void setDateEpoch(Long value) { this.dateEpoch = value; }

    @SerializedName("day")
    public Day getDay() { return day; }
    @SerializedName("day")
    public void setDay(Day value) { this.day = value; }

    @SerializedName("astro")
    public Astro getAstro() { return astro; }
    @SerializedName("astro")
    public void setAstro(Astro value) { this.astro = value; }

    @SerializedName("hour")
    public List<Hour> getHour() { return hour; }
    @SerializedName("hour")
    public void setHour(List<Hour> value) { this.hour = value; }
}
