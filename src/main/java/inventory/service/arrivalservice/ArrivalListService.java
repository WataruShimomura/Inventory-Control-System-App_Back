package inventory.service.arrivalservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.data.arrivaldata.ArrivalListRes;
import inventory.data.entity.Arrivals;
import inventory.mapper.ArrivalMapper;

@Service
public class ArrivalListService {

	@Autowired
	private ArrivalMapper arrivalMapper;


	public List<ArrivalListRes> getArrivalList() {
		List<Arrivals> result = arrivalMapper.arrivallist();
		List<ArrivalListRes> response = result.stream().map(t -> {
			ArrivalListRes res = new ArrivalListRes();
			res.setArrival_Id(t.getArrival_Id ());

			String product_Name = arrivalMapper.getProductName(t.getProduct_Id ());
			res.setProduct_Name(product_Name);

			String suppler_Name = arrivalMapper.getSupplerName(t.getSuppler_Id ());
			res.setSuppler_Name(suppler_Name);

			int order_Quantity = arrivalMapper.getOrderQuantityInOrders(t.getorder_Quantity ());
			res.setOrder_Quantity(order_Quantity);

			String arrival_Date = arrivalMapper.getArrivalDate(t.getProduct_Id ());
			res.setArrival_Date(arrival_Date);
			return res;
		}).collect(Collectors.toList());
		return response;
	}

}
