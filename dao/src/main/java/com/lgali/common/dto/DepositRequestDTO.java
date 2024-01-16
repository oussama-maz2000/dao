package com.lgali.common.dto;


import com.lgali.common.dao.entity.User;
import com.lgali.common.enums.ServiceType;
import com.lgali.common.enums.StatusRequest;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;
import java.sql.Timestamp;


@Data
@ToString
@NoArgsConstructor
public class DepositRequestDTO {
    private MultipartFile receivedImage;
    private byte[] contentImage;
    private String requestText;
    private Timestamp receivedRequestTimeUTC=new Timestamp(System.currentTimeMillis());
    private ServiceType serviceType;
    private double longitude;
    private double latitude;
    private StatusRequest status;
    private User user;
}


