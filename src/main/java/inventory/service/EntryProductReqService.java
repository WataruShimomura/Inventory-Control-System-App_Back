package inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.StockMapper;

@Service
public class EntryProductReqService {

	@Autowired
	private StockMapper StockMapper;

	public void entryProductReq(String name) {
		StockMapper.entryProductReqMapper(name);
	}

}
