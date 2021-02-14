package com.acme.metrics.elk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acme.metrics.elk.constant.GenerateLogRestControllerConstant;
import com.acme.metrics.elk.service.GenerateLogService;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@Setter
public class GenerateLogRestController {
	
	@Autowired
	private GenerateLogService generateLogService;
	
	@RequestMapping(method = RequestMethod.GET, value = GenerateLogRestControllerConstant.MAPPING , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getLogs() {
		List<String> logMessageList = generateLogService.getLogs(100);
	
        return ResponseEntity.ok(logMessageList);
    }

}
