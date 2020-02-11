package inventory.service.locationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.LocationMapper;

@Service
public class DeleteLocationReqService {

	@Autowired
	private LocationMapper locationMapper;

	public void deleteLocationReq(int id) {
		locationMapper.deleteLocationReqMapper(id);
	}
}
