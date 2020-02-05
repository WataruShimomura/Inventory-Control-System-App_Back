package inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.ProductListRes;
import inventory.service.ProductListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("在庫の情報を管理するAPI")
@RestController
@RequestMapping(value = "inventory")
public class InventoryController {
	@Autowired
	private ProductListService productListService;

	@ApiOperation(value = "商品マスタ一覧取得", notes = "商品ID、商品名を取得する。")
	@GetMapping("/getproducts")
	public List<ProductListRes> getProducts() {
		return this.productListService.getProductList();
	}
}