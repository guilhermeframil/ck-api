package com.ckapi.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ckapi.entity.TrainingEntity;
import com.ckapi.model.request.TrainingRequest;
import com.ckapi.model.response.TrainingResponse;
import com.ckapi.repository.TrainingRepository;

@RestController
@RequestMapping(ResourceConstants.TRAINING)
public class TrainingResource {
	
	@Autowired
	TrainingRepository trainingRepository;

	@RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TrainingResponse> getTrainings() {

		return new ResponseEntity<>(new TrainingResponse(), HttpStatus.OK);

	}
	
	@RequestMapping(path = "/{trainingId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public  ResponseEntity<TrainingEntity> getTrainingById(
			@PathVariable
			Optional<TrainingEntity> trainingId) {
		
		TrainingEntity trainingEntity = trainingRepository.findById(trainingId);
		
		return new ResponseEntity<>(trainingEntity, HttpStatus.OK);
	}

	@RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TrainingResponse> createTraining(

			@RequestBody TrainingRequest trainingRequest) {

		return new ResponseEntity<>(new TrainingResponse(), HttpStatus.CREATED);
	}

	@RequestMapping(path = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TrainingResponse> updateTraining(

			@RequestBody TrainingRequest trainingRequest) {

		return new ResponseEntity<>(new TrainingResponse(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/{trainingId}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteTraining(
			@PathVariable
			long trainingId){
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
	}

}
