package inventory.data.locationdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "保管先情報一覧")
@Data
public class LocationListRes {

	@ApiModelProperty(value = "保管先ID", example = "1")
	private Integer location_Id;
	@ApiModelProperty(value = "保管先名", example = "倉庫鹿児島市")
	private String location_Name;

	public void setLocation_Id(int set) {
		this.location_Id = set;
	}
	public void setLocation_Name(String set) {
		this.location_Name = set;
	}
}
