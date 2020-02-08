package inventory.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "商品情報登録")
@Data
public class EntryProductReq {

	@ApiModelProperty(value = "名前", example = "リンゴ")
	private String name;

	public String getName(){
		return this.name;
	}

}
