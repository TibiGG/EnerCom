package project;

public class House {
	private Battery battery;


	public House()
	{
		battery = new Battery();
	}
	public Battery get_battery()
	{
		return battery;
	}
	public void daily_cost(double used)
	{
		battery.cost(used);
	}

	
	
}
