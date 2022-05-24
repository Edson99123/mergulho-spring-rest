package com.algaworks.algalog.common;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperCongig {
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
