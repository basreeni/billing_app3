package com.app.billing_app4.model;

import java.util.*;

import org.joda.time.DateTime;

import org.joda.time.*;

import java.math.*;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class PostBillPaymentUsingPOSTResponseWrapper {

	 private BillPaymentConfirmation response;

	 public MultiValueMap<String, String> getHeaders(){
	 final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
 	return map;
	}
	 public void setHeaders(){
		 
	} 
	public BillPaymentConfirmation getResponse(){
		 return response;
	} 
	 public void setResponse(BillPaymentConfirmation response){
		 this.response=response;
	} 
}