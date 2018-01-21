package com.precompiler.cloud.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.precompiler.cloud.model.Order;

@FeignClient("order-management")
public interface OrderManagement {

	@RequestMapping(value = "/users/{uid}/orders", method = RequestMethod.GET)
	List<Order> getOrders(@PathVariable("uid") String uid);
}
