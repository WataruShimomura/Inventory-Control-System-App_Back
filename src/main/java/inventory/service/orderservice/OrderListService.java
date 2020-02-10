package inventory.service.orderservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.data.entity.Orders;
import inventory.data.ordersdata.OrderListRes;
import inventory.mapper.OrderMapper;

@Service
public class OrderListService {

	@Autowired
	private OrderMapper orderMapper;


	public List<OrderListRes> getOrderList() {
		List<Orders> result = orderMapper.orderlist();
		List<OrderListRes> response = result.stream().map(t -> {
			OrderListRes res = new OrderListRes();
			res.setOrder_Id(t.getOrder_Id ());

			String product_Name = orderMapper.productName(t.getProduct_Id ());
			res.setProduct_Name(product_Name);

			String Suppler_Name = orderMapper.supplerName(t.getSuppler_Id ());
			res.setSuppler_Name(Suppler_Name);

			res.setorder_Quantity(t.getorder_Quantity ());
			res.setarrival_Date(t.getorder_Quantity());
			return res;
		}).collect(Collectors.toList());
		return response;
	}

}
