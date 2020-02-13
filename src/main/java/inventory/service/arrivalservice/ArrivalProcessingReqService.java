package inventory.service.arrivalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.data.arrivaldata.ArrivalProcessingReq;
import inventory.mapper.ArrivalMapper;

@Service
public class ArrivalProcessingReqService {

	@Autowired
	private ArrivalMapper arrivalMapper;

	public void arrivalProcessingReq(ArrivalProcessingReq req) {

		arrivalMapper.arrivalFlagOn(req.getArrival_Id());

		int product_Id = arrivalMapper.getProduct_Id(req.getArrival_Id());

		int order_quantity = arrivalMapper.getOrder_Quantity(req.getArrival_Id());

		arrivalMapper.stockentry(product_Id,req.getLocation_Id(),order_quantity);
	}
}
