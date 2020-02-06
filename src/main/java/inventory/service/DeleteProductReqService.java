package inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.StockMapper;

@Service
public class DeleteProductReqService {

	@Autowired
	private StockMapper StockMapper;

	public void deleteProductReq(int id) {
		StockMapper.deleteProductReqMapper(id);
	}
}
