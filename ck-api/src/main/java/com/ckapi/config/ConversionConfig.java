package com.ckapi.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import com.ckapi.convertor.TrainingEntityToTrainingResponseConvertor;
import com.ckapi.convertor.TrainingRequestToTrainingEntityConvertor;

@Configuration
public class ConversionConfig {
	
	private Set<Converter> getConverters(){
			Set<Converter> converters = new HashSet<Converter>();
			converters.add(new TrainingRequestToTrainingEntityConvertor());
			converters.add(new TrainingEntityToTrainingResponseConvertor());
			
			return converters;
	}
	
	public ConversionService conversionService() {
		ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
		bean.setConverters(getConverters());
		bean.afterPropertiesSet();
		
		return bean.getObject();
	}

}
