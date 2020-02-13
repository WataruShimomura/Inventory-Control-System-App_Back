package inventory.data.arrivaldata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "入荷処理")
@Data
public class ArrivalProcessingReq {

	@ApiModelProperty(value = "入荷ID", example = "1")
	private int arrival_Id;
	@ApiModelProperty(value = "倉庫ID", example = "1")
	private int location_Id;

	public int getArrival_Id(){
		return this.arrival_Id;
	}
	public int getLocation_Id(){
		return this.location_Id;
	}
}