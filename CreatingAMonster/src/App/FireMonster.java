/**
 * 
 */
package App;

/**
 * @author nbwoz
 *
 */
public class FireMonster extends Monster
{
	public FireMonster(String name)
	{
		super(name);
	}

	public String attack()
	{
		String attackPhrase = "Attack with fire!";
		return attackPhrase;
	}
}
