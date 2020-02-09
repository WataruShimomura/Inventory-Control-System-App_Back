package inventory.service.supplerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.SupplerMapper;

@Service
public class UpDateSupplerService {

	@Autowired
	private SupplerMapper supplerMapper;

	public void upDateSupplerReq(int id,String name,int date) {
		supplerMapper.updateSupplerReqMapper(id,name,date);
	}

}
