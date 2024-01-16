package com.lgali.common.dao.repository;

import com.lgali.common.dao.entity.DepositRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface DepositRequestRepository extends JpaRepository<DepositRequest, Long> {

    @Query(value = "select * from lgl_deposit_request where LGL_FK_USER_ID = :userId", nativeQuery = true)
    public List<DepositRequest> findDepositRequestsByUserID(@Param("userId") Long userId);

    @Query(value = "select * from lgl_deposit_request  where LGL_FK_USER_ID = :userId and LGL_DEPOSIT_REQUEST_ID = :depositRequestId", nativeQuery = true)
    public DepositRequest findDepositRequestByUserID(@Param("userId") Long userId,@Param("depositRequestId")Long depositRequestId);

    @Modifying
    @Transactional
    @Query(value = "update lgl_deposit_request set LGL_DEPOSIT_REQUEST_STATUS=2 where LGL_DEPOSIT_REQUEST_ID = :depositRequestId and LGL_FK_USER_ID = :userId", nativeQuery = true)
    public void updateStatusToFailedById(@Param("userId") Long userId,@Param("depositRequestId")Long depositRequestId);

    @Modifying
    @Transactional
    @Query(value = "delete from lgl_deposit_request where LGL_FK_USER_ID= :userId and  LGL_DEPOSIT_REQUEST_ID= :depositRequestId",nativeQuery = true)
    public void deleteDepositRequest(@Param("userId") Long userId,@Param("depositRequestId")Long depositRequestId);
}
