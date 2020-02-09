package inventory.service.supplerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.SupplerMapper;

@Service
public class EntrySupplerReqService {

	@Autowired
	private SupplerMapper supplerMapper;

	public void entrySupplerReq(String name,int date) {
		supplerMapper.entrySupplerReqMapper(name,date);
	}

}
