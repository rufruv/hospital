package serviceImpl;

import domain.MemberBean;
import domain.DoctorBean;
import domain.NurseBean;
import domain.PatientBean;
import service.AdminService;

public class AdminServiceImpl implements AdminService{
	MemberBean member;
	DoctorBean[] doctorList;
	NurseBean[] nurseList;
	int count;
	
	public AdminServiceImpl() {
		doctorList = new DoctorBean[count];
		nurseList = new NurseBean[count];
		count=0;
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public MemberBean findById(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberBean[] findByName(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DoctorBean[] doctorList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public NurseBean[] nurseList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void change(MemberBean member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(MemberBean member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean exist(MemberBean member) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int countByName(MemberBean member) {
		// TODO Auto-generated method stub
		return 0;
	}

}
