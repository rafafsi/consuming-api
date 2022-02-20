package br.com.dioapi.dioapi.models;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "date",
        "weekday",
        "max",
        "min",
        "description",
        "condition"
})
@Generated("jsonschema2pojo")
public class Forecast {

    @JsonProperty("date")
    public String date;
    @JsonProperty("weekday")
    public String weekday;
    @JsonProperty("max")
    public Integer max;
    @JsonProperty("min")
    public Integer min;
    @JsonProperty("description")
    public String description;
    @JsonProperty("condition")
    public String condition;

}