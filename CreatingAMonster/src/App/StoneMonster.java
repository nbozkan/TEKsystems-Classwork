/**
 * 
 */
package App;

/**
 * @author nbwoz
 *
 */
public class StoneMonster extends Monster
{
	public StoneMonster(String name)
	{
		super(name);
	}

	public String attack()
	{
		String attackPhrase = "Attack with stones!";
		return attackPhrase;
	}
}