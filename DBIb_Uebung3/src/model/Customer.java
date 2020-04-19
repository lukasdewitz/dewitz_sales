package model;

public class Customer

{
	private int customerID;
	private String firstName;
	private double credit;
	
	public Customer(int customerID, String firstName, double credit)
	{
		setFirstName(firstName);
		setCustomerID(customerID);
	}

	public int getCustomerID()
	{
		return customerID;
	}

	public String getFirstName()
	{
		return firstName;
	}
	
	public double getCredit()
	{
		return credit;
	}

	public void setCustomerID(int customerID)
	{
		this.customerID = customerID;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setCredit(double credit)
	{
		this.credit = credit;
	}
	
}
