package inventory.service.supplerservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.data.entity.Supplers;
import inventory.data.supplersdata.SupplerListRes;
import inventory.mapper.SupplerMapper;

@Service
public class SupplerListService {

	@Autowired
	private SupplerMapper supplerMapper;


	public List<SupplerListRes> getSupplerList() {
		List<Supplers> result = supplerMapper.supplerlist();
		List<SupplerListRes> response = result.stream().map(t -> {
			SupplerListRes res = new SupplerListRes();
			res.setSuppler_id(t.getSuppler_id ());
			res.setSuppler_name(t.getSuppler_name ());
			res.setOrder_reedtime(t.getOrder_reedtime());
			return res;
		}).collect(Collectors.toList());
		return response;
	}

}
