package inventory.data.stockdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "商品情報更新")
@Data
public class UpdateStockReq {

	@ApiModelProperty(value = "id", example = "1")
	private int stock_Id;
	@ApiModelProperty(value = "id", example = "3")
	private int stock_Num;

	public int getStock_Id(){
		return this.stock_Id;
	}
	public int getStock_Num(){
		return this.stock_Num;
	}
}
