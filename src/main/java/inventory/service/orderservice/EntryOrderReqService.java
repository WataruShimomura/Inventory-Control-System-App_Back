package inventory.service.orderservice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.OrderMapper;

@Service
public class EntryOrderReqService {

	@Autowired
	private OrderMapper orderMapper;

	public void entryOrderReq(int product_Id,int suppler_Id,int order_Quantity) {
		Date date = new Date();
		Calendar time = Calendar.getInstance();
		time.setTime(date);
		time.add(Calendar.DAY_OF_MONTH, order_Quantity);
		Date d1 = time.getTime();
		SimpleDateFormat order_QuantityReq = new SimpleDateFormat("yyyy'-'mm'-'dd");
		orderMapper.entryOrderReqMapper(product_Id,suppler_Id,order_QuantityReq.format(d1));
	}
}
