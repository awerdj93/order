package backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import backend.dto.CreateOrderRequestDTO;
import backend.dto.CreateOrderResponseDTO;
import backend.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;

	@GetMapping("/customers/{customerId}/orders")
	List<Object> get(@PathVariable long customerId) throws JsonProcessingException {				
		return orderService.getOrderByCustomer(customerId);	
	}
	
	@PostMapping("/customers/{customerId}/orders")
	CreateOrderResponseDTO create(@PathVariable long customerId, @RequestBody CreateOrderRequestDTO orderDTO) throws JsonProcessingException {	
		orderDTO.setCustomerId(customerId);		 
		return orderService.create(orderDTO);
	}
	
}
