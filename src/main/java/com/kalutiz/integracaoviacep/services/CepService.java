package com.kalutiz.integracaoviacep.services;

import com.kalutiz.integracaoviacep.dto.CepDTO;
import com.kalutiz.integracaoviacep.entities.CepEntity;
import com.kalutiz.integracaoviacep.mapper.CepMapper;
import com.kalutiz.integracaoviacep.utils.CepUtil;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    private static final String PATH = "/json/";

    public CepDTO findCep(String cep) {
        String endpoint = cep + PATH;
        CepEntity entity = CepUtil.webClient()
                .get()
                .uri(builder -> builder.path(endpoint).build())
                .retrieve()
                .bodyToMono(CepEntity.class)
                .block();
        CepDTO dto = CepMapper.INSTANCE.cepEntityToCepDTO(entity);
        return dto;
    }
}
