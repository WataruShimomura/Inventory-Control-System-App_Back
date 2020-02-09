package inventory.data.supplersdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "発注先情報消去")
@Data
public class DeleteSupplerReq {

	@ApiModelProperty(value = "suppler_id", example = "1")
	private int suppler_id;
	public int getId(){
		return this.suppler_id;
	}
}