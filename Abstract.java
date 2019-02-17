package project;

public class Abstract {
	private Platform server;
	private Solar solar;
	Abstract(double sol)
	{
		server = new Platform(1);
		solar = new Solar(sol);
	}
	public Solar get_Solar()
	{
		return solar;
	}
	//charge the battery at morning
	public void chargeup(double energy)
	{
		for(int i = 0;i<6;i++)
		{
		solar.charge_it(server.get_firt_group().get_house(i).get_battery());
		}
	}
	//cost house energy
	public void daily_cost(double used)
	{
		for(int i =0;i<6;i++)
		{
		server.get_firt_group().get_house(i).daily_cost(used);
		}
	}
	//charge non and cost half when its night time
	public void night_cost()
	{
		for(int i =0;i<6;i++)
		{
		server.get_firt_group().get_house(i).daily_cost(1);
		}
	}
	//use supply energy from community to charge each person's house at night time
	public void charge_from_supply()
	{
		double temp = 3;
		for(int i=0;i<6;i++)
		{
		server.get_firt_group().get_c_battery().refill();
		}
		chargeup(temp);
	}
	//check battery of community if it >950 do a transfer of half to others who needs it
	public void check_limit()
	{
		if(server.get_firt_group().get_c_battery().Get_energy()>950)
		{
			server.community_transfer(server.get_firt_group(), server.get_group(1));
		}
	}

	public void show()
	{
		System.out.println("all the house currently have:");
		System.out.println(server.get_firt_group().get_house(0).get_battery().Get_energy());
		System.out.println(" energy");
		for(int i =0;i<6;i++)
		{
	
		chargeup(solar.energy);
		}
		for(int i =0;i<6;i++)
		{
		System.out.println(server.get_firt_group().get_house(i).get_battery().Get_energy());
	
		}
		for(int i =0;i<6;i++)
		{
	
		daily_cost(2);
		}
		for(int i =0;i<6;i++)
		{
		System.out.println(server.get_firt_group().get_house(i).get_battery().Get_energy());
	
		}
	}
	public Platform get_server()
	{
		return server;
	}
	public static void main(String args[])
	{
		Abstract n = new Abstract(10);
		n.show();
	}
}
