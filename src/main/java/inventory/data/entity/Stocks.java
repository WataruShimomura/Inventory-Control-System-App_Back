package inventory.data.entity;

import lombok.Data;

@Data
public class Stocks {
	private int stock_Id;
	private int product_Id;
	private int location_Id;
	private int stock_Num;

	public int getStock_Id(){
		return this.stock_Id;
	}
	public int getProduct_Id(){
		return this.product_Id;
	}
	public int getLocation_Id(){
		return this.location_Id;
	}
	public int getStock_Num(){
		return this.stock_Num;
	}
}
