package EmailApplication;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String department;
	private String companyName="xyzcomapny";
	private String password;
	private int defaultPasslength=8;
	private int mailBoxCapacity;
	private String altEmail;
	
	Email(String firstname,String lastname){
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("Your Email: "+firstname+" "+lastname);
		//set department
		String setdept=setDepartment();
		System.out.println("department you entered is: " +setdept);
		//set email
		String email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+setdept.toLowerCase()+"."+companyName+".com";
		System.out.println("your email is :" +email);
		//set random password
		System.out.println("Your Password is: " +randomPassword(defaultPasslength));
	}
	
    private String setDepartment() {
    	System.out.println("Department Codes:\nsales 0\nAccounting 1\nFinance 2");
		System.out.println("Enter Department :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0) { return "sales";}
		else if(n==1) { return "accounts";}
		else if(n==2) { return "finance";}
		else { return " ";}
		
    }
    
    private String randomPassword(int length) {
    	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$&%";
    	char[] password=new char[length];
    	for(int i=0;i<length;i++) {
    		int n=(int)(Math.random()*passwordSet.length());
    		password[i]=passwordSet.charAt(n);
    	}
    	return new String(password);
    }
    
    public void setMailBoxCapacity(int capacity) {
    	this.mailBoxCapacity=capacity;
    }
    
    public void setAltEmail(String alteEmail) {
    	this.altEmail=alteEmail;
    }
    
    public void setPassword(String password) {
    	this.password=password;
    }
    
    public int getMailBoxCapacity() {
    	return mailBoxCapacity;
    }
    
    public String getAltEmail() {
    	return altEmail;
    }
    
    public String getPassword() {
    	return password;
    }
}
