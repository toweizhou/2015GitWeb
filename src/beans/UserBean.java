package beans;

public class UserBean {
	private String username;
	private String passoword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassoword() {
		return passoword;
	}
	public void setPassoword(String passoword) {
		this.passoword = passoword;
	}
	
	public boolean valid(String username,String password){
		if( username=="zs" && password == "ls"){
			return true;
		}else
			return false;
	}
	
}
