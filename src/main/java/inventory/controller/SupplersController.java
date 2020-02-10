package inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.supplersdata.DeleteSupplerReq;
import inventory.data.supplersdata.EntrySupplerReq;
import inventory.data.supplersdata.SupplerListRes;
import inventory.data.supplersdata.UpDateSupplerReq;
import inventory.service.productservice.DeleteProductReqService;
import inventory.service.supplerservice.EntrySupplerReqService;
import inventory.service.supplerservice.SupplerListService;
import inventory.service.supplerservice.UpDateSupplerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("商品情報を管理するAPI")
@RestController
@RequestMapping(value = "inventory")
public class SupplersController {
	@Autowired
	private SupplerListService supplerListService;
	@Autowired
	private DeleteProductReqService deleteSupplerReqService;
	@Autowired
	private UpDateSupplerService upDateSupplerService;
	@Autowired
	private EntrySupplerReqService entrySupplerReqService;

	@ApiOperation(value = "発注先一覧取得", notes = "発注先情報を取得する。")
	@GetMapping("/getsupplers")
	public List<SupplerListRes> getSupplers() {
		return this.supplerListService.getSupplerList();
	}

	@ApiOperation(value = "発注先情報消去", notes = "指定したIDの発注先情報を消去します。")
	@PostMapping("/deletesuppler")
	public void delete(@RequestBody DeleteSupplerReq req) {
		this.deleteSupplerReqService.deleteSupplerReq(req.getId());
	}

	@ApiOperation(value = "発注先情報更新", notes = "指定したＩＤの発注先情報を引数の値に更新します。")
	@PostMapping("/updatesuppler")
	public void upDate(@RequestBody UpDateSupplerReq req) {
		this.upDateSupplerService.upDateSupplerReq(req.getSuppler_id(),req.getSuppler_name(),req.getOrder_reedtime());
	}

	@ApiOperation(value = "発注先登録", notes = "発注先の登録を行います。*IDは自動採番")
	@PostMapping("/entrysuppler")
	public void entry(@RequestBody EntrySupplerReq req) {
		this.entrySupplerReqService.entrySupplerReq(req.getSuppler_name(),req.getOrder_reedtime());
	}


}