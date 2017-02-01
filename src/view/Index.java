package view;

import javax.swing.JOptionPane;
import enums.ButtIndex;
import controller.AdminController;
import controller.PatientController;

public class Index {
	public static void main(String[] args) {
		ButtIndex[] buttons = {ButtIndex.EXIT,ButtIndex.PATIENT,ButtIndex.ADMIN};

		ButtIndex select = (ButtIndex)JOptionPane.showInputDialog(
		null, // frame
		"INDEX PAGE",  // frame title
		"SELECT INDEX MENU",  // order
		JOptionPane.QUESTION_MESSAGE,  // type
		null,  // icon
		buttons, // Array of choice
		buttons[2] // default
		);
		
			switch(select){
			case EXIT: return;
			case PATIENT: new PatientController().start(); break;
			case ADMIN: new AdminController().start(); break;
			}
	}
}
