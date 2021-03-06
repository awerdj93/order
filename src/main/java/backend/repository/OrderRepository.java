package backend.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import backend.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long>, QueryByExampleExecutor<Order> {
	

}
