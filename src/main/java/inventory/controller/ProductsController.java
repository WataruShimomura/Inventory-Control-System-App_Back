package inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.productsdata.DeleteProductReq;
import inventory.data.productsdata.EntryProductReq;
import inventory.data.productsdata.ProductListRes;
import inventory.data.productsdata.UpdateProductReq;
import inventory.service.productservice.DeleteProductReqService;
import inventory.service.productservice.EntryProductReqService;
import inventory.service.productservice.ProductListService;
import inventory.service.productservice.UpDateProducsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("在庫の情報を管理するAPI")
@RestController
@RequestMapping(value = "inventory")
public class ProductsController {
	@Autowired
	private ProductListService productListService;
	@Autowired
	private DeleteProductReqService deleteProductReqService;
	@Autowired
	private UpDateProducsService upDateProducsService;
	@Autowired
	private EntryProductReqService entryProductReqService;

	@ApiOperation(value = "商品マスタ一覧取得", notes = "商品ID、商品名を取得する。")
	@GetMapping("/getproducts")
	public List<ProductListRes> getProducts() {
		return this.productListService.getProductList();
	}

	@ApiOperation(value = "商品情報消去", notes = "指定したIDの商品情報を消去します。")
	@PostMapping("/deleteproduct")
	public void delete(@RequestBody DeleteProductReq req) {
		this.deleteProductReqService.deleteSupplerReq(req.getId());
	}

	@ApiOperation(value = "商品情報更新", notes = "指定したＩＤの商品情報を引数の値に更新します。")
	@PostMapping("/updateproduct")
	public void upDate(@RequestBody UpdateProductReq req) {
		this.upDateProducsService.upDateProducServiceReq(req.getId(),req.getName());
	}


	@ApiOperation(value = "商品登録", notes = "商品の登録を行います。*IDは自動採番")
	@PostMapping("/entryproduct")
	//引数の@RequestBodyを除去、コンテンツタイプがapplication / x-www-form-urlencodedであるため
	//Testの際はまたつける
	public void entry(@RequestBody EntryProductReq req) {
		String name = req.getName();
		this.entryProductReqService.entryProductReq(name);
	}
}