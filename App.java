package com.hibernate.thursdaylabhibernate; //package

//Importing necessary Java Persistence (JPA) annotations
import org.hibernate.Session;   
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App  //main class
{
    public static void main( String[] args ) //main method
    {
    	System.out.println( "project started" );
        Configuration cfg = new Configuration(); // Creating a new Hibernate Configuration
        cfg.configure("Hibernate.cfg.xml"); //Loading Hibernate configuration from the Hibernate.cfg.xml file
        
        SessionFactory factory = cfg.buildSessionFactory(); //Build a Hibernate SessionFactory using the configuration
        Customer c1 = new Customer(); //Creating a new Customer entity object
        
     // Setting properties for the Customer entity
        c1.setCust_id(01);
        c1.setCust_name("Varsha");
        c1.setMob_no("7385429010");
        c1.setCity("Ahmednagar");
        
        
        Product p1=new Product();// Creating a new Product entity object
        p1.setPid(101);  
        p1.setPname("FashWash");
        p1.setPro_price(50);
        
       // one to one Mapping     
       
        c1.setProd(p1); // Establish a one-to-one mapping between Customer and Product
        //session opening
        Session session=factory.openSession(); 
        //starting the session
        
        Transaction tx=session.beginTransaction();//Begin a new transaction
        session.save(c1);   
        session.save(p1);
        
        tx.commit();   //Commit the transaction
        session.close(); //session closed
        factory.close(); //factory closed
 
     }
}
