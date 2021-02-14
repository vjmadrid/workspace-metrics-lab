package com.acme.metrics.elk.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.acme.metrics.elk.service.GenerateLogService;
import com.acme.metrics.elk.util.GenerateMessageUtil;

import lombok.Setter;

@Service
@Setter
public class GenerateLogServiceImpl implements GenerateLogService {
	
	private static final Logger LOG = LoggerFactory.getLogger(GenerateLogServiceImpl.class);
	
	@Override
	public List<String> getLogs(int num) {
		
		List<String> logMessageList = new ArrayList<String>();
		
		for (int i = 0; i < num; i++) {
            String message = GenerateMessageUtil.getMessage();
            logMessageList.add(message);

            LOG.info(message);
        }
		
		return logMessageList;
	}

}
