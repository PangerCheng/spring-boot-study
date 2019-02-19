package com.springboot.study.cqs.spirngboothellojpa.jpadao;

import com.springboot.study.cqs.spirngboothellojpa.domain.JpaUser;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 类似传统的dao层，该类通过extends JpaRepository来实现JPA
 */
public interface JpaUserRepository extends JpaRepository<JpaUser,Long> {
    JpaUser findByUserName(String userName);
    List<JpaUser> findByUserNameLike(String userName);
    List<JpaUser> findByUserNameContaining(String userName);

    /*分页+自定义查询*/
    @Query("select jpauser from JpaUser jpauser")
    List<JpaUser> findAllJpaUser(Pageable pageable);

}
