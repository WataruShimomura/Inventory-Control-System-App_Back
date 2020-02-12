package inventory.data.ordersdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "発注情報消去")
@Data
public class DeleteOrderReq {

	@ApiModelProperty(value = "order_Id", example = "1")
	private int order_Id;
	public int getOrder_Id(){
		return this.order_Id;
	}
}