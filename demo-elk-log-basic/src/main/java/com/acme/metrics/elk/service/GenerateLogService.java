package com.acme.metrics.elk.service;

import java.util.List;

public interface GenerateLogService {

	List<String> getLogs(int num);
	
}
