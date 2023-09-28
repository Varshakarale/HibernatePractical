package com.hibernate.thursdaylabhibernate;//package

//importing necessary files
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name="Customer")  //Entity name
@Table(name="Customer_Information")  //Table name

public class Customer //class name
{
	@Id  //primary key
	@Column(name="Customer_id") // Column name in the database for custID
	   private int cust_id;
	@Column(name="Customer_name") //Column name in the database for custName 
	   private String cust_name;
	@Column(name="Customer_Mob_Number") //Column name in the database for custMobNO
	   private String mob_no;
	@Column(name="Customer_city") // Column name in the database for custCity 
	   private String city;
	   
	   @OneToOne  //one to one mapping creation   
	   @JoinColumn     // joining column in customer table
	   private Product prod; 

	   
	public Customer(int cust_id, String cust_name, String mob_no, String city, Product prod) //constructor with parameters
	{
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.mob_no = mob_no;
		this.city = city;
		this.prod = prod;
	}

	public Customer() 
	{
		super();
	}
 
	// gette setter methods
	public int getCust_id()
	{
		return cust_id;
	}

	public void setCust_id(int cust_id) 
	{
		this.cust_id = cust_id;
	}

	public String getCust_name() 
	{
		return cust_name;
	}

	public void setCust_name(String cust_name) 
	{
		this.cust_name = cust_name;
	}

	public String getMob_no() 
	{
		return mob_no;
	}

	public void setMob_no(String mob_no)
	{
		this.mob_no = mob_no;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public Product getProd() 
	{
		return prod;
	}

	public void setProd(Product prod) 
	{
		this.prod = prod;
	}
	   

}