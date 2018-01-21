package com.precompiler.cloud.model;

import java.util.Date;

import lombok.Data;
import lombok.NonNull;

@Data
public class Order {
	@NonNull
	private Long id;
	@NonNull
	private Date date;
}
