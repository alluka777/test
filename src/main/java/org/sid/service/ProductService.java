package org.sid.service;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class ProductService {
	 public List<String> getProducts() {
	      return Arrays.asList("iPad","iPod","iPhone");
	   }
}
