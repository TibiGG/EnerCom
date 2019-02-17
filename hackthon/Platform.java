package project;

import java.util.ArrayList;

public class Platform {
	private ArrayList<Community>Group = new ArrayList<Community>();
	Platform(int group_amount)
	{
		for(int i=0;i<group_amount;i++)
		{
			Group.add(new Community(6));
		}
	}
	public Community get_firt_group()
	{
		return Group.get(0);
	}
	public Community get_group(int index)
	{
		return Group.get(index);
	}
	public void community_transfer(Community from, Community terminal)
	{
		terminal.get_c_battery().charge(from.get_c_battery().Get_energy()/2);
	}
}
