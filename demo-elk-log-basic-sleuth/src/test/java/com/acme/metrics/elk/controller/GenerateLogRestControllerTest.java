package com.acme.metrics.elk.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.acme.metrics.elk.constant.GenerateLogRestControllerConstant;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GenerateLogRestControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void givenMapping_thenGetLogs() throws Exception {
		mockMvc.perform(get(GenerateLogRestControllerConstant.MAPPING)).andExpect(status().isOk());
	}

}
