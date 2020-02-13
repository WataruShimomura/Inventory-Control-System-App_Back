package inventory.service.arrivalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.data.arrivaldata.EntryArrivalReq;
import inventory.mapper.ArrivalMapper;

@Service
public class EntryArrivalReqService {

	@Autowired
	private ArrivalMapper arrivalMapper;

	public void arrivalProcessingReq(EntryArrivalReq req) {

		arrivalMapper.orderFlagOn(req.getOrder_Id());

		int product_Id = arrivalMapper.getProduct_Id_InOrders(req.getOrder_Id());

		int suppler_Id = arrivalMapper.getSuppler_Id(req.getOrder_Id());

		String arrival_date = arrivalMapper.getArrivalDate(req.getOrder_Id());

		int order_quantity = arrivalMapper.getOrderQuantityInOrders(req.getOrder_Id());

		arrivalMapper.arrivalEntry(product_Id,suppler_Id,arrival_date,order_quantity);
	}
}
