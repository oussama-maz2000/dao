package com.lgali.common.dao.entity;

import com.lgali.common.enums.ServiceType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.sql.Timestamp;


@NoArgsConstructor
@ToString
@Data
@Entity(name = "LGL_COMPANY")
@Table
@Transactional
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LGL_COMPANY_ID", nullable = false)
    private Long id;

    @Column(name = "LGL_COMPANY_NAME", nullable = false,length = 30)
    private String companyName;

    @Column(name = "LGL_COMPANY_EMAIL", nullable = false,length = 30)
    private String companyEmail;

    @Column(name = "LGL_COMPANY_PHONE", nullable = false,length = 20)
    private String companyPhone;

    @Column(name = "LGL_COMPANY_TYPE", nullable = false,length = 30)
    @Enumerated(EnumType.STRING)
    private ServiceType companyType;

    @Column(name = "LGL_COMPANY_DESCRIPTION", nullable = false,length = 100)
    private String companyDescription;

    @Column(name = "LGL_COMPANY_DISABLE", nullable=false)
    private boolean disable=false;

    @Column(name = "LGL_COMPANY_CREATED_AT", nullable = false )
    private Timestamp createdAtDateUTC;

    @ManyToOne(fetch = FetchType.EAGER,cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name = "LGL_FK_USER_ID", nullable = false)
    private User user;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "LGL_FK_ADDRESS_ID", nullable = false)
    private Address companyAddress;

}
