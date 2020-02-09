package inventory.data.supplersdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "商品情報登録")
@Data
public class EntrySupplerReq {

	@ApiModelProperty(value = "発送先名前", example = "鹿児島")
	private String getSuppler_name;
	private int order_reedtime;

	public String getSuppler_name(){
		return this.getSuppler_name;
	}

	public int getOrder_reedtime(){
		return this.order_reedtime;
	}
}
