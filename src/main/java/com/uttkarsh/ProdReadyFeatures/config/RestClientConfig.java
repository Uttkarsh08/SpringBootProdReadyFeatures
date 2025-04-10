package com.uttkarsh.ProdReadyFeatures.config;

import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.client.RestClient;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Configuration
public class RestClientConfig {

    @Value("${employeeService.base.url}")
    private String BASE_URL;

    //RestClient is a Http Client(used to make API request), it is comparable to retrofit of Android
    //we are using our own made application(SpringBootWebServices) to learn RestClient

    @Bean
    @Qualifier("employeeClient")
    RestClient getEmployeeServiceRestClient(){
        return RestClient
                .builder()
                .baseUrl(BASE_URL)
                .defaultHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE)
                .defaultStatusHandler(HttpStatusCode::is5xxServerError, (req, res)->{
                    throw new RuntimeException("Server Error Occurred");
                })
                .build();
    }
}
