package inventory.service.stockservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.data.entity.Stocks;
import inventory.data.stockdata.StockListRes;
import inventory.mapper.StockMapper;

@Service
public class StockListService {

	@Autowired
	private StockMapper stockMapper;

	public List<StockListRes> getStockList() {
		List<Stocks> result = stockMapper.stocklist();
		List<StockListRes> response = result.stream().map(t -> {
			StockListRes res = new StockListRes();
			res.setStock_Id(t.getStock_Id());

			String product_Name = stockMapper.productName(t.getProduct_Id());
			res.setProduct_Name(product_Name);

			String location_Name = stockMapper.locationName(t.getProduct_Id());
			res.setLocation_Name(location_Name);

			res.setStock_Num(t.getStock_Num());
			return res;
		}).collect(Collectors.toList());
		return response;
	}

}
