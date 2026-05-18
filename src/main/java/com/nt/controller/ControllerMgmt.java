package com.nt.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/get")
public class ControllerMgmt {
	@GetMapping("/msg")
     public ResponseEntity<String> getWomen(){
         return new ResponseEntity<String>("welcome to project 3.0 ", HttpStatus.OK); 
     }
}
