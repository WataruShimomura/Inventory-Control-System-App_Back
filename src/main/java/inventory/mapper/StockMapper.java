package inventory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import inventory.data.entity.Products;

@Mapper
public interface StockMapper {
	@Select("SELECT * FROM products")
	public List<Products> productslist();
}
