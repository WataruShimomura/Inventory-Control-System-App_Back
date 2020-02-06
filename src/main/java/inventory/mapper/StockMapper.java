package inventory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import inventory.data.entity.Products;

@Mapper
public interface StockMapper {

	@Select("SELECT * FROM products")
	public List<Products> productslist();

	@Delete("delete from Stock where id = #{id}")
	public void deleteProductReqMapper(@Param("id")int id);

	@Update("update Stock set name = #{name} where id = #{id}")
	public void updateProducReqMapper(@Param("id")int id,@Param("name")String name);

}
