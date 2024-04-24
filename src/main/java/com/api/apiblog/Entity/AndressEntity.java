package com.api.apiblog.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Andress", schema = "commerce", catalog = "")
public class AndressEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "andress_id")
    private long andressId;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "Country")
    private String country;
    @ManyToMany(mappedBy = "andressEntity")
    Set<UsersEntity> usersEntity;


}
