package com.api.apiblog.Entity;

import jakarta.persistence.*;
import java.util.Set;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Roles", schema = "commerce", catalog = "")
public class RolesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "role_is")
    private long roleIs;
    @Basic
    @Column(name = "Role_name")
    private String roleName;
    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "Roles_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    Set<UsersEntity> usersEntity;


}
