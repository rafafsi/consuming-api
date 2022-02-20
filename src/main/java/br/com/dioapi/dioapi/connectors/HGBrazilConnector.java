package br.com.dioapi.dioapi.connectors;


import br.com.dioapi.dioapi.models.HGBrazilResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import org.springframework.web.util.UriComponentsBuilder;

@Component
@Slf4j
public class HGBrazilConnector {

    private final String SCHEME = "https";
    private static final String HOST = "api.hgbrasil.com";
    private static final String URI = "weather";
    private static final String API_KEYS = "eaee8e87";
    private static final String API_FIELDS = "only_results, temp, humity, wind_speed, sunrise, sunset, city_name, forecast, max, min, date";
    private static final int MAX_ARRAY_RESULTS = 3;

    @Autowired
    private RestTemplate restTemplate;

    public HGBrazilResponse fetchWeatherForCity (String city) {

        log.info("Consulting the HG Brazil API for the city {}", city);
        HttpEntity<?> entity = createHeader();
        UriComponentsBuilder createdUriBuilder = createUriBuilder(city);

        final ResponseEntity<HGBrazilResponse> responseEntity =
                this.restTemplate.exchange(createdUriBuilder.toUriString(),
                        HttpMethod.GET,
                        entity,
                        HGBrazilResponse.class);
        HGBrazilResponse response = responseEntity.getBody();
        return response;
    }

    private UriComponentsBuilder createUriBuilder(String city) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.newInstance();
        uriBuilder.scheme(SCHEME).host(HOST).path(URI);
        uriBuilder.queryParam("key", API_KEYS);
        uriBuilder.queryParam("array_limit", MAX_ARRAY_RESULTS);
        uriBuilder.queryParam("fields", API_FIELDS);
        uriBuilder.queryParam("city", city);
        return uriBuilder;
    }

    private HttpEntity<?> createHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<>(headers);
    }
}
