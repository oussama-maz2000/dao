package com.lgali.common.dao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "LGL_ADDRESS")
@Table
@Data
@ToString
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LGL_ADDRESS_ID", nullable = false)
    private Long id;

    @Column(name = "LGL_ADDRESS_ADDRESS", nullable = false, length = 40)
    private String address
            ;
    @Column(name = "LGL_ADDRESS_STREET", nullable = false, length = 50)
    private String street;

    @Column(name = "LGL_ADDRESS_CITY", nullable = false, length = 20)
    private String city;

    @Column(name = "LGL_ADDRESS_STATE", nullable = false, length = 20)
    private String state;

    @Column(name = "LGL_ADDRESS_LONGITUDE", nullable = false)
    private double longitude;

    @Column(name = "LGL_ADDRESS_LATITUDE", nullable = false)
    private double latitude;

    @Column(name = "LGL_ADDRESS_CLUSTER", nullable = false)
    private int cluster = -1;

    @Column(name = "LGL_ADDRESS_LAST_UPDATE", nullable = false)
    private Timestamp lastUpdateDateUTC;

}
