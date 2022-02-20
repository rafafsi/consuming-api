package br.com.dioapi.dioapi.models;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "temp",
        "date",
        "time",
        "condition_code",
        "description",
        "currently",
        "cid",
        "city",
        "img_id",
        "humidity",
        "wind_speedy",
        "sunrise",
        "sunset",
        "condition_slug",
        "city_name",
        "forecast"
})
@Generated("jsonschema2pojo")
public class Results {

    @JsonProperty("temp")
    public Integer temp;
    @JsonProperty("date")
    public String date;
    @JsonProperty("time")
    public String time;
    @JsonProperty("condition_code")
    public String conditionCode;
    @JsonProperty("description")
    public String description;
    @JsonProperty("currently")
    public String currently;
    @JsonProperty("cid")
    public String cid;
    @JsonProperty("city")
    public String city;
    @JsonProperty("img_id")
    public String imgId;
    @JsonProperty("humidity")
    public Integer humidity;
    @JsonProperty("wind_speedy")
    public String windSpeedy;
    @JsonProperty("sunrise")
    public String sunrise;
    @JsonProperty("sunset")
    public String sunset;
    @JsonProperty("condition_slug")
    public String conditionSlug;
    @JsonProperty("city_name")
    public String cityName;
    @JsonProperty("forecast")
    public List<Forecast> forecast = null;

}