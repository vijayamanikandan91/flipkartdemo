package com.myapp.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	OrderDao ordDao;
	
	public String postData(OrderEntity ords) {
		return ordDao.postData(ords);
	}
	
	public OrderEntity getDat(int id) {
		return ordDao.getDat(id);
	}
	
	public List<String> getByJoin(){
		return ordDao.getByJoin();
	}

}
