package org.pwc.com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.jorphan.collections.HashTree;
import org.pwc.com.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PerTestController {
	
	@Autowired
	private JmeterTestPlan jmeterTestPlan;
	//private TopicService topicService;
	
	/*
	 * @RequestMapping("/topic") public List<Topic> getListOfTopics() { return
	 * topicService.getAllTopics();
	 * 
	 * }
	 */
	
	@PostMapping(path="/performanceTesting")
    public void createTestPLan(@RequestBody  Model model)  throws IOException
    {
        String testName=model.getTestName();
        String ip=model.getIp();
        String ApiUrl = model.getApiUrl();
        String portNo=model.getPortNo();
        int  noOfThreads= model.getNoOfThreads();
        String rampUpTime=model.getRampUpTime();
        String durationOfLoadTime=model.getDurationOfLoadTime();
        String domainName=model.getDomainName();
        String httpMethod=model.getHttpMethod();
        //return "Success!";
        

		jmeterTestPlan.createTestPLan(testName, ip, ApiUrl, portNo, noOfThreads, rampUpTime,durationOfLoadTime,domainName,httpMethod);		
		
		
	}

}
