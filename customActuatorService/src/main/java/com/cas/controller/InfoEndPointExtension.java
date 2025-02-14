package com.cas.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.boot.actuate.endpoint.web.annotation.EndpointWebExtension;
import org.springframework.boot.actuate.info.InfoEndpoint;
import org.springframework.stereotype.Component;

/*
 * We can easily extend the behavior of a predefined endpoint using the @EndpointExtension annotations
 *  or its more concrete specializations @EndpointWebExtension
 *   or @EndpointJmxExtension
 *  WebEndpointResponse<Map> 
 * 
 */
@Component
@EndpointWebExtension(endpoint=InfoEndpoint.class)
public class InfoEndPointExtension {
	//@Autowired
	private InfoEndpoint infoEndpoint;

	@ReadOperation
	public WebEndpointResponse<Map> info() {
		
		Map<String,Object> infoData=this.infoEndpoint.info();
		return new WebEndpointResponse<>(infoData, 200);
	}
}
