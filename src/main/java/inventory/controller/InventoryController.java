package inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.DeleteProductReq;
import inventory.data.ProductListRes;
import inventory.data.UpdateProductReq;
import inventory.service.DeleteProductReqService;
import inventory.service.ProductListService;
import inventory.service.UpDateProducService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("在庫の情報を管理するAPI")
@RestController
@RequestMapping(value = "inventory")
public class InventoryController {
	@Autowired
	private ProductListService productListService;
	@Autowired
	private DeleteProductReqService deleteProductReqService;
	@Autowired
	private UpDateProducService upDateProducService;

	@ApiOperation(value = "商品マスタ一覧取得", notes = "商品ID、商品名を取得する。")
	@GetMapping("/getproducts")
	public List<ProductListRes> getProducts() {
		return this.productListService.getProductList();
	}

	@ApiOperation(value = "商品情報消去", notes = "指定したIDの商品情報を消去します。")
	@PostMapping("/deleteproducts")
	public void delete(@RequestBody DeleteProductReq req) {
		this.deleteProductReqService.deleteProductReq(req.getId());
	}

	@ApiOperation(value = "商品情報更新", notes = "指定したＩＤの商品情報を引数の値に更新します。")
	@PostMapping("/update")
	public void upDate(@RequestBody UpdateProductReq req) {
		this.upDateProducService.upDateProducService(req.getId(),req.getName());
	}
}