/**
 * 
 */
package App;

/**
 * @author nbwoz
 *
 */

public class InheritanceActivity
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Manager manager = new Manager(126534, "Peter", "Chennai India", (long) 237844);
		manager.calculateSalary(65000);

		Trainee trainee = new Trainee(29846, "Jack", "Mumbai, India", (long) 442085);
		trainee.calculateSalary(45000);

		manager.calculateTransportAllowance(65000);
		trainee.calculateTransportAllowance(45000);
	}
}