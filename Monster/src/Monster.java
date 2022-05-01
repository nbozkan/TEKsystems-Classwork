/**
 * 
 */

/**
 * @author nbwoz
 *
 */
public class Monster
{
	private String name;
	
	/**
	 * @param name
	 */
	public Monster(String name)
	{
		super();
		this.name = name;
	}



	public String getName()
	{
		return name;
	}



	public void setName(String name)
	{
		this.name = name;
	}



	public String attack()
	{
		String attackPhrase = "!^_&amp;^$@+%$* I don&#39;t know how to attack!";
		return attackPhrase;
	}
}
