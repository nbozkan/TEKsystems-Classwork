/**
 * 
 */
package App;

/**
 * @author nbwoz
 *
 */

public class WaterMonster extends Monster
{
	public WaterMonster(String name)
	{
		super(name);
	}

	public String attack()
	{
		String attackPhrase = "Attack with water!";
		return attackPhrase;
	}
}