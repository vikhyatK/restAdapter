package com.adapter.restadapter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import com.adapter.restadapter.model.DataObject;
import com.adapter.restadapter.model.Payload;

@Service
@RefreshScope
public class IntermediateService {

	@Autowired
	private DataTransformer dataTransformer;
	@Autowired
	private KafkaProducer producer;

	@Value("${test.property}")
	private String test;
	
	@Autowired
	private FinalObjectService finalService;
	
	public void DataHandler(String data) throws Exception {
		DataObject dataObject = dataTransformer.stringToObjectConverter(data);
		Payload load = finalService.getPayload(dataObject);
		producer.produceJsonData(load);
	}

	public String getConfigData() {
		return test;
	}

}
