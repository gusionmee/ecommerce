package com.api.apiblog.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "geo", schema = "blogapi", catalog = "")
public class GeoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Object id;
    @Basic
    @Column(name = "lat")
    private String lat;
    @Basic
    @Column(name = "lng")
    private String lng;
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

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
    }

    public Object getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoEntity geoEntity = (GeoEntity) o;
        return Objects.equals(id, geoEntity.id) && Objects.equals(lat, geoEntity.lat) && Objects.equals(lng, geoEntity.lng) && Objects.equals(createdAt, geoEntity.createdAt) && Objects.equals(updatedAt, geoEntity.updatedAt) && Objects.equals(createdBy, geoEntity.createdBy) && Objects.equals(updatedBy, geoEntity.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lat, lng, createdAt, updatedAt, createdBy, updatedBy);
    }
}
