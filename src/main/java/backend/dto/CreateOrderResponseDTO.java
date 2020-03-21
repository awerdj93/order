package backend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderResponseDTO {

	private long id;
	
	public CreateOrderResponseDTO(long id) {
		this.id = id;
	}
}
