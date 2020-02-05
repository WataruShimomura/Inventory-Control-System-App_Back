package inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.ApiSampleRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;

@Api("ここにapiの説明")
@RestController()
public class SampleController {

	@ApiOperation(
		    value = "エンドポイントの簡単な説明",
		    notes = "エンドポイントの詳細な説明"
		)
	@ApiResponse(code = 200, message = "200のレスポンス", response = ApiSampleRes.class)
	@GetMapping("test")
	public ApiSampleRes testAPI(@ApiParam("パラメータの説明") String param) {
		return null;
}
}
