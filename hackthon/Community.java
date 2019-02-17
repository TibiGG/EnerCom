package project;

import java.util.ArrayList;

public class Community {
	private Energy_storage community_battery;
	private ArrayList<House> HOUSES = new ArrayList<House>();
	Community(int house_amount)
	{
		for(int i=0;i<house_amount;i++)
		{
			HOUSES.add(new House());
		}
		
	}
	public House get_house(int index)
	{
		return HOUSES.get(index);
	}
	public Energy_storage get_c_battery()
	{
		return community_battery;
	}
	
}
