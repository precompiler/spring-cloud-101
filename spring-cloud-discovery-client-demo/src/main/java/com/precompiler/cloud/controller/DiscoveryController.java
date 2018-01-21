package com.precompiler.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import com.precompiler.cloud.client.OrderManagement;
import com.precompiler.cloud.model.Order;

@RestController
public class DiscoveryController {
	@Autowired
	private EurekaClient eurekaClient;

	@Autowired
	private OrderManagement orderManagement;

	@RequestMapping(value = "/whoswho", method = RequestMethod.GET)
	public ResponseEntity<List<Application>> discovery() {
		List<Application> apps = eurekaClient.getApplications().getRegisteredApplications();
		return new ResponseEntity<>(apps, HttpStatus.OK);
	}

	@RequestMapping(value = "/proxy/users/{uid}/orders", method = RequestMethod.GET)
	public ResponseEntity<List<Order>> getOrders(@PathVariable("uid") String uid) {
		return new ResponseEntity<>(orderManagement.getOrders(uid), HttpStatus.OK);
	}
}
