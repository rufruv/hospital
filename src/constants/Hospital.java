package constants;

public class Hospital {
	public final static String HOSPITAL_NAME="한빛병원";
	public final static String DOC_SPEC = 
			"INPUT AS 의사ID, 담당진료과목, 성명, 주민번호, 전화번호, 이메일, 직급";
	public final static String NUR_SPEC = 
			"INPUT AS 간호사ID, 담당진료과목, 성명, 주민번호, 전화번호, 이메일, 직급";
	public final static String PAT_SPEC = 
			"INPUT AS 환자ID, 간호사ID, 의사ID, 성명, 주민번호, 전화번호, 주소, 이메일, 직업";
	public final static String BMI_SPEC = 
			"INPUT AS 몸무게, 키";
	public final static String EXE_OPTION = 
			"0.EXIT\n" 
		  + "1.REG-DOCTOR\n" 
		  + "2.REG-NURSE\n" 
		  + "3.REG-PATIENT\n" 
		  + "4.CHEK-BMI\n";

}
