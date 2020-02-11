package inventory.data.locationdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "保管先情報登録")
@Data
public class EntryLocationReq {

	@ApiModelProperty(value = "保管先名前", example = "倉庫霧島市")
	private String Location_Name;

	public String getLoction_Name(){
		return this.Location_Name;
	}

}
