package org.pwc.com.model;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class Model {
	
	private String testName;

	private String ip;
	  
	private String ApiUrl;
	  
	private String portNo;
	 
	private int noOfThreads;
	
	private String rampUpTime;
	
	private String durationOfLoadTime;
	
	private String domainName;
	
	private String httpMethod;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getApiUrl() {
		return ApiUrl;
	}

	public void setApiUrl(String apiUrl) {
		ApiUrl = apiUrl;
	}

	public String getPortNo() {
		return portNo;
	}

	public void setPortNo(String portNo) {
		this.portNo = portNo;
	}

	public int getNoOfThreads() {
		return noOfThreads;
	}

	public void setNoOfThreads(int noOfThreads) {
		this.noOfThreads = noOfThreads;
	}

	public String getRampUpTime() {
		return rampUpTime;
	}

	public void setRampUpTime(String rampUpTime) {
		this.rampUpTime = rampUpTime;
	}

	public String getDurationOfLoadTime() {
		return durationOfLoadTime;
	}

	public void setDurationOfLoadTime(String durationOfLoadTime) {
		this.durationOfLoadTime = durationOfLoadTime;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}
	
	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
	 
	 
	 

}
