package com.spring.boot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;
import lombok.ToString;
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Product {

	private int productId;
	
	private String productName;
	private int productPrice;

}
