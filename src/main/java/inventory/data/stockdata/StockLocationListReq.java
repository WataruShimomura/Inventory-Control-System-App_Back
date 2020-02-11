package inventory.data.stockdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "倉庫別在庫商品情報")
@Data
public class StockLocationListReq {

	@ApiModelProperty(value = "id", example = "1")
	private int location_Id;
	public int getLocation_Id(){
		return this.location_Id;
	}
}