package com.adapter.dbadapter.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DbService {
	
	private static final Logger LOG = LogManager.getLogger(DbService.class); 
	private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	@Scheduled(cron = "${cron.expression}")
	public void job() {
		Date date = new Date();
		LOG.info("Scheduler started at: " + dateFormat.format(date));
	}
}
