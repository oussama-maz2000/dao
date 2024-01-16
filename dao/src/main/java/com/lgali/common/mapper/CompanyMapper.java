package com.lgali.common.mapper;


import com.lgali.common.dao.entity.Company;
import com.lgali.common.dto.CompanyDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    @Mapping(source = "user", target = "userDto")
    @Mapping(source = "companyAddress", target = "companyAddressDTO")
    CompanyDTO mapFromCompanyEntity(Company company);


    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    @Mapping(target = "companyAddress", ignore = true)
    Company mapFromCompanyDto(CompanyDTO companyDTO);


    @Mapping(target = "user", ignore = true)
    @Mapping(target = "companyAddress", ignore = true)
List<CompanyDTO> mapFromListCompany(List<Company> companyList);
}
