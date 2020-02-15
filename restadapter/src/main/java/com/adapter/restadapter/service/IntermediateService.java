package com.adapter.restadapter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adapter.restadapter.model.DataObject;

@Service
public class IntermediateService {

	@Autowired
	DataTransformer dataTransformer;
	@Autowired
	KafkaProducer producer;

	public void DataHandler(String data) throws Exception {
		DataObject dataObject = dataTransformer.stringToObjectConverter(data);
		producer.produceJsonData(dataObject);
	}

}
