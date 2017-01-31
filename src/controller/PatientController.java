package controller;

import javax.swing.JOptionPane;

import constants.Hospital;
import domain.*;
import service.AdminService;
import serviceImpl.AdminServiceImpl;

public class PatientController {
	
	public void start() {
		AdminService service = new AdminServiceImpl();
		DoctorBean doc = null;
		NurseBean nur = null;
		PatientBean pat = null;
		while (true) {
			switch (JOptionPane.showInputDialog(Hospital.EXE_OPTION)){
			case "0": return;
			case "1":
				doc = new DoctorBean();
				String docInfo = JOptionPane.showInputDialog(Hospital.DOC_SPEC);
				String[] docInfoArr = docInfo.split(",");
				doc.setUid(docInfoArr[0]);
				//doc.setMajorTreat(docInfoArr[1]);
				//doc.setName(docInfoArr[2]);
				//doc.setSsn(docInfoArr[3]);
				//doc.setPhone(docInfoArr[4]);
				//doc.setEmail(docInfoArr[5]);
				//doc.setDocPosition(docInfoArr[6]);
				JOptionPane.showMessageDialog(null, doc.getUid());
				break;
			case "2":
				nur = new NurseBean();
				String nurInfo = JOptionPane.showInputDialog(Hospital.NUR_SPEC);
				String[] nurInfoArr = nurInfo.split(",");
				nur.setUid(nurInfoArr[0]);
				//nur.setMajorJob(nurInfoArr[1]);
				//nur.setName(nurInfoArr[2]);
				//nur.setSsn(nurInfoArr[3]);
				//nur.setPhone(nurInfoArr[4]);
				//nur.setEmail(nurInfoArr[5]);
				//nur.setNurPosition(nurInfoArr[6]);
				JOptionPane.showMessageDialog(null, nur.getUid());
				break;
			case "3":
				pat = new PatientBean();
				pat.setUid(JOptionPane.showInputDialog("ID?"));
				pat.getDocId();
				pat.getNurId();
				pat.setName(JOptionPane.showInputDialog("이름?"));
				JOptionPane.showMessageDialog(null, pat.toString());
				break;
			case "4":
				// 키와 몸무게를 입력하세요
				pat.setHeight(JOptionPane.showInputDialog("Weight?"));
				pat.setHeight(JOptionPane.showInputDialog("Height?"));
				JOptionPane.showMessageDialog(null, pat.getName()+":"+service.getBmi(pat));
				break;
			}
		}
	}
}