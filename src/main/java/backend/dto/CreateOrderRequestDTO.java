package backend.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CreateOrderRequestDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long customerId;
	
	BigDecimal totalPrice;
	
	List<Item> items;
	
	@Getter
	@Setter
	public static class Item implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private long id;
		private BigDecimal price;
		private int quantity;
		private String name;
	}
	
}
