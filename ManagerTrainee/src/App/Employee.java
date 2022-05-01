/**
 * 
 */
package App;

/**
 * @author nbwoz
 *
 */

public class Employee
{
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private Long employeePhone;
	private double basicSalary;
	private double specialAllowance = 250.8;
	private double hra = 1000.5;

	/**
	 * @param employeeId
	 * @param employeeName
	 * @param employeeAddress
	 * @param employeePhone
	 */
	public Employee(long id, String name, String address, Long phone)
	{
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}

	public void calculateSalary(double basicSalary)
	{
		double salary = basicSalary + (basicSalary * (specialAllowance / 100)) + (basicSalary * (hra / 100));
		System.out.println(salary);
	}

	public void calculateTransportAllowance(double basicSalary)
	{
		double transportAllowance = 0.1 * basicSalary;
		System.out.println(transportAllowance + basicSalary);
	}

	public long getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeId(long employeeId)
	{
		this.employeeId = employeeId;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress()
	{
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress)
	{
		this.employeeAddress = employeeAddress;
	}

	public Long getEmployeePhone()
	{
		return employeePhone;
	}

	public void setEmployeePhone(Long employeePhone)
	{
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary()
	{
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary)
	{
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance()
	{
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance)
	{
		this.specialAllowance = specialAllowance;
	}

	public double getHra()
	{
		return hra;
	}

	public void setHra(double hra)
	{
		this.hra = hra;
	}
}