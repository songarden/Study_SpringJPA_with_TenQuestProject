package com.kns.tenquest.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="user_table")
@Getter
@Setter
public class UserEntity {
    @Id
    private UUID member_id;
    private String user_id;
    private String user_info;
    private String user_name;
    private String user_email;

}
