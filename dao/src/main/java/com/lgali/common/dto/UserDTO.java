package com.lgali.common.dto;

import com.lgali.common.enums.UserType;
import lombok.*;
import java.sql.Timestamp;


@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userPassword;
    private String userPhone;
    private UserType userType;
    private Timestamp createdAtDateUTC=new Timestamp(System.currentTimeMillis());
}
