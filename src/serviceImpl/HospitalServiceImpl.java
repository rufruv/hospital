package serviceImpl;

import domain.PatientBean;
import service.HospitalService;

public class HospitalServiceImpl implements HospitalService{
	
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

}
