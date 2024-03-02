package com.api.apiblog.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "photos", schema = "blogapi", catalog = "")
public class PhotosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "thumbnail_url")
    private String thumbnailUrl;
    @Basic
    @Column(name = "album_id")
    private Object albumId;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Basic
    @Column(name = "created_by")
    private Object createdBy;
    @Basic
    @Column(name = "updated_by")
    private Object updatedBy;


}
