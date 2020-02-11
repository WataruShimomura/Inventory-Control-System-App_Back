package inventory.data.entity;

import lombok.Data;

@Data
public class Locations {
	private int location_Id;
	private String location_Name;

	public int getLocation_Id(){
		return this.location_Id;
	}
	public String getLocation_Name(){
		return this.location_Name;
	}
}
