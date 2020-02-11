package inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.data.locationdata.DeleteLocationReq;
import inventory.data.locationdata.EntryLocationReq;
import inventory.data.locationdata.LocationListRes;
import inventory.data.locationdata.UpdateLocationReq;
import inventory.service.locationservice.DeleteLocationReqService;
import inventory.service.locationservice.EntryLocationReqService;
import inventory.service.locationservice.LocationListService;
import inventory.service.locationservice.LocationParamService;
import inventory.service.locationservice.UpDateLocationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("保管先情報を管理するAPI")
@RestController
@RequestMapping(value = "inventory")
public class LocationController {
	@Autowired
	private LocationListService locationListService;
	@Autowired
	private LocationParamService locationParamService;
	@Autowired
	private DeleteLocationReqService deleteLocationReqService;
	@Autowired
	private UpDateLocationService upDateLocationService;
	@Autowired
	private EntryLocationReqService entryLocationReqService;

	@ApiOperation(value = "保管先情報一覧取得", notes = "保管先一覧情報を取得する。")
	@GetMapping("/getlocations")
	public List<LocationListRes> getLocations() {
		return this.locationListService.getLocationList();
	}

	@ApiOperation(value = "保管先詳細取得", notes = "指定したＩＤの保管先の情報を取得します。")
	@GetMapping("/gootsparam")
	public LocationListRes getLocationParam(@RequestBody Integer id) {
		return this.locationParamService.locationParamReq(id);
	}

	@ApiOperation(value = "保管先情報消去", notes = "指定したIDの保管先情報を消去します。")
	@PostMapping("/deletelocation")
	public void delete(@RequestBody DeleteLocationReq req) {
		this.deleteLocationReqService.deleteLocationReq(req.getLocation_Id());
	}

	@ApiOperation(value = "保管先情報更新", notes = "指定したＩＤの保管先情報を引数の値に更新します。")
	@PostMapping("/updatelocation")
	public void upDate(@RequestBody UpdateLocationReq req) {
		this.upDateLocationService.updateLocationServiceReq(req.getLocation_Id(),req.getLocation_Name());
	}

	@ApiOperation(value = "保管先情報登録", notes = "保管先名の登録を行います。")
	@PostMapping("/entrylocation")
	public void entry(@RequestBody EntryLocationReq req) {
		this.entryLocationReqService.entryLocationReq(req.getLoction_Name());
	}

}