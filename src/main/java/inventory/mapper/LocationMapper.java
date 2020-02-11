package inventory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import inventory.data.entity.Locations;
import inventory.data.locationdata.LocationListRes;

@Mapper
public interface LocationMapper {

	@Select("SELECT * FROM locations")
	public List<Locations> locationlist();

	@Select("select * from locations where location_id = #{id}")
	public LocationListRes locationParamReqMapper(@Param("id")int id);

	@Delete("delete from locations where location_id = #{id}")
	public void deleteLocationReqMapper(@Param("id")int id);

	@Update("update locations set location_name = #{name} where location_id = #{id}")
	public void updateLocationReqMapper(@Param("id")int id,@Param("name")String name);

	@Insert("insert into locations location_name values #{name}")
	public void entryLocationReqMapper(@Param("name") String name);

}
