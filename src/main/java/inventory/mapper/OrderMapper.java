package inventory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import inventory.data.entity.Orders;

@Mapper
public interface OrderMapper {

	@Select("SELECT * FROM orders")
	public List<Orders> orderlist();

	@Delete("delete from orders where orders_id = #{order_Id}")
	public void deleteOrderReqMapper(@Param("order_Id")int order_Id);

	@Insert("insert into orders (product_Id, suppler_Id, order_Quantity) values (#{product_Id}, #{suppler_Id}, #{order_Quantity})")
	public void entryOrderReqMapper(@Param("product_Id") int product_Id,@Param("suppler_Id") int suppler_Id,@Param("order_Quantity")String order_Quantity);

	@Select("SELECT product_name FROM products where product_id=#{product_Id};")
	public String productName(@Param("product_Id") int product_Id);

	@Select("SELECT suppler_name FROM supplers where suppler_id=#{suppler_Id};")
	public String supplerName(@Param("suppler_Id") int suppler_Id);

}
