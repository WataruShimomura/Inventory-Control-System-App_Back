package inventory.data.stockdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "在庫商品情報消去")
@Data
public class DeleteStockReq {

	@ApiModelProperty(value = "id", example = "1")
	private int stock_Id;
	public int getStock_Id(){
		return this.stock_Id;
	}
}