package week1;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		Studentdao dao=new Studentdao();
		
		ArrayList <Student> list = dao.read();
		
		int total=dao.count(list);
		
		
		int maleCount = dao.countByGender(list, "��");
		int femaleCount = dao.countByGender(list, "Ů");
		
		ArrayList<Result > listResult =dao.statis(list);
		
		
		System.out.println("��������"+total);
		System.out.println(listResult);
		System.out.println("");
		System.out.println("ѧ������������ʡ�ݣ�");
		System.out.println("");
		System.out.println("");
	}
}
