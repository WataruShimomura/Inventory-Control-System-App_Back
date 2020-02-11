package inventory.data.stockdata;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "在庫商品情報一覧")
@Data
public class StockListRes {

	@ApiModelProperty(value = "在庫ID", example = "1")
	private Integer stock_Id;
	@ApiModelProperty(value = "商品名", example = "りんご")
	private String product_Name;
	@ApiModelProperty(value = "在庫先名", example = "倉庫横浜")
	private String location_Name;
	@ApiModelProperty(value = "在庫数", example = "5")
	private int stock_Num;

	public void setStock_Id(int set) {
		this.stock_Id = set;
	}
	public void setProduct_Name(String set) {
		this.product_Name = set;
	}
	public void setLocation_Name(String set) {
		this.location_Name = set;
	}
	public void setStock_Num(int set) {
		this.stock_Num = set;
	}
}
