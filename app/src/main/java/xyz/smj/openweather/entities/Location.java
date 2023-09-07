package xyz.smj.openweather.entities;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Location implements Serializable {
    private String name;
    private String region;
    private String country;
    private Double lat;
    private Double lon;
    private String tzID;
    private Long localtimeEpoch;
    private String localtime;

    @SerializedName("name")
    public String getName() { return name; }
    @SerializedName("name")
    public void setName(String value) { this.name = value; }

    @SerializedName("region")
    public String getRegion() { return region; }
    @SerializedName("region")
    public void setRegion(String value) { this.region = value; }

    @SerializedName("country")
    public String getCountry() { return country; }
    @SerializedName("country")
    public void setCountry(String value) { this.country = value; }

    @SerializedName("lat")
    public Double getLat() { return lat; }
    @SerializedName("lat")
    public void setLat(Double value) { this.lat = value; }

    @SerializedName("lon")
    public Double getLon() { return lon; }
    @SerializedName("lon")
    public void setLon(Double value) { this.lon = value; }

    @SerializedName("tz_id")
    public String getTzID() { return tzID; }
    @SerializedName("tz_id")
    public void setTzID(String value) { this.tzID = value; }

    @SerializedName("localtime_epoch")
    public Long getLocaltimeEpoch() { return localtimeEpoch; }
    @SerializedName("localtime_epoch")
    public void setLocaltimeEpoch(Long value) { this.localtimeEpoch = value; }

    @SerializedName("localtime")
    public String getLocaltime() { return localtime; }
    @SerializedName("localtime")
    public void setLocaltime(String value) { this.localtime = value; }
}
