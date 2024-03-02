package com.api.apiblog.Service;




import com.api.apiblog.Dto.Photodto;
import com.api.apiblog.Entity.PhotosEntity;

import java.util.List;

public interface PhotoService {

//	PagedResponse<photores> getAllPhotos(int page, int size);

	Photodto getone(Long id);

	Photodto updatePhoto(Long id,Photodto photodto);

	Photodto addPhoto(Photodto photoRequest);
	List<Photodto> getallphoto();
	void deletephoto(Long id);
	 List<Photodto> getAllPhotoByAlbum(Long id);



}