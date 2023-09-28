package com.myapp.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Autowired
	OrderService ordSer;
	
	@PostMapping(value="/postdat")
	public String postData(@RequestBody OrderEntity ords) {
		return ordSer.postData(ords);
	}
	
	@GetMapping(value="/getdata/{id}")
	public OrderEntity getDat(@PathVariable int id) {
		return ordSer.getDat(id);
	}
	
	@GetMapping(value="getByJoin")
	public List<String> getByJoin(){
		return ordSer.getByJoin();
	}
	

}
