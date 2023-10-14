package com.searchbot.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.searchbot.demo.service.SearchBotService;

@RestController
@RequestMapping("/v1/searchBot/")
public class SearchBotController {
	
	@GetMapping("/gettingStarted")
	public ResponseEntity<List<String>> gettingStarted(){
		List<String> result= new ArrayList<>();
		result.add("Hey, I am ProSource SearchBot.");
		result.add("How can I help you today?");
		return new ResponseEntity<List<String>>(result, HttpStatus.OK);
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<String>> firstRoleSearch(@RequestBody (required=false) String str){
		List<String> result=new ArrayList<>();
		String str1=str.toUpperCase();
		if(str1.contains("ROLES")) {
			result.add("The user with an admin role or admin access for the Users & Roles section can manage users and their access in ProSource Web and in the Roles page.");
			result.add("You can also follow 'Users Mangement -> Manage Roles'");
			result.add("For complete reference please follow the below link");
			result.add("https://163.183.66.66:8088/learningcenter/helppage");
		}
		else if(str1.contains("LOAD")) {
			result.add("Use the SEG-Y loader module to load the SEG-Y data into the ProSource database. Before loading the data, various headers in a SEG-Y file, trace data, and other associated metadata can be previewed in the SEG-Y loader module");
			result.add("You can also follow 'Load Data -> Load SEG-Y Data'");
			result.add("For complete reference please follow the below link");
			result.add("https://163.183.66.66:8088/learningcenter/helppage");
		}
		else if(str1.contains("LOG")) {
			result.add("Export log curves and core analysis results from Seabed into ASCII files in various formats. You can export selected log traces and/or core properties for one or many wells. To learn about number of output formats supported, refer to the Output formats topic.");
			
			result.add("The main features of the log core exporter are:");
			result.add("Data export from the list of selected wells.");
			result.add("You can select different output formats which includes:");
			result.add("1) General ASCII");
			result.add("2) General ASCII One");
			result.add("3) General ASCII Fixed");
			result.add("4) Strata Model");
			result.add("5) Strata Model Fixed");
			result.add("6) IRAP");
			result.add("7) GEOCAP");
			result.add("8) LAS 2.0");
			result.add("You can output data for selected depth interval and sample rate.");
			result.add("Output depth index can select MD, TVD, and TVDSS.");
			result.add("You can output data for selected date format, selected target CRS, and unit system.");
			result.add("You can also follow 'Export Data -> Log Core Exporter'");
			result.add("For complete reference please follow the below link");
			result.add("https://163.183.66.66:8088/learningcenter/helppage");
			
		}
		
		else {
			result.add("Opps! could not find related content. I am still in development phase.");
			result.add("Please refer https://163.183.66.66:8088/learningcenter/helppage");
		}
		return new ResponseEntity<List<String>>(result, HttpStatus.OK);
	}
	

}
