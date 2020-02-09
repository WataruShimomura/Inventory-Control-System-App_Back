package inventory.data.entity;

import lombok.Data;

@Data
public class Supplers {
	private int suppler_id;
	private String suppler_name;
	private int order_reedtime;

	public int getSuppler_id(){
		return this.suppler_id;
	}

	public String getSuppler_name(){
		return this.suppler_name;
	}

	public int getOrder_reedtime(){
		return this.order_reedtime;
	}
}
