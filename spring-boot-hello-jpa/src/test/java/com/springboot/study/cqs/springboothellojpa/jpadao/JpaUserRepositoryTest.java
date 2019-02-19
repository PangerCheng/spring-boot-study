package com.springboot.study.cqs.springboothellojpa.jpadao;

import com.springboot.study.cqs.spirngboothellojpa.domain.JpaUser;
import com.springboot.study.cqs.spirngboothellojpa.jpadao.JpaUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaUserRepositoryTest {

    @Resource
    private JpaUserRepository jpaUserRepository;

    @Test
    public void testJpaUserPepository() {
        /*jpaUserRepository.save(new JpaUser("test1","test1","test1","test1",new Date()));
        jpaUserRepository.save(new JpaUser("test2","test2","test2","test2",new Date()));
        jpaUserRepository.save(new JpaUser("test3","test3","test3","test3",new Date()));
        jpaUserRepository.save(new JpaUser("test4","test4","test4","test4",new Date()));*/

        /*Assert.assertEquals(4, jpaUserRepository.findAll().size());
        Assert.assertEquals("test2", jpaUserRepository.findByUserName("test2").getPassWord());

        System.out.println(jpaUserRepository.findByUserName("test2").getPassWord());

        List<JpaUser> jpaUsers = jpaUserRepository.findByUserNameContaining("test");
        for (JpaUser jpaUser : jpaUsers) {
            System.out.println(jpaUser.toString());
        }*/

        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(0,4,sort );

        List<JpaUser> jpaUsers = jpaUserRepository.findAllJpaUser(pageable);
        for (JpaUser jpaUser : jpaUsers) {
            System.out.println(jpaUser.toString());
        }
    }
}
