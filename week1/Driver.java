package week1;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		Studentdao dao=new Studentdao();
		
		ArrayList <Student> list = dao.read();
		
		int total=dao.count(list);
		
		
		int maleCount = dao.countByGender(list, "男");
		int femaleCount = dao.countByGender(list, "女");
		
		ArrayList<Result > listResult =dao.statis(list);
		
		
		System.out.println("总人数："+total);
		System.out.println(listResult);
		System.out.println("");
		System.out.println("学生来自与以下省份：");
		System.out.println("");
		System.out.println("");
	}
}
