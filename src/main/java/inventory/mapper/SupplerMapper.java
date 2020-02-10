package inventory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import inventory.data.entity.Supplers;

@Mapper
public interface SupplerMapper {

	@Select("SELECT * FROM supplers")
	public List<Supplers> supplerlist();

	@Delete("delete from supplers where suppler_id = #{suppler_id}")
	public void deleteSupplerReqMapper(@Param("suppler_id")int suppler_id);

	@Update("update supplers set suppler_name = #{suppler_name} order_reedtime = #{order_reedtime} where suppler_id = #{suppler_id}")
	public void updateSupplerReqMapper(@Param("id")int id,@Param("name")String name,@Param("order_reedtime")int order_reedtime);

	@Insert("insert into supplers (suppler_name, order_reedtime) values (#{suppler_name}, #{order_reedtime})")
	public void entrySupplerReqMapper(@Param("suppler_name") String suppler_name,@Param("order_reedtime")int order_reedtime);

}
