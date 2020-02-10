package inventory.data.entity;

import lombok.Data;

@Data
public class Orders {
	private int order_Id;
	private int product_Id;
	private int suppler_Id;
	private String arrival_Date;
	private int order_Quantity;

	public int getOrder_Id(){
		return this.order_Id;
	}
	public int getProduct_Id(){
		return this.product_Id;
	}
	public int getSuppler_Id(){
		return this.suppler_Id;
	}
	public String getArrival_Date(){
		return this.arrival_Date;
	}
	public int getorder_Quantity(){
		return this.order_Quantity;
	}
}
