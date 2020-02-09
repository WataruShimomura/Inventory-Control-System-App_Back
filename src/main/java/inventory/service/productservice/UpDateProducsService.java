package inventory.service.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.ProductMapper;

@Service
public class UpDateProducsService {

	@Autowired
	private ProductMapper productMapper;

	public void upDateProducServiceReq(int id,String name) {
		productMapper.updateProducReqMapper(id,name);
	}

}
