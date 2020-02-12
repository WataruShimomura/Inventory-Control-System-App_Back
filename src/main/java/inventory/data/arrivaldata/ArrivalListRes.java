package inventory.data.arrivaldata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "入荷情報情報一覧")
@Data
public class ArrivalListRes {

	@ApiModelProperty(value = "入荷情報ID", example = "1")
	private int arrival_Id;
	@ApiModelProperty(value = "商品名（IDを参照に入力する）", example = "りんご")
	private String product_Name;
	@ApiModelProperty(value = "発注先名（IDを参照に入力する）", example = "鹿児島県")
	private String suppler_Name;
	@ApiModelProperty(value = "発注個数", example = "3")
	private int order_Quantity;
	@ApiModelProperty(value = "到着時間", example = "2020-02-06")
	private String arrival_Date;

	public void setArrival_Id(int set) {
		this.arrival_Id = set;
	}
	public void setProduct_Name(String set) {
		this.product_Name = set;
	}
	public void setSuppler_Name(String set) {
		this.suppler_Name = set;
	}
	public void setOrder_Quantity(int set) {
		this.order_Quantity = set;
	}
	public void setArrival_Date(String set) {
		this.arrival_Date = set;
	}
}
