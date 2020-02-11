package inventory.service.locationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.LocationMapper;

@Service
public class EntryLocationReqService {

	@Autowired
	private LocationMapper locationMapper;

	public void entryLocationReq(String name) {
		locationMapper.entryLocationReqMapper(name);
	}

}
