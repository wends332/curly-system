package com.wen.springboot.demo_01;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class HelloApplicationTests {
	
	private MockMvc mvc;
	
	@Autowired
	private WebApplicationContext wac;
	
	@Before
	public void beforeTest(){
		System.out.println("------------设置mvc-----------------");
		mvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@org.junit.Test
	public void Test() throws Exception{
		System.out.println("--------------1----------------");
		MvcResult mr = mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.TEXT_HTML_VALUE)).andDo(MockMvcResultHandlers.print()).andReturn();
		String content = mr.getResponse().getContentAsString();
//		System.out.println(content);
		System.out.println("-------------2-----------------");
	}
}
