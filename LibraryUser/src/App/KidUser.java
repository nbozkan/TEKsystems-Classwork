/**
 * 
 */
package App;

/**
 * @author nbwoz
 *
 */
public class KidUser implements LibraryUser
{
	private int age;
	private String bookType;

	@Override
	public void registerAccount(int age)
	{
		if (age < 12)
		{
			System.out.println("You have successfully registered under a kids account.");
		} else
		{
			System.out.println("Sorry, age must be less than 12 to register as a kid.");
		}
	}

	@Override
	public void requestBook(String bookType)
	{
		if (bookType.equals("Kids"))
		{
			System.out.println("Book issued successfully, please return the book within 10 days.");
		} else
		{
			System.out.println("Oops, you are allowed to take only kids books.");
		}
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getBookType()
	{
		return bookType;
	}

	public void setBookType(String bookType)
	{
		this.bookType = bookType;
	}
}