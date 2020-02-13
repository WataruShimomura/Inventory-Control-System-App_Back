package inventory.data.arrivaldata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "入荷登録")
@Data
public class EntryArrivalReq {

	@ApiModelProperty(value = "入荷ID", example = "1")
	private int order_Id;

	public int getOrder_Id(){
		return this.order_Id;
	}
}