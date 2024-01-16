package com.lgali.common.dao.repository;

import com.lgali.common.dao.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address,Long> {

    @Query(value="select LGL_ADDRESS_ID from lgl_address  where LGL_ADDRESS_CLUSTER =:cluster",nativeQuery = true)
    public List<Long> findAddressByCluster(@Param("cluster")int cluster);
}
