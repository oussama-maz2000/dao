package com.lgali.common.dao.entity;

import com.lgali.common.enums.ServiceType;
import com.lgali.common.enums.UserType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "LGL_USER")
@Table
@Data
@ToString
@NoArgsConstructor
@Transactional
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LGL_USER_ID", nullable = false)
    private Long id;

    @Column(name = "LGL_USER_FIRST_NAME", nullable = false,length = 30)
    private String userFirstName;

    @Column(name = "LGL_USER_LAST_NAME", nullable = false,length = 30)
    private String userLastName;

    @Column(name = "LGL_USER_EMAIL", nullable = false,length = 30)
    private String userEmail;

    @Column(name = "LGL_USER_PASSWORD", nullable = false,length = 30)
    private String userPassword;

    @Column(name = "LGL_USER_PHONE", nullable = false,length = 20)
    private String userPhone;

    @Column(name = "LGL_USER_TYPE", nullable = false)
    private UserType userType;

    @Column(name = "LGL_USER_JOB", nullable = true,length = 30)
    @Enumerated(EnumType.STRING)
    private ServiceType userJob;

    @Column(name = "LGL_USER_CREATED_AT", nullable = false)
    private Timestamp createdAtDateUTC;





}

