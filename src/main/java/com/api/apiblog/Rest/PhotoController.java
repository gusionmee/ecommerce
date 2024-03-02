package com.api.apiblog.Rest;

import com.api.apiblog.Dto.Photodto;
import com.api.apiblog.Service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/photos")
public class PhotoController {
	@Autowired
	private PhotoService photoService;






	@GetMapping("/{id}")
	public ResponseEntity<Photodto> getPhoto(@PathVariable(name = "id") Long id) {
		Photodto photo=photoService.getone(id);

		return ResponseEntity.status(HttpStatus.OK).body(photo);

	}


}
