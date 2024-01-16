package com.lgali.common.dto;


import com.lgali.common.enums.ServiceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepositRequestInformation {
    private Long userID;
    private Long depositRequestID;
    private String userPhone;
    private ServiceType requirementService;
    private double longitude;
    private double latitude;
}
