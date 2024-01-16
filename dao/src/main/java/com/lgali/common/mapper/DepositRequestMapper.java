package com.lgali.common.mapper;


import com.lgali.common.dao.entity.DepositRequest;
import com.lgali.common.dto.DepositRequestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DepositRequestMapper {

    @Mapping(target = "receivedImage", ignore = true)
    @Mapping(target = "contentImage", source="contentImage")
    DepositRequestDTO mapFromDepositRequestEntity(DepositRequest depositRequest);


    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)

    DepositRequest mapFromDepositRequestDto(DepositRequestDTO depositRequestDTO);


    @Mapping(target = "requestImage", ignore = true)
    @Mapping(target = "imageContent",source = "requestImage")
    List<DepositRequestDTO> mapListFromEntity(List<DepositRequest>depositRequestList);
}
