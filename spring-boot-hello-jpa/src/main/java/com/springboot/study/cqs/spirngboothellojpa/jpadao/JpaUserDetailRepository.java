package com.springboot.study.cqs.spirngboothellojpa.jpadao;


import com.springboot.study.cqs.spirngboothellojpa.domain.JpaUserDetail;
import com.springboot.study.cqs.spirngboothellojpa.domain.JpaUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JpaUserDetailRepository extends JpaRepository<JpaUserDetail, Long> {

    JpaUserDetail  findByHobby(String hobby);

    @Query("select u.userName as userName, u.email as email, d.address as address , d.hobby as hobby from JpaUser u , JpaUserDetail d " +
        "where u.id=d.userId  and  u.userName = ?1 ")
    List<JpaUserInfo> findUserInfoByUserName(String userName);
}