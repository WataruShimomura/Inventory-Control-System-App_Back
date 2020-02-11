package inventory.data.locationdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "保管先情報更新")
@Data
public class UpdateLocationReq {

	@ApiModelProperty(value = "保管先id", example = "1")
	private Integer location_Id;
	@ApiModelProperty(value = "保管先名前", example = "保管先札幌")
	private String location_Name;

	public int getLocation_Id() {
		return this.location_Id;
	}
	public String getLocation_Name() {
		return this.location_Name;
	}
}
