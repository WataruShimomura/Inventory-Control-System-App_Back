package inventory.data.ordersdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "発注情報情報一覧")
@Data
public class OrderListRes {

	@ApiModelProperty(value = "発注情報ID", example = "1")
	private int order_Id;
	@ApiModelProperty(value = "商品名（IDを参照に入力する）", example = "りんご")
	private String product_Name;
	@ApiModelProperty(value = "発注先名（IDを参照に入力する）", example = "鹿児島県")
	private String suppler_Name;
	@ApiModelProperty(value = "発注個数", example = "3")
	private int order_Quantity;
	@ApiModelProperty(value = "到着時間", example = "2020-02-06")
	private int arrival_Date;

	public void setOrder_Id(int set) {
		this.order_Id = set;
	}
	public void setProduct_Name(String set) {
		this.product_Name = set;
	}
	public void setSuppler_Name(String set) {
		this.suppler_Name = set;
	}
	public void setorder_Quantity(int set) {
		this.order_Quantity = set;
	}
	public void setarrival_Date(int set) {
		this.arrival_Date = set;
	}
}
