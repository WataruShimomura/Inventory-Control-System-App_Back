package inventory.service.stockservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.StockMapper;

@Service
public class UpdateStocksService {

	@Autowired
	private StockMapper stockMapper;

	public void updateStockServiceReq(int id,int stock) {
		stockMapper.updateStockReqMapper(id,stock);
	}

}
