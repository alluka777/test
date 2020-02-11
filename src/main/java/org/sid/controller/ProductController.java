package org.sid.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.sid.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

	 @Autowired
	 ProductService productService;
	 	@RequestMapping(value = "/products", method = RequestMethod.GET, produces = {"application/json"})
	   //@GetMapping(path = "/products")
	   public @ResponseBody String getProducts(Model model){
	      return "hello!";
	   }

	   @GetMapping(path = "/logout")
	   public String logout(HttpServletRequest request) throws ServletException {
	      request.logout();
	      return "/";
	   }
}
