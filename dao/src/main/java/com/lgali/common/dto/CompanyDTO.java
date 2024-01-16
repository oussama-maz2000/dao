package com.lgali.common.dto;


import com.lgali.common.enums.ServiceType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.sql.Timestamp;

@Data
@ToString
@NoArgsConstructor
public class CompanyDTO {
    private String companyName;
    private String companyEmail;
    private String companyPhone;
    private ServiceType companyType;
    private String companyDescription;
    private Timestamp createdAtDateUTC=new Timestamp(System.currentTimeMillis());
    private boolean disable;
    private UserDTO userDto;
    private AddressDTO companyAddressDTO;
}
