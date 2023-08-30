package com.kalutiz.integracaoviacep.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

public class CepUtil {

    private static final String URL = "https://viacep.com.br/ws/";

    public static WebClient webClient() {
        WebClient client = WebClient.builder()
                .baseUrl(URL)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
        return client;
    }
}
