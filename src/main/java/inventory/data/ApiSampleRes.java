package inventory.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "サンプルレスポンス")
@Data
public class ApiSampleRes {

	@ApiModelProperty(value = "サンプルストリング", example = "サンプルの値")
	private String sampleString;

	@ApiModelProperty(value = "サンプル数字", example = "1")
	private Integer sampleNumber;

}
