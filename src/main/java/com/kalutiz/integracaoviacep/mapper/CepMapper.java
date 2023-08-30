package com.kalutiz.integracaoviacep.mapper;

import com.kalutiz.integracaoviacep.dto.CepDTO;
import com.kalutiz.integracaoviacep.entities.CepEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CepMapper {

    CepMapper INSTANCE = Mappers.getMapper(CepMapper.class);

    @Mapping(source = "cep", target = "cep")
    @Mapping(source = "logradouro", target = "logradouro")
    @Mapping(source = "complemento", target = "complemento")
    @Mapping(source = "bairro", target = "bairro")
    @Mapping(source = "localidade", target = "localidade")
    @Mapping(source = "uf", target = "uf")
    CepDTO cepEntityToCepDTO(CepEntity cepEntity);

}