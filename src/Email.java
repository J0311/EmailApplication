//@author Joseph Walker

import java.util.Scanner;

public class Email {
	
	//Here we create variables with PRIVATE access modifiers
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = ".ABCcompany.com";
	
	//Tasks to complete:
	
	//Constructor to receive first & last name
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Welcome "+this.firstName + " "+this.lastName);
	
	//Call a method asking for department/return the department
		this.department = setDepartment();
		System.out.println("Department is: "+ this.department);
		
	//Call for method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password);
		
	//Combine elements to GENERATE email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"+ department + companySuffix;
		//System.out.println("Your email is: "+ email);
		
	}
	
	//Ask for the department
	
	private String setDepartment() {
		System.out.println("Please ENTER your Department Code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) { return "Sales"; 
		}
		else if (depChoice == 2) {return "Dev";
		}
		else if (depChoice == 3) { return "Accounting";
		}
		else {return "";}
		
		
		
		}
	
	
	
	//Generate a method for random password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWYXZ1234567890!@#$%^&*()";
		char [] password = new char [length];
		for(int i = 0; i<length; i++) {
		int rand =	(int) (Math.random() * passwordSet.length());
		password [i] = passwordSet.charAt(rand);
		
	}
		return new String(password);
		
	}


	//Set the mailbox capacity
		public void setMailboxCapacity(int capacity) {
			this.mailboxCapacity = capacity;
		}
	
	//Set alternate email
		public void setAlternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
		
	//Change the password
		public void setChangePassword(String password) {
			this.password = password;
		} 
	//Out method to SHOW the mailbox capacity
		public int getMailboxCapacity() {
			return mailboxCapacity;
		}
		public String getAlternateEmail() {
			return alternateEmail;
		}
		public String getPassword() {
			return password;
			
		}
		//Method to display ALL user info
		public String showInfo() {
			return "DISPLAY NAME: " + firstName + " "+ lastName+
					"\nCOMPANY EMAIL: " + email +
					"\nMAILBOX CAPACITY: " + mailboxCapacity + " mb";
		}
	}

