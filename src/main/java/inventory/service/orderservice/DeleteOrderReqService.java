package inventory.service.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.OrderMapper;

@Service
public class DeleteOrderReqService {

	@Autowired
	private OrderMapper orderMapper;

	public void deleteOrderReq(int order_Id) {
		orderMapper.deleteOrderReqMapper(order_Id);
	}
}
