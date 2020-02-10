package inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.ordersdata.DeleteOrderReq;
import inventory.data.ordersdata.EntryOrderReq;
import inventory.data.ordersdata.OrderListRes;
import inventory.service.orderservice.DeleteOrderReqService;
import inventory.service.orderservice.EntryOrderReqService;
import inventory.service.orderservice.OrderListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("発注情報を管理するAPI")
@RestController
@RequestMapping(value = "inventory")
public class OrdersController {
	@Autowired
	private OrderListService orderListService;
	@Autowired
	private DeleteOrderReqService deleteOrderReqService;
	@Autowired
	private EntryOrderReqService entryOrderReqService;

	@ApiOperation(value = "発注情報一覧取得", notes = "発注情報を取得する。")
	@GetMapping("/getorders")
	public List<OrderListRes> getOrders() {
		return this.orderListService.getOrderList();
	}

	@ApiOperation(value = "発注情報情報消去", notes = "指定したIDの発注情報を消去します。")
	@PostMapping("/deleteorder")
	public void delete(@RequestBody DeleteOrderReq req) {
		this.deleteOrderReqService.deleteOrderReq(req.getOrder_Id());
	}

	@ApiOperation(value = "発注情報登録", notes = "商品名IDと発注IDと発注個数から発注登録を行います。*注文登録IDは自動採番")
	@PostMapping("/entryorder")
	public void entry(@RequestBody EntryOrderReq req) {
		this.entryOrderReqService.entryOrderReq(req.getProduct_Id(),req.getSuppler_Id(),req.getorder_Quantity());
	}

}