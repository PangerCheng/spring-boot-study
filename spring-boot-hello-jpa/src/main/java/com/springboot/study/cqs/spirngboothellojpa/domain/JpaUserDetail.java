package com.springboot.study.cqs.spirngboothellojpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class JpaUserDetail implements Serializable {
    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String userId;
    @Column(nullable = true)
    private String address;
    @Column(nullable = true)
    private String hobby;

    public JpaUserDetail() {
    }

    public JpaUserDetail(String userId, String address, String hobby) {
        this.userId = userId;
        this.address = address;
        this.hobby = hobby;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "JpaUserDetail{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", address='" + address + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}