package inventory.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "商品情報更新")
@Data
public class UpdateProductReq {

	@ApiModelProperty(value = "id", example = "3")
	private int id;
	@ApiModelProperty(value = "名前", example = "なめろう")
	private String name;

	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
}
