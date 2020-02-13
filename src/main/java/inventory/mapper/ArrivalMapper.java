package inventory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import inventory.data.entity.Arrivals;

@Mapper
public interface ArrivalMapper {

	@Select("SELECT * FROM arrivals")
	public List<Arrivals> arrivallist();

	@Insert("insert into arrivals (product_Id, suppler_Id, arrival_date, order_Quantity, suppler_flag) values (#{product_Id}, #{suppler_Id}, #{arrival_date}, #{order_Quantity}, 0)")
	public void arrivalEntry(@Param("product_Id") int product_Id,@Param("suppler_Id") int suppler_Id,@Param("arrival_date") String arrival_date,@Param("order_Quantity")int order_Quantity);

	@Update("update arrivals set arrival_flag = 1 where arrival_id = #{arrival_id}")
	public void orderFlagOn(@Param("arrival_id")int arrival_id);

	@Insert("insert into stocks (product_Id, location_id, stock) values (#{product_Id}, #{location_id}, #{stock})")
	public void stockentry(@Param("product_Id") int product_Id,@Param("location_id") int location_id,@Param("stock")int stock);

	@Update("update arrivals set arrival_flag = 1 where arrival_id = #{arrival_id}")
	public void arrivalFlagOn(@Param("arrival_id")int arrival_id);

	@Select("SELECT product_name FROM products where product_id=#{product_Id};")
	public String getProductName(@Param("product_Id") int product_Id);

	@Select("SELECT product_id FROM orders where orders_id=#{orders_id};")
	public int getProduct_Id_InOrders(@Param("orders_id") int orders_id);

	@Select("SELECT product_id FROM arrivals where arrival_id=#{arrival_Id};")
	public int getProduct_Id(@Param("arrival_Id") int arrival_Id);

	@Select("SELECT order_quantity FROM arrivals where arrival_id=#{arrival_Id};")
	public int getOrder_Quantity(@Param("arrival_Id") int arrival_Id);

	@Select("SELECT suppler_name FROM supplers where suppler_id=#{suppler_Id};")
	public String getSupplerName(@Param("suppler_Id") int suppler_Id);

	@Select("SELECT suppler_id FROM orders where orders_id=#{orders_id};")
	public int getSuppler_Id(@Param("orders_id") int orders_id);

	@Select("SELECT arrival_date FROM orders where orders_id=#{orders_id};")
	public String getArrivalDate(@Param("orders_id") int orders_id);

	@Select("SELECT order_quantity FROM orders where orders_id=#{orders_id};")
	public int getOrderQuantityInOrders(@Param("orders_id") int orders_id);

}
