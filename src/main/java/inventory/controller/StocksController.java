package inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.stockdata.DeleteStockReq;
import inventory.data.stockdata.StockListRes;
import inventory.data.stockdata.StockLocationListReq;
import inventory.data.stockdata.UpdateStockReq;
import inventory.service.stockservice.DeleteStockReqService;
import inventory.service.stockservice.StockListService;
import inventory.service.stockservice.StockLocationListService;
import inventory.service.stockservice.UpdateStocksService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("在庫情報を管理するAPI")
@RestController
@RequestMapping(value = "inventory")
public class StocksController {
	@Autowired
	private StockListService stockListService;
	@Autowired
	private StockLocationListService stockLocationListService;
	@Autowired
	private DeleteStockReqService deleteStockReqService;
	@Autowired
	private UpdateStocksService upDateStockService;

	@ApiOperation(value = "在庫情報一覧取得", notes = "在庫一覧情報を取得する。")
	@GetMapping("/getstock")
	public List<StockListRes> getStock() {
		return this.stockListService.getStockList();
	}

	@ApiOperation(value = "保存先別在庫情報一覧取得", notes = "指定した保存先IDの在庫一覧情報を取得する。")
	@GetMapping("/getstocklocations")
	public List<StockListRes> getStockLocationList(@RequestBody StockLocationListReq req) {
		return this.stockLocationListService.getStockLocationList(req.getLocation_Id());
	}

	@ApiOperation(value = "在庫消去", notes = "指定したIDの在庫を消去します。")
	@PostMapping("/deletelocation")
	public void delete(@RequestBody DeleteStockReq req) {
		this.deleteStockReqService.deleteStockReq(req.getStock_Id());
	}

	@ApiOperation(value = "在庫情報更新", notes = "指定したＩＤの在庫情報を編集します。")
	@PostMapping("/updatelocation")
	public void upDate(@RequestBody UpdateStockReq req) {
		this.upDateStockService.updateStockServiceReq(req.getStock_Id(),req.getStock_Num());
	}

}