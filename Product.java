package com.hibernate.thursdaylabhibernate;

//Importing necessary Java Persistence (JPA) annotations
import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Product")   // Entity File Declaration
@Table(name="Product_Info") // Name of Table

public class Product //class Product
{
		@Id  // primary key
		@Column(name="Product_Id") 
		private int pid;  //Declaration of a field to store the product ID
		@Column(name="Product_Name")
		private String pname; //to store product name
		@Column(name="Product_Price")
		private int p_price; //to store product price
		
		// creating constructors
		public Product(int pid, String pname, int pro_price) 
		{
			super();
			this.pid = pid;
			this.pname = pname;
			this.p_price = p_price;
		}
		public Product()
		{
			super();
		}
		
		// creating getter and setter to create and access instances of the Product class.
		public int getPid() // Getter method to retrieve the product ID
		{
			return pid;
		}
		public void setPid(int pid) // Setter method to set the product ID
		{
			this.pid = pid;
		}
		public String getPname() //Getter method to retrieve the product name
		{
			return pname;
		}
		public void setPname(String pname) //Setter method to set the product name
		{
			this.pname = pname;
		}
		public int getPro_price() //Getter method to retrieve the product price
		{
			return p_price;
		}
		public void setPro_price(int pro_price) //Setter method to set the product price
		{
			this.p_price = pro_price;
		}
}