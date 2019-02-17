package project;

public class Battery {
 protected double energy;
 private double overflood;
 	public Battery()
 	{
 		energy =0;
 		overflood=0;
 	}
 	public void charge(double income)
 	{
 		energy+= income;
 	}
 	public void cost(double used)
 	{
 		energy-= used;
 	}
 	public void check_overflow()
 	{
 		if(energy >100)
 		{
 			overflood += energy-100;
 		}
 	}
 	public void send_energy(Energy_storage target)
 	{
 		target.charge(overflood);
 		overflood =0;
 	}
 	public double get_overflow()
 	{
 		return overflood;
 	}
 	public double Get_energy()
 	{
 		return energy;
 	}
}
