package com.datapine.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.datapine.domainvalue.Messages;
import com.datapine.exception.EntityNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
public class UserControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void shouldGetUserReturnIsOKWithContent() throws Exception {

		this.mvc.perform(get("/user/1")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json(Messages.USER_DO_STRING));	
	}
	
	@Test
	public void shouldGetUserReturnNotFindEntityException() throws Exception {

		this.mvc.perform(get("/user/2")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isBadRequest());	
	}
	

}
