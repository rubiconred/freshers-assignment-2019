package test;

public class User {
	private String userName;
	private String email;
	private String contactNo;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String toString() {
		return "User [contactNo=" + contactNo + ", email=" + email
				+ ", userName=" + userName + "]";
	}
	

}
