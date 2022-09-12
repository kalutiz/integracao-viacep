package com.kalutiz.integracaoviacep.services;

import com.kalutiz.integracaoviacep.dto.CepDTO;
import com.kalutiz.integracaoviacep.utils.CepUtil;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    private static final String PATH = "/json/";

    public CepDTO findCep(String cep) {
        String endpoint = cep + PATH;
        CepDTO mono = CepUtil.webClient()
                .get()
                .uri(builder -> builder.path(endpoint).build())
                .retrieve()
                .bodyToMono(CepDTO.class)
                .block();
        return mono;
    }
}
