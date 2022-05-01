/**
 * 
 */
package App;

/**
 * @author nbwoz
 *
 */
public class Manager extends Employee
{
	public Manager(long id, String name, String address, Long phone)
	{
		super(id, name, address, phone);
	}

	public void calculateTransportAllowance(double basicSalary)
	{
		double transportAllowance = 0.15 * basicSalary;
		System.out.println(transportAllowance + basicSalary);
	}
}