package domain;

public class PatientBean extends MemberBean {
	private String patJob, weight, height, bloodType, docId, nurId;

	public void setPatJob(String patJob) {
		this.patJob = patJob;
	}
	public String getPatJob() {
		return patJob;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getDocId() {
		return docId;
	}
	public void setNurId(String nurId) {
		this.nurId = nurId;
	}
	public String getNurId() {
		return nurId;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getWeight() {
		return weight;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getHeight() {
		return height;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getBloodType() {
		return bloodType;
	}
	/*@Override
	public String toString() {
		return String.format("환자ID: %s\n"
							+ "간호사ID: %s\n"
							+ "의사ID: %s\n"
							+ "환자성명: %s\n"
							+ "환자성별: %s\n"
							+ "주민번호(800101-1): %s\n"
							+ "전화번호:%s\n"
							+ "주소: %s\n"
							+ "이메일: %s\n"
							+ "직업: %s\n", uid, nurUid, docUid, name, calcGender(ssn), ssn, phone, addr, email, patJob);
	}*/
	@Override
	public String toString() {
		return String.format("%s님, 접수완료!", getName());
	}
}