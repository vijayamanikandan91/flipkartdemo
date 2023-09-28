package com.myapp.flipkart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
	
	@Query(value="select city,name from fkart_order join fkart_product on fkart_order.id = fkart_product.fkart_order;",nativeQuery=true)
	public List<String> getByJoin();
	

}
