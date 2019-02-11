package com.ckapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ckapi.model.response.TrainingResponse;

@RestController
@RequestMapping(ResourceConstants.TRAINING)
public class TrainingResource {
	
	@RequestMapping(path="", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TrainingResponse> getTrainings(){
		
		return new ResponseEntity<>(new TrainingResponse(), HttpStatus.OK);
		
	}

}
