package za.co.ticketreservation.people;

import java.util.Scanner;

public class UserLogin {

	private String userName;
	private String password;
	private String email;

	public String getUsername() {
		return this.userName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void createAccount() {

		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter your user name");
		this.userName = userInput.nextLine();

		System.out.print("Enter your password");
		this.password = userInput.nextLine();

	}

	public void logOut() {
		return;
	}

}
