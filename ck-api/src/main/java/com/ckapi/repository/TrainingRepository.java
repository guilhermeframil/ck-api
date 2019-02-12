package com.ckapi.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ckapi.entity.TrainingEntity;

public interface TrainingRepository extends CrudRepository<TrainingEntity, Long> {

	TrainingEntity findById(Optional<TrainingEntity> trainingId);

}
