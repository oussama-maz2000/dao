package com.lgali.common.mapper;

import com.lgali.common.dao.entity.Address;
import com.lgali.common.dto.AddressDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressDTO mapFromAddressEntity(Address address);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "longitude", ignore = true)
    @Mapping(target = "latitude", ignore = true)
    @Mapping(target = "cluster", ignore = true)
    Address mapFromAddressDto(AddressDTO addressDTO);
}
