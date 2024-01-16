package com.lgali.common.dao.repository;

import com.lgali.common.dao.entity.User;
import com.lgali.common.enums.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value="select * from lgl_user  where LGL_USER_ID = :id",nativeQuery = true)
    public User findUserByID(@Param("id") Long id);

    @Query(value="select * from lgl_user where LGL_FK_ADDRESS_ID = :addressID ",nativeQuery = true)
    public List<User> findUsersByAddressID(@Param("addressID") Long addressID);

    @Query(value="select * from lgl_user where LGL_USER_TYPE = 1",nativeQuery = true)
    public List<User> findProfessionalUsers();

    @Query(value="select * from lgl_user where LGL_USER_TYPE = 0",nativeQuery = true)
    public List<User> findParticularUsers();
}