package inventory.service.arrivalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.data.arrivaldata.EntryArrivalReq;
import inventory.mapper.ArrivalMapper;

@Service
public class ArrivalProcessingReqService {

	@Autowired
	private ArrivalMapper arrivalMapper;

	public void arrivalProcessingReq(EntryArrivalReq req) {
		arrivalMapper.stockentry(req.getProduct_Id (),req.getLocation_Id(),req.getStock());
	}
}
