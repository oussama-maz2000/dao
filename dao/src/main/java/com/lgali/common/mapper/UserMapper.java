package com.lgali.common.mapper;


import com.lgali.common.dao.entity.User;
import com.lgali.common.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses =AddressMapper.class)
public interface UserMapper {

    UserDTO mapFromUserEntity(User user);

    @Mapping(target = "id", ignore = true)
    User mapFromUserDto(UserDTO userDto);
}
