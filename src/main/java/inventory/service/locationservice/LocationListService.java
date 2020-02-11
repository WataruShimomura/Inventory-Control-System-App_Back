package inventory.service.locationservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.data.entity.Locations;
import inventory.data.locationdata.LocationListRes;
import inventory.mapper.LocationMapper;

@Service
public class LocationListService {

	@Autowired
	private LocationMapper locationMapper;

	public List<LocationListRes> getLocationList() {
		List<Locations> result = locationMapper.locationlist();
		List<LocationListRes> response = result.stream().map(t -> {
			LocationListRes res = new LocationListRes();
			res.setLocation_Id(t.getLocation_Id());
			res.setLocation_Name(t.getLocation_Name());
			return res;
		}).collect(Collectors.toList());
		return response;
	}

}
