package inventory.service.locationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.LocationMapper;

@Service
public class UpDateLocationService {

	@Autowired
	private LocationMapper locationMapper;

	public void updateLocationServiceReq(int id,String name) {
		locationMapper.updateLocationReqMapper(id,name);
	}

}
