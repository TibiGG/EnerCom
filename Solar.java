package project;

public class Solar {
	double energy;
	public Solar(double senergy){
		energy=senergy;
	}
	public void charge_it(Battery target)
	{
		target.charge(energy);
	}
}
