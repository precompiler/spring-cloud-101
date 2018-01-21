package com.precompiler.cloud.controller;

import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.precompiler.cloud.model.Order;

@RestController
public class OrderController {
	@RequestMapping(value = "/users/{uid}/orders", method = RequestMethod.GET)
	public ResponseEntity<List<Order>> getOrders(@PathVariable("uid") String uid) {
		// return dummy orders
		List<Order> orders = cache.get(uid);
		if (CollectionUtils.isEmpty(orders)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(orders, HttpStatus.OK);
		}
	}

	private static final Map<String, List<Order>> cache = new HashMap<>();
	static {
		@SuppressWarnings("serial")
		List<Order> userAOrders = new ArrayList<Order>() {
			{
				add(new Order(1L, new Date()));
				add(new Order(2L, new Date()));
			}
		};
		cache.put("userA", userAOrders);
	}
}
