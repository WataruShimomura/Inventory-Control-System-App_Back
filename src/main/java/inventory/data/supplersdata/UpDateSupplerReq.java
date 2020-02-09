package inventory.data.supplersdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "発注先情報更新")
@Data
public class UpDateSupplerReq {

	@ApiModelProperty(value = "getSuppler_id", example = "1")
	private int suppler_id;
	@ApiModelProperty(value = "名前", example = "アメリカ")
	private String suppler_name;
	@ApiModelProperty(value = "order_reedtime", example = "3")
	private int order_reedtime;

	public int getSuppler_id() {
		return this.suppler_id;
	}
	public String getSuppler_name() {
		return this.suppler_name;
	}
	public int getOrder_reedtime(){
		return this.order_reedtime;
	}
}
