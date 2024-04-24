package com.api.apiblog.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users", schema = "commerce", catalog = "")
public class UsersEntity {
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "FistName")
    private String fistName;
    @Basic
    @Column(name = "LastName")
    private String lastName;
    @Basic
    @Column(name = "Mobile")
    private String mobile;
    @Basic
    @Column(name = "Pass")
    private String pass;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @ManyToMany
    @JoinTable(
            name = "Users_Andress",
            joinColumns = @JoinColumn(name = "Users_id"),
            inverseJoinColumns = @JoinColumn(name = "Andress_id")
    )
    Set<AndressEntity> andressEntity;
    @ManyToMany(mappedBy = "usersEntity")
    Set<RolesEntity> rolesEntities;
    @OneToMany(mappedBy = "usersEntity")
    private Set<CartsEntity> cartsEntities;
}
