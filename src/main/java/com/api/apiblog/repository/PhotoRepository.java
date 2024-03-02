package com.api.apiblog.repository;


import com.api.apiblog.Entity.PhotosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<PhotosEntity, Long> {
//	Page<Photo> findByAlbumId(Long albumId, Pageable pageable);
}
