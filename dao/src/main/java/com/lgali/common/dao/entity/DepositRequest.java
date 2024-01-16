package com.lgali.common.dao.entity;

import com.lgali.common.enums.ServiceType;
import com.lgali.common.enums.StatusRequest;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "LGL_DEPOSIT_REQUEST")
@Table
@Data
@ToString
@NoArgsConstructor
@Transactional
public class DepositRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LGL_DEPOSIT_REQUEST_ID",nullable = false)
    private Long id;

    @Lob
    @Column(name = "LGL_DEPOSIT_REQUEST_IMG",nullable = true)
    private byte[] contentImage;

    @Column(name = "LGL_DEPOSIT_REQUEST_TEXT",nullable = true,length = 255)
    private String requestText;

    @Column(name = "LGL_DEPOSIT_REQUEST_SERVICE_TYPE",nullable = false,length = 50)
    @Enumerated(EnumType.STRING)
    private ServiceType serviceType;

    @Column(name = "LGL_DEPOSIT_REQUEST_LONGITUDE",nullable = false)
    private double longitude;

    @Column(name = "LGL_DEPOSIT_REQUEST_LATITUDE",nullable = false)
    private double latitude;

    @Column(name = "LGL_DEPOSIT_REQUEST_STATUS",nullable = false,length = 20)
    private StatusRequest status;

    @Column(name = "LGL_DEPOSIT_REQUEST_RECEIVED_TIME",nullable = false)
    private Timestamp receivedRequestTimeUTC;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "LGL_FK_USER_ID", nullable = false)
    private User user;


}
