package com.kalutiz.integracaoviacep.mapper;

import com.kalutiz.integracaoviacep.dto.CepDTO;
import com.kalutiz.integracaoviacep.entities.Cep;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CepMapper {
    CepMapper INSTANCE = Mappers.getMapper( CepMapper.class );

    @Mapping(target = "cep", source = "cep")
    CepDTO cepToCepDto(Cep cep);

}
