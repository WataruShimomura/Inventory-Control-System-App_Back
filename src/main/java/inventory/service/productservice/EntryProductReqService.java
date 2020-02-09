package inventory.service.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.ProductMapper;

@Service
public class EntryProductReqService {

	@Autowired
	private ProductMapper StockMapper;

	public void entryProductReq(String name) {
		StockMapper.entryProductReqMapper(name);
	}

}
