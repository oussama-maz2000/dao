package com.lgali.common.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.sql.Timestamp;


@Data
@ToString
@NoArgsConstructor
public class AddressDTO {
    private String street;
    private String townShip;
    private String common;
    private String city;
    private Timestamp lastUpdateDateUTC=new Timestamp(System.currentTimeMillis());



}
