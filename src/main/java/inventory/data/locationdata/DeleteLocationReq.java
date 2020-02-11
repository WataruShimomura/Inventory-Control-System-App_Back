package inventory.data.locationdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "発注先情報消去")
@Data
public class DeleteLocationReq {

	@ApiModelProperty(value = "id", example = "1")
	private int Location_Id;

	public int getLocation_Id(){
		return this.Location_Id;
	}
}