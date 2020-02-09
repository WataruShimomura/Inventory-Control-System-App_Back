package inventory.data.supplersdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "発注先情報情報一覧")
@Data
public class SupplerListRes {

	@ApiModelProperty(value = "suppler_id", example = "1")
	private Integer suppler_id;
	@ApiModelProperty(value = "suppler_name", example = "鹿児島県")
	private String suppler_name;
	@ApiModelProperty(value = "order_reedtime", example = "3")
	private int order_reedtime;

	public void setSuppler_id(int set) {
		this.suppler_id = set;
	}
	public void setSuppler_name(String set) {
		this.suppler_name = set;
	}
	public void setOrder_reedtime(int set) {
		this.order_reedtime = set;
	}
}
