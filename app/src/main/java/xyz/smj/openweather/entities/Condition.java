package xyz.smj.openweather.entities;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Condition  implements Serializable {
    private String text;
    private String icon;
    private Long code;

    @SerializedName("text")
    public String getText() { return text; }
    @SerializedName("text")
    public void setText(String value) { this.text = value; }

    @SerializedName("icon")
    public String getIcon() { return icon; }
    @SerializedName("icon")
    public void setIcon(String value) { this.icon = value; }

    @SerializedName("code")
    public Long getCode() { return code; }
    @SerializedName("code")
    public void setCode(Long value) { this.code = value; }
}
