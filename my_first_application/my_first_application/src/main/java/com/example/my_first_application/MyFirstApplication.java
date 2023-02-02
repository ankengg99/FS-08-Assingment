package com.example.my_first_application;

import com.example.my_first_application.model.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;

//@SpringBootApplication
public class MyFirstApplication {

	public static void main(String[] args) throws IOException {
		//System.out.println("hello");
		//SpringApplication.run(MyFirstApplication.class, args);
		RestTemplate restTemplate=new RestTemplate();
		String resourceUrl="http://simple-books-api.glitch.me/books";
		ResponseEntity<String> response=restTemplate.getForEntity(resourceUrl, String.class);
		System.out.println(response.getStatusCode()+"\n"+response.getBody());
		String output=response.getBody();
               //json to java serialization
		ObjectMapper objectMapper=new ObjectMapper();
		Book[] book=objectMapper.readValue(output, Book[].class);
          for(Book val:book){
			 //System.out.println(val.getType()+" ");
			  System.out.println(val.toString());
		  }
		  // deserialization convering java to json and stored in file
		objectMapper.writeValue(new File("F:\\docs\\new.json"),output);
	}

}
