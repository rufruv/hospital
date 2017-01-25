package domain;

public class MemberBean {
	protected String uid, name, ssn, email, addr, phone;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setSsn(String ssn){
		this.ssn = ssn;
	} 
	public String getSsn(){
		return ssn;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public String getAddr(){
		return addr;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setUid(String uid){
		this.uid = uid;
	}
	public String getUid(){
		return uid;
	}
	
	public String calcGender(String ssn) {
		String gender = "";
		char ch = ssn.charAt(7);
		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			gender = "주민번호 오류! 다시 입력하세요";
		}
		if (ch == '1' || ch == '3') {
			gender = "남자";
		} else if (ch == '2' || ch == '4') {
			gender = "여자";
		} else {
			gender = "외국인";
		}
		return gender;
	}
	
}
