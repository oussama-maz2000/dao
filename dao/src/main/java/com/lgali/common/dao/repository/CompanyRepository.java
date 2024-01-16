package com.lgali.common.dao.repository;

import com.lgali.common.dao.entity.Company;
import com.lgali.common.enums.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    @Query(value = "select * from lgl_company  where LGL_FK_USER_ID = :userID", nativeQuery = true)
    public List<Company> findCompaniesByUserID(@Param("userID") Long userID);

    @Query(value = "select * from lgl_company where LGL_FK_ADDRESS_ID = :addressID", nativeQuery = true)
    public List<Company> findCompaniesByAddressID(@Param("addressID") Long addressID);

    @Query(value = "select * from lgl_company  where LGL_COMPANY_ID = :companyID", nativeQuery = true)
    public Company findCompanyById(@Param("companyID") Long companyID);

    @Query(value = "select * from lgl_company where LGL_FK_ADDRESS_ID = :addressID and LGL_COMPANY_TYPE = :type",nativeQuery = true)
    public List<Company> findCompaniesWithService(@Param("addressID") Long addressID,@Param("type") String type);
}
