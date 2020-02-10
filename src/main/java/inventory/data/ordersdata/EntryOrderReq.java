package inventory.data.ordersdata;

import lombok.Data;

@Data
public class EntryOrderReq {
	private int product_Id;
	private int suppler_Id;
	private int order_Quantity;

	public int getProduct_Id(){
		return this.product_Id;
	}
	public int getSuppler_Id(){
		return this.suppler_Id;
	}
	public int getorder_Quantity(){
		return this.order_Quantity;
	}
}
