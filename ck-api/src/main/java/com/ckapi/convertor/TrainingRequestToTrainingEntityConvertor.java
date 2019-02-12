package com.ckapi.convertor;

import org.springframework.core.convert.converter.Converter;

import com.ckapi.entity.TrainingEntity;
import com.ckapi.model.request.TrainingRequest;

public class TrainingRequestToTrainingEntityConvertor implements Converter<TrainingRequest, TrainingEntity> {

	@Override
	public TrainingEntity convert(TrainingRequest source) {
		// TODO Auto-generated method stub
		
		TrainingEntity trainingEntity = new TrainingEntity();
		trainingEntity.setName(source.getName());
		trainingEntity.setDuration(source.getDuration());
		trainingEntity.setPlace(source.getPlace());
		trainingEntity.setDate(source.getDate());
		trainingEntity.setTime(source.getTime());
		trainingEntity.setLeader(source.getLeader());
		trainingEntity.setUrl(source.getUrl());
		
		if (null != source.getId())
			trainingEntity.setId(source.getId());
		return trainingEntity;
	}

}
