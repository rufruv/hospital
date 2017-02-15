package serviceImpl;

import domain.MemberBean;
import domain.DoctorBean;
import domain.NurseBean;
import domain.PatientBean;
import service.AdminService;

public class AdminServiceImpl implements AdminService{
	private DoctorBean[] doctorList;
	private NurseBean[] nurseList;
	int doctorCount;
	int nurseCount;
	
	public AdminServiceImpl() {
		
		doctorList = new DoctorBean[doctorCount];
		nurseList = new NurseBean[nurseCount];
		doctorCount = nurseCount = 0; // 0.doctorCount 1.nurseCount
	}
	@Override
	public String getBmi(PatientBean pat) {
		String bmiResult = "";
		double weight = Double.parseDouble(pat.getWeight());
		double height = Double.parseDouble(pat.getHeight());
		double bmi = weight / ( height/100 * height/100 );
		if (bmi > 30.0) {
			bmiResult = "고도비만";
		} else if (bmi > 25.0) {
			bmiResult = "비만";
		} else if (bmi > 23.0) {
			bmiResult = "과체중";
		} else if (bmi > 18.5) {
			bmiResult = "정상";
		} else {
			bmiResult = "저체중";
		}
		return bmiResult ;
	}
	
	@Override
	public void regist(MemberBean member) {
		if(member instanceof DoctorBean){
			DoctorBean doctor = (DoctorBean)member;
			if(doctorCount == doctorList.length){
				DoctorBean[] temp = new DoctorBean[doctorCount+10];
				System.arraycopy(doctorList, 0, temp, 0, doctorCount);
				doctorList = temp;
				}
			doctorList[doctorCount++]= doctor;
		}else if(member instanceof NurseBean){
			NurseBean nurse = (NurseBean) member;
			if(nurseCount == nurseList.length){
				NurseBean[] temp = new NurseBean[nurseCount+10];
				System.arraycopy(doctorList, 0, temp, 0, nurseCount);
				nurseList = temp;
				}
			nurseList[nurseCount++]= nurse;
		}
	}
	@Override
	public MemberBean findById(MemberBean member) {
		MemberBean member2 = new MemberBean();
		if(member2 instanceof DoctorBean){
			for(int i=0;i<doctorCount;i++){
				if(member.getUid().equals(doctorList[i].getUid())){
					member= doctorList[i];
				}
			}
		}else if(member2 instanceof NurseBean){
			for(int i=0;i<nurseCount;i++){
				if(member.getUid().equals(nurseList[i].getUid())){
					member= nurseList[i];
				}
			}
		}
		return member2;
	}
	@Override
	public MemberBean[] findByName(MemberBean member) {
		MemberBean[] memberList = new MemberBean[countByName(member)];
		int ioi = 0;
		if(member instanceof DoctorBean){
			for(int i=0;i<doctorCount;i++){
				if(member.getName().equals(doctorList[i].getName())){
					memberList[ioi]= doctorList[i];
					ioi++;
				}
			}
		}else if(member instanceof NurseBean){
			for(int i=0;i<nurseCount;i++){
				if(member.getName().equals(nurseList[i].getName())){
					memberList[ioi]= nurseList[i];
					ioi++;
				}
			}
		}
		return memberList;
	}
	@Override
	public int countByName(MemberBean member) {
		int nameCount = 0;
		if(member instanceof DoctorBean){
			for(int i=0;i<doctorCount;i++){
				if(member.getName().equals(doctorList[i].getName())){
					nameCount++;
				}
			}
		}else if(member instanceof NurseBean){
			for(int i=0;i<nurseCount;i++){
				if(member.getName().equals(nurseList[i].getName())){
					nameCount++;
				}
			}
		}
		return nameCount;
	}
	@Override
	public DoctorBean[] doctorList() {
		return doctorList;
	}
	@Override
	public NurseBean[] nurseList() {
		return nurseList;
	}
	@Override
	public int count() {
		return 0;
	}
	@Override
	public int doctorCount() {
		return doctorCount;
	}
	@Override
	public int nurseCount() {
		return nurseCount;
	}
	@Override
	public void change(MemberBean member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(MemberBean member) {
		if(member instanceof DoctorBean){
			for(int i=0;i<doctorCount;i++){
				if(member.getUid().equals(doctorList[i].getUid())){
					doctorList[i] = doctorList[doctorCount-1];
					doctorList[doctorCount-1] = null;
					doctorCount--;
					break;
				}
			}
		}else if(member instanceof NurseBean){
			for(int i=0;i<nurseCount;i++){
				if(member.getUid().equals(nurseList[i].getUid())){
					nurseList[i] = nurseList[nurseCount-1];
					nurseList[nurseCount-1] = null;
					nurseCount--;
					break;
				}
			}
		}
	}
	@Override
	public boolean exist(MemberBean member) {
		boolean check = false;
		if(member instanceof DoctorBean){
			for(int i=0;i<doctorCount;i++){
				if(member.getUid().equals(doctorList[i].getUid())){
					check = true;
				}
			}
		}else if(member instanceof NurseBean){
			for(int i=0;i<nurseCount;i++){
				if(member.getUid().equals(nurseList[i].getUid())){
					check = true;
				}
			}
		}
		return check;
	}
}