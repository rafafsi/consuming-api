package br.com.dioapi.dioapi.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WeatherForecastResponseModel {

    private Integer hour;
    private Integer temperature;
    private String date;
    private String cityName;
}
