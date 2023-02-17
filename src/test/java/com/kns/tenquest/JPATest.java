package com.kns.tenquest;

import com.kns.tenquest.entity.UserEntity;
import com.kns.tenquest.Repository.UserRepository;
import groovy.util.logging.Slf4j;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@Slf4j
@SpringBootTest
public class JPATest {

    @Autowired
    UserRepository repository;

    @BeforeEach
    void setUp(){ }

    @AfterEach
    void tearDown(){
        repository.deleteAll();
    }

    @Test
    void INSERT_TEST(){
        UserEntity user = new UserEntity();
        user.setMember_id(UUID.randomUUID());
        user.setUser_id("songarden");
        user.setUser_info("1234");
        user.setUser_email("songarden@naver.com");
        user.setUser_name("손정원");

        repository.save(user);

        UserEntity entity = repository.findById(user.getMember_id()).get();
    }

    @Test
    @Transactional
    void UPDATE_TEST(){
        UserEntity user = new UserEntity();
        user.setMember_id(UUID.randomUUID());
        user.setUser_id("songarden");
        user.setUser_info("1234");
        user.setUser_email("songarden@naver.com");
        user.setUser_name("손정원");
        repository.save(user);

        UserEntity entity = repository.findById(user.getMember_id()).get();
        entity.setUser_id("garden");
        entity.setUser_name("정원");

        UserEntity updated = repository.findById(user.getMember_id()).get();

    }
}
