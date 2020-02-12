package inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.arrivaldata.ArrivalListRes;
import inventory.data.arrivaldata.EntryArrivalReq;
import inventory.service.arrivalservice.ArrivalListService;
import inventory.service.arrivalservice.ArrivalProcessingReqService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("入荷情報を管理するAPI")
@RestController
@RequestMapping(value = "inventory")
public class ArrivalController {
	@Autowired
	private ArrivalListService arrivalListService;
	@Autowired
	private ArrivalProcessingReqService arrivalProcessingReqService;
//	@Autowired
//	private EntryArrivalReqService entryArrivalReqService;

	@ApiOperation(value = "入荷情報一覧取得", notes = "入荷情報を取得する。")
	@GetMapping("/getarrivals")
	public List<ArrivalListRes> getArrivals() {
		return this.arrivalListService.getArrivalList();
	}

	@ApiOperation(value = "入荷処理", notes = "指定した入荷情報を在庫に追加する。")
	@PostMapping("/arrivalprocessing")
	public void arrivalProcessing(@RequestBody EntryArrivalReq req) {
		this.arrivalProcessingReqService.arrivalProcessingReq(req);
	}

//	@ApiOperation(value = "発注・入荷更新", notes = "発注情報から入荷予定を作成する。*注文登録IDは自動採番")
//	@PostMapping("/arrivalentry")
//	public void entry(@RequestBody EntryArrivalReq req) {
//		this.entryOrderReqService.entryArrivalReq(req.getOrder_Id());
//	}

}