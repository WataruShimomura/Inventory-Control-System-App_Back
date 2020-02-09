package inventory.service.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.ProductMapper;

@Service
public class DeleteProductReqService {

	@Autowired
	private ProductMapper productMapper;

	public void deleteSupplerReq(int id) {
		productMapper.deleteProductReqMapper(id);
	}
}
