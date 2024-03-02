package com.api.apiblog.Service.impl;



import com.api.apiblog.Dto.Photodto;
import com.api.apiblog.Entity.PhotosEntity;
import com.api.apiblog.Exception.ResourceNotFound;
import com.api.apiblog.Service.PhotoService;
import com.api.apiblog.repository.PhotoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PhotoServiceImpl implements PhotoService {

	@Autowired
	private PhotoRepository photoRepository;
	@Autowired
	private ModelMapper modelMapper;






	@Override
	public Photodto getone(Long id) {
		PhotosEntity photo=photoRepository.findById(id).orElseThrow(()-> new ResourceNotFound("id not found"));

        return covertodto(photo);
	}

	@Override
	public Photodto updatePhoto(Long id, Photodto photodto) {
		return null;
	}

	@Override
	public Photodto addPhoto(Photodto photoRequest) {
		return null;
	}

	@Override
	public List<Photodto> getallphoto() {
		return null;
	}

	@Override
	public void deletephoto(Long id) {

	}

	@Override
	public List<Photodto> getAllPhotoByAlbum(Long id) {
		return null;
	}

	public Photodto covertodto(PhotosEntity photo){
		return modelMapper.map(photo,Photodto.class);
	}
	public PhotosEntity convertoentity(Photodto photodto){
		return modelMapper.map(photodto,PhotosEntity.class);
	}




}
