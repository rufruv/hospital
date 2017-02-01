package controller;

import javax.swing.JOptionPane;

import enums.ButtAdmin;
import domain.*;
import service.AdminService;
import serviceImpl.AdminServiceImpl;

public class AdminController {
	public void start() {
		DoctorBean doctor = null;
		NurseBean nurse = null;
		AdminService service = new AdminServiceImpl();
		int i = 0;
		ButtAdmin[] buttons = {ButtAdmin.EXIT,
							   ButtAdmin.DOC_ADD,ButtAdmin.DOC_FIND_BY_ID,ButtAdmin.DOC_FIND_BY_NAME,ButtAdmin.DOC_LIST,
							   ButtAdmin.DOC_UPDATE,ButtAdmin.DOC_DELETE,
							   ButtAdmin.NUR_ADD,ButtAdmin.NUR_FIND_BY_ID,ButtAdmin.NUR_FIND_BY_NAME,ButtAdmin.NUR_LIST,
							   ButtAdmin.NUR_UPDATE,ButtAdmin.NUR_DELETE};
		while (true) {
			ButtAdmin select = (ButtAdmin)JOptionPane.showInputDialog(
					null, // frame
					"ADMIN PAGE",  // frame title
					"SELECT ADMIN MENU",  // order
					JOptionPane.QUESTION_MESSAGE,  // type
					null,  // icon
					buttons, // Array of choice
					buttons[1] // default
					);
					
			switch (select) {

			case EXIT:JOptionPane.showConfirmDialog(null, "EXIT OK?"); return;
			case DOC_ADD:
				doctor = new DoctorBean();
				String[] DocStrArr = JOptionPane.showInputDialog("Name, ID?").split(",");
				doctor.setName(DocStrArr[0]);
				doctor.setUid(DocStrArr[1]);
				service.regist(doctor);
				JOptionPane.showMessageDialog(null, "현재 회원수는"+ service.doctorCount()+"명입니다.");
				break;
			case DOC_FIND_BY_ID:
				doctor.setUid(JOptionPane.showInputDialog("ID를 입력하세요?"));
				if(service.exist(doctor)){
					JOptionPane.showMessageDialog(null, service.findById(doctor).toString());
				}else{
					JOptionPane.showMessageDialog(null, "해당하는 ID가 없습니다.");
				}
				break;
			case DOC_FIND_BY_NAME:
				break;
			case DOC_LIST:
				if(service.doctorCount()==0){
					JOptionPane.showMessageDialog(null, "해당의사가 존재하지 않습니다.");
				}else{
					DoctorBean[] docArr = service.doctorList();
					String docListResult = "";
					for(i=0;i<service.doctorCount();i++){
						docListResult = docArr[i].toString()+"\n";
					}
					JOptionPane.showMessageDialog(null, docListResult);
				}
				break;
			case DOC_UPDATE:
				break;
			case DOC_DELETE:
				break;
			case NUR_ADD:
				nurse = new NurseBean();
				String[] nurStrArr = JOptionPane.showInputDialog("Name, ID?").split(",");
				nurse.setName(nurStrArr[0]);
				nurse.setUid(nurStrArr[1]);
				service.regist(nurse);
				JOptionPane.showMessageDialog(null, "현재 회원수는"+ service.nurseCount()+"명입니다.");
				break;
			case NUR_FIND_BY_ID:
				break;
			case NUR_FIND_BY_NAME:
				break;
			case NUR_LIST:
				break;
			case NUR_UPDATE:
				break;
			case NUR_DELETE:
				break;
			}
		}
	}
}
