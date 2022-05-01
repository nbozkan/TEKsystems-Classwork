/**
 * 
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author nbwoz
 *
 */
public class JDBCExample
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Class.forName("org.mariadb.jdbc.Driver");
		String url = "jdbc:mariadb://localhost/classicmodels";
		final String USER = "root";
		final String PASS = "DeanAz1993!";
		Connection conn = DriverManager.getConnection(url, USER, PASS);

		String SelectSQL = "Select * FROM employees";
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(SelectSQL);
		while (result.next())
		{
			String name = result.getString("firstName");
			String email = result.getString("email");
			System.out.println(name + " | " + email);
		}
	}

}
