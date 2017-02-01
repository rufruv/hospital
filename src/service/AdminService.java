package service;

import domain.DoctorBean;
import domain.MemberBean;
import domain.NurseBean;
import domain.PatientBean;

public interface AdminService {
	public String getBmi(PatientBean pat);
	/**
	 * CREATE: INSERT 
	 */
	public void regist(MemberBean member);
	/**
	 * READ: SELECT
	 */
	public MemberBean findById(MemberBean member);
	public MemberBean[] findByName(MemberBean member);
	public DoctorBean[] doctorList();
	public NurseBean[] nurseList();
	public int count();
	public int doctorCount();
	public int nurseCount();
	/**
	 * UPDATE: UPDATE
	 */
	public void change(MemberBean member);
	/**
	 * DELETE: DELETE
	 */
	public void remove(MemberBean member);
	// util
	// validation
	public boolean exist(MemberBean member);
	public int countByName(MemberBean member);
}

