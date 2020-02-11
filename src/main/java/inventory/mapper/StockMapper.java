package inventory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import inventory.data.entity.Stocks;

@Mapper
public interface StockMapper {

	@Select("SELECT * FROM stocks")
	public List<Stocks> stocklist();

	@Select("SELECT * FROM stocks where stock_id = #{id}")
	public List<Stocks> stockLocationlist(@Param("id")int id);

	@Delete("delete from stocks where stock_id = #{id}")
	public void deleteStockReqMapper(@Param("id")int id);

	@Update("update stocks set stock = #{stock} where stock_id = #{id}")
	public void updateStockReqMapper(@Param("id")int id,@Param("stock")int stock);

	@Select("SELECT product_name FROM products where product_id=#{product_Id};")
	public String productName(@Param("product_Id") int product_Id);

	@Select("SELECT location_name FROM locations where location_id=#{location_id};")
	public String locationName(@Param("location_id") int location_id);

}
