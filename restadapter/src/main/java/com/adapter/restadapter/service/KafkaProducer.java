package com.adapter.restadapter.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.adapter.restadapter.model.DataObject;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class KafkaProducer {
	
	private static final Logger LOG = LogManager.getLogger(KafkaProducer.class);
	
//	@Value(value = "${kafka.topicName}")
//	private String topicName;
	
//	@Autowired
//	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void produceJsonData(DataObject dataObject) throws Exception{
		ObjectMapper obj = new ObjectMapper();
		LOG.info(">>Data to kafka topic "+obj.writeValueAsString(dataObject));
		
//		sendMessage(obj.writeValueAsString(dataObject));
		LOG.info("<<Data sended to kafka topic ");
	}
	
	 
	/*public void sendMessage(String msg) {
	    kafkaTemplate.send(topicName, msg);
	}*/
	

}
