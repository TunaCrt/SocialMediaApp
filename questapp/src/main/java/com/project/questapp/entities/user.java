package com.project.questapp.entities;

import jakarta.persistence.*;

import lombok.Data;


@Entity
@Table(name = "users")
@Data
public class user {

    @Id
    private Long id;

    String userName;
    String password;


}
