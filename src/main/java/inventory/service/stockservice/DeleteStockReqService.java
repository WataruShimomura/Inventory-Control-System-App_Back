package inventory.service.stockservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.StockMapper;

@Service
public class DeleteStockReqService {

	@Autowired
	private StockMapper stockMapper;

	public void deleteStockReq(int id) {
		stockMapper.deleteStockReqMapper(id);
	}
}
