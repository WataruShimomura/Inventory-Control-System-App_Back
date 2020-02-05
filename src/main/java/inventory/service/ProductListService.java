package inventory.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.data.ProductListRes;
import inventory.data.entity.Products;
import inventory.mapper.StockMapper;

@Service
public class ProductListService {

	@Autowired
	private StockMapper StockMapper;


	public List<ProductListRes> getProductList() {
		List<Products> result = StockMapper.productslist();
		List<ProductListRes> response = result.stream().map(t -> {
			ProductListRes res = new ProductListRes();
			res.setId(t.getId());
			res.setName(t.getName());
			return res;
		}).collect(Collectors.toList());
		return response;
	}

}
