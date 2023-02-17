package com.kns.tenquest.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="member_test")
@Getter
@Setter
@Data
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID member_id;
    private String user_id;
    private String user_info;
    private String user_name;
    private String user_email;

}
