package com.myapp.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
	@Autowired
	OrderRepository ordRepo;
	
	public String postData(OrderEntity ords) {
		ordRepo.save(ords);
		return "added successfully";
		
	}
	
	public OrderEntity getDat(int id) {
		return ordRepo.findById(id).get();
	}
	
	public List<String> getByJoin(){
		return ordRepo.getByJoin();
	}

}
