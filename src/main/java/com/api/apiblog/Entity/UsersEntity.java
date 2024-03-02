package com.api.apiblog.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "blogapi", catalog = "")
public class UsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "address_id")
    private Object addressId;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "website")
    private String website;
    @Basic
    @Column(name = "company_id")
    private Object companyId;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;

}
