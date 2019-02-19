package com.springboot.study.cqs.springboothellojpa.jpadao;

import com.springboot.study.cqs.spirngboothellojpa.domain.JpaUserDetail;
import com.springboot.study.cqs.spirngboothellojpa.domain.JpaUserInfo;
import com.springboot.study.cqs.spirngboothellojpa.jpadao.JpaUserDetailRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaUserDetailRepositoryTest {

    @Resource
    private JpaUserDetailRepository jpaUserDetailRepositoryRepository;

    @Test
    public void testJpaUserDetailPepository() {
        JpaUserDetail jpaUserDetail = new JpaUserDetail("1","成都","1111");
        jpaUserDetailRepositoryRepository.save(jpaUserDetail);

        List<JpaUserInfo> jpaUserInfos = jpaUserDetailRepositoryRepository.findUserInfoByUserName("test1");
        for (JpaUserInfo jpaUserInfo : jpaUserInfos) {
            System.out.println(jpaUserInfo.getAddress());
            System.out.println(jpaUserInfo.getUserName());
        }
    }
}
