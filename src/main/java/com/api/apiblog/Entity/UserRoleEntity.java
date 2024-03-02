package com.api.apiblog.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_role", schema = "blogapi", catalog = "")
public class UserRoleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "user_id")
    private Object userId;
    @Basic
    @Column(name = "role_id")
    private Object roleId;


}
