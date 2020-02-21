package com.adapter.restadapter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adapter.restadapter.model.DataObject;
import com.adapter.restadapter.model.Payload;

@Service
public class IntermediateService {

	@Autowired
	private DataTransformer dataTransformer;
	@Autowired
	private KafkaProducer producer;

	@Autowired
	private FinalObjectService finalService;
	
	public void DataHandler(String data) throws Exception {
		DataObject dataObject = dataTransformer.stringToObjectConverter(data);
		Payload load = finalService.getPayload(dataObject);
		producer.produceJsonData(load);
	}

}
