package domain;

public class DoctorBean extends MemberBean{
	private String docPosition, majorTreat, profileImg ;
		
	public void setDocPosition(String docPosition){
		this.docPosition = docPosition;
	}
	public String getDocPosition(){
		return docPosition ;
	}
	
	public void setMajorTreat(String majorTreat){
		this.majorTreat = majorTreat;
	}
	public String getMajorTreat(){
		return majorTreat ;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	public String getProfileImg() {
		return profileImg;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s) [ %s | %s | %s | %s | %s ]", 
							 name, calcGender(ssn), uid, majorTreat, phone, email, docPosition);
	}
}
