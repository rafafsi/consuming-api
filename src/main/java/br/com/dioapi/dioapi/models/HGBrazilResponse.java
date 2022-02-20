package br.com.dioapi.dioapi.models;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "by",
        "valid_key",
        "results",
        "execution_time",
        "from_cache"
})
@Generated("jsonschema2pojo")
public class HGBrazilResponse {

    @JsonProperty("by")
    public String by;
    @JsonProperty("valid_key")
    public Boolean validKey;
    @JsonProperty("results")
    public Results results;
    @JsonProperty("execution_time")
    public Integer executionTime;
    @JsonProperty("from_cache")
    public Boolean fromCache;

}