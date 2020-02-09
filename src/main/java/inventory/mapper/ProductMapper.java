package inventory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import inventory.data.entity.Products;

@Mapper
public interface ProductMapper {

	@Select("SELECT * FROM products")
	public List<Products> productslist();

	@Delete("delete from products where product_id = #{id}")
	public void deleteProductReqMapper(@Param("id")int id);

	@Update("update products set product_name = #{name} where product_id = #{id}")
	public void updateProducReqMapper(@Param("id")int id,@Param("name")String name);

	@Insert("insert into products name values #{name}")
	public void entryProductReqMapper(@Param("name") String name);

}
