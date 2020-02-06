package inventory.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "商品情報消去")
@Data
public class DeleteProductReq {

	@ApiModelProperty(value = "id", example = "1")
	private int id;
	public int getId(){
		return this.id;
	}
}