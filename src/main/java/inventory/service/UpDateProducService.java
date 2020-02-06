package inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.StockMapper;

@Service
public class UpDateProducService {

	@Autowired
	private StockMapper stockMapper;

	public void upDateProducService(int id,String name) {
		stockMapper.updateProducReqMapper(id,name);
	}

}
