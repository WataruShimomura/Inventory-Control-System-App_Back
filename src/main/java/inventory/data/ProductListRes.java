package inventory.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "商品情報一覧")
@Data
public class ProductListRes {

	@ApiModelProperty(value = "id", example = "1")
	private Integer id;
	@ApiModelProperty(value = "name", example = "1")
	private String name;

	public void setId(int set) {
		this.id = set;
	}
	public void setName(String set) {
		this.name = set;
	}
}
