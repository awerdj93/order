package backend.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import backend.dto.CreateOrderRequestDTO;
import backend.dto.CreateOrderResponseDTO;
import backend.model.Order;
import backend.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public CreateOrderResponseDTO create(CreateOrderRequestDTO orderDTO) {
		Order order = new Order();
		order.setCustomerId(orderDTO.getCustomerId());
		order.setData(orderDTO);
		order = orderRepository.save(order);
		CreateOrderResponseDTO dto = new CreateOrderResponseDTO(order.getId());
		return dto;
	}

	@Override
	public List<Object> getOrderByCustomer(Long customerId) {
		Order criteria = new Order();
		criteria.setCustomerId(customerId);
		
		Example<Order> exOrder = Example.of(criteria);
		
		return StreamSupport
		.stream(orderRepository.findAll(exOrder).spliterator(), false)
		.map(Order::getData)
		.collect(Collectors.toList());
	}
	
	
}
