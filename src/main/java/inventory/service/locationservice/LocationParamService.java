package inventory.service.locationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.data.locationdata.LocationListRes;
import inventory.mapper.LocationMapper;

@Service
public class LocationParamService {

	@Autowired
	private LocationMapper locationMapper;

	//更新時間実装時に使用予定
	public LocationListRes locationParamReq(int id) {
		LocationListRes result = locationMapper.locationParamReqMapper(id);
		return result;
	}

}
