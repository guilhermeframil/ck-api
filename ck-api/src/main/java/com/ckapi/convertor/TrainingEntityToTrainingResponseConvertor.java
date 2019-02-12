package com.ckapi.convertor;

import org.springframework.core.convert.converter.Converter;

import com.ckapi.entity.TrainingEntity;
import com.ckapi.model.response.TrainingResponse;

public class TrainingEntityToTrainingResponseConvertor implements Converter<TrainingEntity, TrainingResponse> {

	@Override
	public TrainingResponse convert(TrainingEntity source) {
		// TODO Auto-generated method stub
		
		TrainingResponse trainingResponse = new TrainingResponse();
		trainingResponse.setName(source.getName());
		trainingResponse.setDuration(source.getDuration());
		trainingResponse.setPlace(source.getPlace());
		trainingResponse.setDate(source.getDate());
		trainingResponse.setTime(source.getTime());
		trainingResponse.setLeader(source.getLeader());
		trainingResponse.setUrl(source.getUrl());
		
		if (null != source.getId())
			trainingResponse.setId(source.getId());
		
		return trainingResponse;
	}

}
