package br.com.dioapi.dioapi.resources;

import br.com.dioapi.dioapi.connectors.HGBrazilConnector;
import br.com.dioapi.dioapi.models.HGBrazilResponse;
import br.com.dioapi.dioapi.models.WeatherForecastResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeatherForecastResource {
    @Autowired
    HGBrazilConnector connector;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value="/")
    public ResponseEntity<WeatherForecastResponseModel> test() {

        var returnAPI = connector.fetchWeatherForCity("Recife, pe");
        WeatherForecastResponseModel ret = null;

        if (returnAPI != null) {
            ret = WeatherForecastResponseModel
                    .builder()
                    .cityName(ret.getCityName())
                    .hour(ret.getHour())
                    .temperature(ret.getTemperature())
                    .date(ret.getDate())
                    .build();
        }
        return ResponseEntity.ok(ret);

    }
}
