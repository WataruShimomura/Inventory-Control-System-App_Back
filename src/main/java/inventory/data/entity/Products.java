package inventory.data.entity;

import lombok.Data;

@Data
public class Products {
	private int id;
	private String name;

	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
}
