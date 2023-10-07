package com.dl.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class TestConnections {
	//http://localhost:8080/client/get
		@GetMapping("/get")
		public String getData() {
			return "Get Data";
		}

		//http://localhost:8080/client/post
		@PostMapping("/post")
		public String sendData() {
			return "Post Data";
		}

		//http://localhost:8080/client/put
		@PutMapping("/put")
		public String updateData() {
			return "upateData";
		}
		
		//http://localhost:8080/client/del
		@DeleteMapping("/del")
		public String deleteData() {
			return "deleteData";
		}
		
		//http://localhost:8080/client/hello
		@RequestMapping("/hello")
		public String hello() {
			return "Hello Spring Boot";
		}

}
