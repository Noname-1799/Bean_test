package org.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class Users{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="user_id_seq")
    private Integer id;

    private String name;
}
