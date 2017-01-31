package controller;

import javax.swing.JOptionPane;

import domain.MemberBean;
import service.AdminService;
import serviceImpl.AdminServiceImpl;

public class AdminController {
	
	public void start(){
		MemberBean member = null;  
		AdminService service = new AdminServiceImpl(); // 다형성 (부모타입 참조변수로 자식타입의 인스턴스 생성)
		int i = 0;
		
		while(true){
			switch(JOptionPane.showInputDialog("0.종료 1.의사등록 2.간호사등록 3.ID검색 4.이름검색 "
											 + "5.목록조회  6.회원정보수정 7.삭제")){
			case "0": return;
			case "1": 
				member = new MemberBean(); 
				
				break;
			case "2": 
				break;
			case "3":
				break;
			case "4": 
				break;
			case "5": 
				break;
			case "6": 
				break;
			}
		}
	}
}
