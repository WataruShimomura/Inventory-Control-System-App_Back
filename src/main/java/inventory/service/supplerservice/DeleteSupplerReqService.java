package inventory.service.supplerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.SupplerMapper;

@Service
public class DeleteSupplerReqService {

	@Autowired
	private SupplerMapper supplerMapper;

	public void deleteSupplerReq(int suppler_id) {
		supplerMapper.deleteSupplerReqMapper(suppler_id);
	}
}
