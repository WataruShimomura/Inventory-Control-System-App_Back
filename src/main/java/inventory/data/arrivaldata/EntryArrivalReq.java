package inventory.data.arrivaldata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "在庫登録")
@Data
public class EntryArrivalReq {

	@ApiModelProperty(value = "入荷ID", example = "1")
	private int arrival_Id;
	@ApiModelProperty(value = "商品ID", example = "1")
	private int product_Id;
	@ApiModelProperty(value = "在庫先ID", example = "1")
	private int location_Id;
	@ApiModelProperty(value = "在庫個数", example = "3")
	private int stock;
	public int getArrival_Id(){
		return this.arrival_Id;
	}
	public int getProduct_Id(){
		return this.product_Id;
	}
	public int getLocation_Id(){
		return this.location_Id;
	}
	public int getStock(){
		return this.stock;
	}
}