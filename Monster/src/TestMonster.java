/**
 * 
 */

/**
 * @author nbwoz
 *
 */
public class TestMonster
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Program at the &quot;interface&quot; defined in the superclass.
		// Declare instances of the superclass, substituted by subclasses.
		Monster m1 = new FireMonster(&quot;r2u2&quot;); // upcast
		Monster m2 = new WaterMonster(&quot;u2r2&quot;); // upcast
		Monster m3 = new StoneMonster(&quot;r2r2&quot;); // upcast
		// Invoke the actual implementation
		System.out.println(m1.attack()); // Run FireMonster&#39;s attack()
		System.out.println(m2.attack()); // Run WaterMonster&#39;s attack()
		System.out.println(m3.attack()); // Run StoneMonster&#39;s attack()
		// m1 dies, generate a new instance and re-assign to m1.
		m1 = new StoneMonster(&quot;a2b2&quot;); // upcast
		System.out.println(m1.attack()); // Run StoneMonster&#39;s attack()
		// We have a problem here!!!
		Monster m4 = new Monster(&quot;u2u2&quot;);
		System.out.println(m4.attack()); // garbage!!!
	}

}
