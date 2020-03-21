package backend.service;

import java.util.List;

import backend.dto.CreateOrderRequestDTO;
import backend.dto.CreateOrderResponseDTO;


public interface OrderService {

	public CreateOrderResponseDTO create(CreateOrderRequestDTO orderDTO);
	
	public List<Object> getOrderByCustomer(Long customerId);
}
